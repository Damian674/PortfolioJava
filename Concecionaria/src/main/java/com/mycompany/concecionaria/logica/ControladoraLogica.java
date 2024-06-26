
package com.mycompany.concecionaria.logica;
import com.mycompany.concecionaria.persistencia.ControladoraPersistencia;

public class ControladoraLogica {
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public void crearAuto(String marca, String modelo, String color, String motor, String patente, int puertas) {
        Auto auto = new Auto();
        auto.setMarca(marca);
        auto.setModelo(modelo);
        auto.setColor(color);
        auto.setMotor(motor);
        auto.setPatente(patente);
        auto.setCantidad_puertas(puertas);
        
        controlPersis.crearAuto(auto);
        
    }
    
    
}
