
package com.mycompany.concecionaria.persistencia;

import com.mycompany.concecionaria.logica.Auto;
import com.mycompany.concecionaria.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladoraPersistencia {
    
    AutoJpaController autoJpa = new AutoJpaController();

    public void crearAuto(Auto auto) {
        autoJpa.create(auto);
    }

    public List<Auto> traerAutos() {
        return autoJpa.findAutoEntities();
    }

    public void borrarAuto(int id) {
        try {
            autoJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Auto traerAuto(int id) {
        return autoJpa.findAuto(id);
    }

    public void editarAutomovil(Auto auto) {
        try {
            autoJpa.edit(auto);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
}
