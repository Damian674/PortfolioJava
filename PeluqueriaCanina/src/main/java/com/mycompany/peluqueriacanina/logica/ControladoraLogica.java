
package com.mycompany.peluqueriacanina.logica;

import com.mycompany.peluqueriacanina.persistencia.ControladoraPersistencia;
import java.util.List;

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

    public List<Mascotas> traerMascotas() {
        return controlPersis.traerMascotas();
    }

    public void borrarMascota(int num_cliente) {
        controlPersis.borrarMascota(num_cliente);
    }

    public Mascotas traerMascota(int num_cliente) {
        return controlPersis.traerMascota(num_cliente);
    }

    public void modificarMascota(Mascotas masco, String nombreMasco, String raza, String color, 
            String alergico, String ateEsp, String observaciones, String nombreDuenio, String celDuenio) {
        masco.setNombre_perro(nombreMasco);
        masco.setRaza(raza);
        masco.setColor(color);
        masco.setAlergico(alergico);
        masco.setAtencion_especial(ateEsp);
        masco.setObservaciones(observaciones);
        
        //modifico mascota
        controlPersis.modificarMascota(masco);
        
        //seteo nuevo valores al dueño
        Duenio duenio = this.buscarDuenio(masco.getDuenio().getId_duenio());
        duenio.setCelular(celDuenio);
        duenio.setNombre(nombreDuenio);
        
        //llamar al modificador del dueño
        this.modificarDuenio(duenio);
        
    }

    private Duenio buscarDuenio(int id_duenio) {
       return controlPersis.traerDuenio(id_duenio);
    }

    private void modificarDuenio(Duenio duenio) {
        controlPersis.modificarDuenio(duenio);
    }
    
    
    
    
}
