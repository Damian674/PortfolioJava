
package com.mycompany.concecionaria.persistencia;

import com.mycompany.concecionaria.logica.Auto;

public class ControladoraPersistencia {
    
    AutoJpaController autoJpa = new AutoJpaController();

    public void crearAuto(Auto auto) {
        autoJpa.create(auto);
    }
    
    
}
