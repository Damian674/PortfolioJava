
package com.mycompany.login.logica;

import com.mycompany.login.persistencia.ControladoraPersistencia;
import java.util.List;

public class ControladoraLogica {
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public String validarUsuario(String usuario, String contrasenia) {
        String mensaje = "";
        List<Usuario> listaUsuarios = controlPersis.traerUsuarios();
        
        for(Usuario usu : listaUsuarios){
            if(usu.getNombreUsuario().equals(usuario)){
                if(usu.getContraseña().equals(contrasenia)){
                    mensaje = "Usuario y contraseña correctos. Bienvenido!";
                    return mensaje;
                }
                else{
                    mensaje = "Usuario y/o contraseña incorrectos";
                    return mensaje;
                }
            }
            else{
                mensaje = "Usuario no encontrado";
                
            }
        }
        return mensaje;
    }

    
    
}
