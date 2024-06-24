
package servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import logica.ControladoraLogica;
import logica.Paciente;

@WebServlet(name = "SvPacientes", urlPatterns = {"/SvPacientes"})
public class SvPacientes extends HttpServlet {

    ControladoraLogica control = new ControladoraLogica();
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        List<Paciente>listaPacientes = new ArrayList<Paciente>();
        listaPacientes = control.getPacientes();
        
        HttpSession miSesion = request.getSession();
        miSesion.setAttribute("listaPacientes", listaPacientes);
        
        response.sendRedirect("verPacientes.jsp");
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
        String tipo_sangre = request.getParameter("tipo_sangre");
        
        control.crearPaciente(dni,nombre,apellido,telefono,direccion,fecha_nac,tiene_os,tipo_sangre);
        
        response.sendRedirect("index.jsp");
        
    }

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
