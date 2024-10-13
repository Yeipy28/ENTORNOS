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
@Table(name="Autorizaciones")
public class Autorizacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_autorizacion;
    
    @ManyToOne
    @JoinColumn(name="id_afiliado")
    private Afiliados id_afiliado;

    @Temporal(TemporalType.DATE)
    @Column(name = "fecha_solicitud")
    private Date fecha_solicitud;

    @Column(name = "estado_autorizacion")
    private String estado_autorizado;
    
    @Column(name = "motivo_solicitud")
    private String motivo_solicitud;


        // Getters and setters

    public Autorizacion(Long id_autorizacion, Afiliados id_afiliado, Date fecha_solicitud, String estado_autorizado,
            String motivo_solicitud) {
        this.id_autorizacion = id_autorizacion;
        this.id_afiliado = id_afiliado;
        this.fecha_solicitud = fecha_solicitud;
        this.estado_autorizado = estado_autorizado;
        this.motivo_solicitud = motivo_solicitud;
    }

    public Autorizacion() {
    }

    public Long getId_autorizacion() {
        return id_autorizacion;
    }

    public void setId_autorizacion(Long id_autorizacion) {
        this.id_autorizacion = id_autorizacion;
    }

    public Afiliados getId_afiliado() {
        return id_afiliado;
    }

    public void setId_afiliado(Afiliados id_afiliado) {
        this.id_afiliado = id_afiliado;
    }

    public Date getFecha_solicitud() {
        return fecha_solicitud;
    }

    public void setFecha_solicitud(Date fecha_solicitud) {
        this.fecha_solicitud = fecha_solicitud;
    }

    public String getEstado_autorizado() {
        return estado_autorizado;
    }

    public void setEstado_autorizado(String estado_autorizado) {
        this.estado_autorizado = estado_autorizado;
    }

    public String getMotivo_solicitud() {
        return motivo_solicitud;
    }

    public void setMotivo_solicitud(String motivo_solicitud) {
        this.motivo_solicitud = motivo_solicitud;
    }

}
