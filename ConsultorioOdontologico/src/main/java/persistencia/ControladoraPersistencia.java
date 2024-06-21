
package persistencia;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import logica.Odontologo;
import logica.Usuario;
import persistencia.exceptions.NonexistentEntityException;

public class ControladoraPersistencia {
    
    HorarioJpaController horJpa = new HorarioJpaController();
    OdontologoJpaController odoJpa = new OdontologoJpaController();
    PacienteJpaController pacienJpa = new PacienteJpaController();
    PersonaJpaController perJpa = new PersonaJpaController();
    ResponsableJpaController responJpa = new ResponsableJpaController();
    SecretarioJpaController secreJpa = new SecretarioJpaController();
    TurnoJpaController TurnoJpa = new TurnoJpaController();
    UsuarioJpaController usuJpa = new UsuarioJpaController();

    public void crearUsuario(Usuario usu) {
        usuJpa.create(usu);
        
    }

    public List<Usuario> getUsuarios() {
       return usuJpa.findUsuarioEntities();
    }

    public void borrarUsuario(int id) {
        try {
            usuJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Usuario traerUsuario(int id) {
        return usuJpa.findUsuario(id);
    }

    public void editarUsuario(Usuario usu) {
        try {
            usuJpa.edit(usu);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void crearOdontologo(Odontologo odonto) {
        odoJpa.create(odonto);
    }

    public List<Odontologo> getOdontologos() {
        return odoJpa.findOdontologoEntities();
    }

    public void borrarOdontologo(int id) {
        try {
            odoJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Odontologo traerOdontologo(int id) {
        return odoJpa.findOdontologo(id);
    }

    public void editarOdontologo(Odontologo odo) {
        try {
            odoJpa.edit(odo);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
