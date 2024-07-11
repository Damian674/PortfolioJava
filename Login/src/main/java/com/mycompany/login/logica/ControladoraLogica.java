
package com.mycompany.login.logica;

import com.mycompany.login.persistencia.ControladoraPersistencia;
import java.util.List;

public class ControladoraLogica {
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public Usuario validarUsuario(String usuario, String contrasenia) {
        
        Usuario user = null;
        //String mensaje = "";
        List<Usuario> listaUsuarios = controlPersis.traerUsuarios();
        
        for(Usuario usu : listaUsuarios){
            if(usu.getNombreUsuario().equals(usuario)){
                if(usu.getContrasenia().equals(contrasenia)){
                    //mensaje = "Usuario y contraseña correctos. Bienvenido!";
                    user = usu;
                    return user;
                }
                else{
                    //mensaje = "Usuario y/o contraseña incorrectos";
                    user = null;
                    return user;
                }
            }
            else{
                //mensaje = "Usuario no encontrado";
                user = null;
                
            }
        }
        return user;
    }

    
    
}
