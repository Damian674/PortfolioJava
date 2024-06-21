
package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import logica.ControladoraLogica;
import logica.Odontologo;


@WebServlet(name = "SvEditOdontologos", urlPatterns = {"/SvEditOdontologos"})
public class SvEditOdontologos extends HttpServlet {

    ControladoraLogica control = new ControladoraLogica();
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        Odontologo odonto = control.traerOdontologo(id);
        
        HttpSession miSesion = request.getSession();
        miSesion.setAttribute("odoEditar", odonto);
        
        response.sendRedirect("editarOdontologo.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String dni = request.getParameter("dni");
        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");
        String telefono = request.getParameter("telefono");
        String direccion = request.getParameter("direccion");
        String fecha_nac = request.getParameter("fecha_nac");
        String especialidad = request.getParameter("especialidad");
        
        Odontologo odo = (Odontologo) request.getSession().getAttribute("odoEditar");
        odo.setDni(dni);
        odo.setNombre(nombre);
        odo.setApellido(apellido);
        odo.setTelefono(telefono);
        odo.setDireccion(direccion);
        odo.setFecha_nac(fecha_nac);
        odo.setEspecialidad(especialidad);
        
        control.editarOdontologo(odo);
        
        response.sendRedirect("SvAltaOdontologos");
        
        
    }

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
