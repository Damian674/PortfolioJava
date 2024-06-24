
package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import logica.ControladoraLogica;
import logica.Paciente;

@WebServlet(name = "SvEditPacientes", urlPatterns = {"/SvEditPacientes"})
public class SvEditPacientes extends HttpServlet {
    
    ControladoraLogica control = new ControladoraLogica();
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
    }

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        int id = Integer.parseInt(request.getParameter("id"));
        Paciente pacien = control.traerPaciente(id);
        
        HttpSession miSesion = request.getSession();
        miSesion.setAttribute("pacienEditar", pacien);
        
        response.sendRedirect("editarPacientes.jsp");
        
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
        String tiene_os = request.getParameter("tiene_os");
        String tipo_sange = request.getParameter("tipo_sangre");
        
        Paciente pacien = (Paciente) request.getSession().getAttribute("pacienEditar");
        pacien.setDni(dni);
        pacien.setNombre(nombre);
        pacien.setApellido(apellido);
        pacien.setTelefono(telefono);
        pacien.setDireccion(direccion);
        pacien.setFecha_nac(fecha_nac);
        pacien.setTiene_OS(tiene_os);
        pacien.setTipoSangre(tipo_sange);
        
        control.editarPaciente(pacien);
        
        response.sendRedirect("SvPacientes");
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
