package EPS.Modeleps.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "IPS")
public class Ips {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_ips;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "direccion")
    private String direccion;

    @Column(name="telefono")
    private String telefono;

    @Column(name = "especialidades")
    private String especialidades;

    @Column(name = "horario_atencion")
    private String horario_atencion;

    @Column(name = "contacto_referencia")
    private String contacto_referencia;

    public Ips(Long id_ips, String nombre, String direccion, String telefono, String especialidades,
            String horario_atencion, String contacto_referencia) {
        this.id_ips = id_ips;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.especialidades = especialidades;
        this.horario_atencion = horario_atencion;
        this.contacto_referencia = contacto_referencia;
    }

    public Ips() {
    }

    public Long getId_ips() {
        return id_ips;
    }

    public void setId_ips(Long id_ips) {
        this.id_ips = id_ips;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEspecialidades() {
        return especialidades;
    }

    public void setEspecialidades(String especialidades) {
        this.especialidades = especialidades;
    }

    public String getHorario_atencion() {
        return horario_atencion;
    }

    public void setHorario_atencion(String horario_atencion) {
        this.horario_atencion = horario_atencion;
    }

    public String getContacto_referencia() {
        return contacto_referencia;
    }

    public void setContacto_referencia(String contacto_referencia) {
        this.contacto_referencia = contacto_referencia;
    }

}
