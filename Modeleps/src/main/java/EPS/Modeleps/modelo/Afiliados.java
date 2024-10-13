package EPS.Modeleps.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

import java.util.Date;

@Entity
@Table(name = "Afiliados")
public class Afiliados {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_afiliado;
    
    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Column(name = "tipo_identificacion")
    private String tipo_identificacion;
    
    @Column(name = "numero_identificacion", nullable = false, unique = true)
    private String numero_identificacion;
    
    @Temporal(TemporalType.DATE)
    @Column(name = "fecha_nacimiento")
    private Date fecha_nacimiento;
    
    @Column(name = "sexo", nullable = false)
    private String sexo;
    
    @Column(name = "direccion")
    private String direccion;
    
    @Column(name = "telefono")
    private String telefono;
    
    @Column(name = "email", unique = true)
    private String email;
    
    @Temporal(TemporalType.DATE)
    @Column(name = "fecha_afiliacion")
    private Date fecha_afiliacion;
    
    @Column(name = "plan_salud", nullable = false)
    private String plan_salud;
    
    @Column(name = "estado_afiliacion", nullable = false)
    private String estado_afiliacion;

    // Getters and setters

    public Long getId_afiliado() {
        return id_afiliado;
    }

    public Afiliados(Long id_afiliado, String nombre, String tipo_identificacion, String numero_identificacion,
            Date fecha_nacimiento, String sexo, String direccion, String telefono, String email, Date fecha_afiliacion,
            String plan_salud, String estado_afiliacion) {
        this.id_afiliado = id_afiliado;
        this.nombre = nombre;
        this.tipo_identificacion = tipo_identificacion;
        this.numero_identificacion = numero_identificacion;
        this.fecha_nacimiento = fecha_nacimiento;
        this.sexo = sexo;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
        this.fecha_afiliacion = fecha_afiliacion;
        this.plan_salud = plan_salud;
        this.estado_afiliacion = estado_afiliacion;
    }
    public Afiliados() {
    }
    public void setId_afiliado(Long id_afiliado) {
        this.id_afiliado = id_afiliado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumero_identificacion() {
        return numero_identificacion;
    }

    public void setNumero_identificacion(String numero_identificacion) {
        this.numero_identificacion = numero_identificacion;
    }

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getFecha_afiliacion() {
        return fecha_afiliacion;
    }

    public void setFecha_afiliacion(Date fecha_afiliacion) {
        this.fecha_afiliacion = fecha_afiliacion;
    }

    public String getPlan_salud() {
        return plan_salud;
    }

    public void setPlan_salud(String plan_salud) {
        this.plan_salud = plan_salud;
    }

    public String getEstado_afiliacion() {
        return estado_afiliacion;
    }

    public void setEstado_afiliacion(String estado_afiliacion) {
        this.estado_afiliacion = estado_afiliacion;
    }
    public String getTipo_identificacion() {
        return tipo_identificacion;
    }
    public void setTipo_identificacion(String tipo_identificacion) {
        this.tipo_identificacion = tipo_identificacion;
    }
}

