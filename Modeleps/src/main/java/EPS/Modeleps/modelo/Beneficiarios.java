package EPS.Modeleps.modelo;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name="Beneficiarios")
public class Beneficiarios {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id_beneficiario;


@ManyToOne
@JoinColumn(name="id_afiliado")
private Afiliados id_afiliado;

@Column(name = "nombre")
private String nombre;

@Temporal(TemporalType.DATE)
@Column(name = "fecha_nacimiento")
private Date fecha_nacimiento;

@Column(name = "relacion")
private String relacion;

@Column(name = "tipo_afiliacion")
private String tipo_afiliacion;

public Beneficiarios(Long id_beneficiario, Afiliados id_afiliado, String nombre, Date fecha_nacimiento, String relacion,
        String tipo_afiliacion) {
    this.id_beneficiario = id_beneficiario;
    this.id_afiliado = id_afiliado;
    this.nombre = nombre;
    this.fecha_nacimiento = fecha_nacimiento;
    this.relacion = relacion;
    this.tipo_afiliacion = tipo_afiliacion;
}

public Beneficiarios() {
}

public Long getId_beneficiario() {
    return id_beneficiario;
}

public void setId_beneficiario(Long id_beneficiario) {
    this.id_beneficiario = id_beneficiario;
}

public Afiliados getId_afiliado() {
    return id_afiliado;
}

public void setId_afiliado(Afiliados id_afiliado) {
    this.id_afiliado = id_afiliado;
}

public String getNombre() {
    return nombre;
}

public void setNombre(String nombre) {
    this.nombre = nombre;
}

public Date getFecha_nacimiento() {
    return fecha_nacimiento;
}

public void setFecha_nacimiento(Date fecha_nacimiento) {
    this.fecha_nacimiento = fecha_nacimiento;
}

public String getRelacion() {
    return relacion;
}

public void setRelacion(String relacion) {
    this.relacion = relacion;
}

public String getTipo_afiliacion() {
    return tipo_afiliacion;
}

public void setTipo_afiliacion(String tipo_afiliacion) {
    this.tipo_afiliacion = tipo_afiliacion;
}

}
