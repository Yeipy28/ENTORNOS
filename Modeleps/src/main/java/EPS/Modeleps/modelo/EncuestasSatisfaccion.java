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
@Table(name="EncuestasSatisfaccion")
public class EncuestasSatisfaccion {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id_encuesta;

@ManyToOne
@JoinColumn(name="id_afiliado")
private Afiliados id_afiliado;

@Temporal(TemporalType.DATE)
@Column(name = "fecha_encuesta")
private Date fecha_encuesta;

@Column(name = "calificacion_servicios")
private long calificacion_servicios;

@Column(name = "comentarios")
private String comentarios;

public EncuestasSatisfaccion(Long id_encuesta, Afiliados id_afiliado, Date fecha_encuesta, long calificacion_servicios,
        String comentarios) {
    this.id_encuesta = id_encuesta;
    this.id_afiliado = id_afiliado;
    this.fecha_encuesta = fecha_encuesta;
    this.calificacion_servicios = calificacion_servicios;
    this.comentarios = comentarios;
}

public EncuestasSatisfaccion() {
}

public Long getId_encuesta() {
    return id_encuesta;
}

public void setId_encuesta(Long id_encuesta) {
    this.id_encuesta = id_encuesta;
}

public Afiliados getId_afiliado() {
    return id_afiliado;
}

public void setId_afiliado(Afiliados id_afiliado) {
    this.id_afiliado = id_afiliado;
}

public Date getFecha_encuesta() {
    return fecha_encuesta;
}

public void setFecha_encuesta(Date fecha_encuesta) {
    this.fecha_encuesta = fecha_encuesta;
}

public long getCalificacion_servicios() {
    return calificacion_servicios;
}

public void setCalificacion_servicios(long calificacion_servicios) {
    this.calificacion_servicios = calificacion_servicios;
}

public String getComentarios() {
    return comentarios;
}

public void setComentarios(String comentarios) {
    this.comentarios = comentarios;
}

}
