
package logica;

import java.util.Date;
import java.util.List;

public class Odontologo extends Persona{
    
    //Atributos propios
    //private int id_odontologo;
    private String especialidad;
    
    //relacion 1 a 1 con Usuario
    private Usuario unUsuario;
    //relacion 1 a n con Turno
    private List<Turno> listaTurnos;
    //relacion 1 a 1 con Horario
    private Horario unHorario;

    public Odontologo() {
    }

    public Odontologo(String especialidad, Usuario unUsuario, List<Turno> listaTurnos, Horario unHorario, String dni, String nombre, String apellido, String telefono, String direccion, Date fecha_nac) {
        super(dni, nombre, apellido, telefono, direccion, fecha_nac);
        this.especialidad = especialidad;
        this.unUsuario = unUsuario;
        this.listaTurnos = listaTurnos;
        this.unHorario = unHorario;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public Usuario getUnUsuario() {
        return unUsuario;
    }

    public void setUnUsuario(Usuario unUsuario) {
        this.unUsuario = unUsuario;
    }

    public List<Turno> getListaTurnos() {
        return listaTurnos;
    }

    public void setListaTurnos(List<Turno> listaTurnos) {
        this.listaTurnos = listaTurnos;
    }

    public Horario getUnHorario() {
        return unHorario;
    }

    public void setUnHorario(Horario unHorario) {
        this.unHorario = unHorario;
    }
    
    
    
}
