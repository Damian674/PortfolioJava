
package com.mycompany.peluqueriacanina.persistencia;

import com.mycompany.peluqueriacanina.logica.Duenio;
import com.mycompany.peluqueriacanina.logica.Mascotas;
import com.mycompany.peluqueriacanina.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladoraPersistencia {
    
    DuenioJpaController dueJpa = new DuenioJpaController();
    MascotasJpaController mascoJpa = new MascotasJpaController();

    public void guardar(Duenio duenio, Mascotas masco) {
        
        //Crear en la bd al dueño
        dueJpa.create(duenio);
        
        //crear en la bd a la mascota
        mascoJpa.create(masco);
        
    }

    public List<Mascotas> traerMascotas() {
        return mascoJpa.findMascotasEntities();
    }

    public void borrarMascota(int num_cliente) {
        try {
            mascoJpa.destroy(num_cliente);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Mascotas traerMascota(int num_cliente) {
        return mascoJpa.findMascotas(num_cliente);
    }

    public void modificarMascota(Mascotas masco) {
        try {
            mascoJpa.edit(masco);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Duenio traerDuenio(int id_duenio) {
        return dueJpa.findDuenio(id_duenio);
    }

    public void modificarDuenio(Duenio duenio) {
        try {
            dueJpa.edit(duenio);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
