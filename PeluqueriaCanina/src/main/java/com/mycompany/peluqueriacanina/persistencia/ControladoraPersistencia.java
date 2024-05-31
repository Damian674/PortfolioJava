
package com.mycompany.peluqueriacanina.persistencia;

import com.mycompany.peluqueriacanina.logica.Duenio;
import com.mycompany.peluqueriacanina.logica.Mascotas;

public class ControladoraPersistencia {
    
    DuenioJpaController dueJpa = new DuenioJpaController();
    MascotasJpaController mascoJpa = new MascotasJpaController();

    public void guardar(Duenio duenio, Mascotas masco) {
        
        //Crear en la bd al dueño
        dueJpa.create(duenio);
        
        //crear en la bd a la mascota
        mascoJpa.create(masco);
        
    }
    
}
