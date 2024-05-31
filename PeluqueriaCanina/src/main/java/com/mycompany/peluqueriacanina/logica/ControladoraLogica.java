
package com.mycompany.peluqueriacanina.logica;

import com.mycompany.peluqueriacanina.persistencia.ControladoraPersistencia;

public class ControladoraLogica {
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public void guardar(String nombreMasco, String raza, String color, 
            String alergico, String ateEsp, String observaciones, 
            String nombreDuenio, String celDuenio) {
        
        //Creamos el dueño y le asignamos valores
        Duenio duenio = new Duenio();
        duenio.setNombre(nombreDuenio);
        duenio.setCelular(celDuenio);
        
        //Creamos la mascota y le asignamos valores
        Mascotas masco = new Mascotas();
        masco.setNombre_perro(nombreMasco);
        masco.setRaza(raza);
        masco.setColor(color);
        masco.setAlergico(alergico);
        masco.setAtencion_especial(ateEsp);
        masco.setObservaciones(observaciones);
        masco.setDuenio(duenio);
        
        controlPersis.guardar(duenio,masco);
        
        
        
    }
    
    
    
    
}
