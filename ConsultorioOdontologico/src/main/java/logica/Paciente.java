
package logica;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class Paciente extends Persona implements Serializable{
    
    //atributos propios del paciente
    //private int id_paciente;
    private String tiene_OS;
    private String tipoSangre;
    
    
    //relacion 1 a n con Turno
    @OneToMany(mappedBy = "pacien")
    private List<Turno> listaTurnos;

    public Paciente() {
    }

    public Paciente(String tiene_OS, String tipoSangre, List<Turno> listaTurnos, int id, String dni, String nombre, String apellido, String telefono, String direccion, String fecha_nac) {
        super(id, dni, nombre, apellido, telefono, direccion, fecha_nac);
        this.tiene_OS = tiene_OS;
        this.tipoSangre = tipoSangre;
        this.listaTurnos = listaTurnos;
    }

    public String getTiene_OS() {
        return tiene_OS;
    }

    public void setTiene_OS(String tiene_OS) {
        this.tiene_OS = tiene_OS;
    }

    

    public String getTipoSangre() {
        return tipoSangre;
    }

    public void setTipoSangre(String tipoSangre) {
        this.tipoSangre = tipoSangre;
    }
    
    public List<Turno> getListaTurnos() {
        return listaTurnos;
    }

    public void setListaTurnos(List<Turno> listaTurnos) {
        this.listaTurnos = listaTurnos;
    }

    
}
