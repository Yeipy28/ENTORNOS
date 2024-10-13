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
@Table(name="Facturacion")
public class Facturacion {

@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_factura;

    @ManyToOne
    @JoinColumn(name="id_afiliado")
    private Afiliados id_afiliado;

    @ManyToOne
    @JoinColumn(name="id_ips")
    private Ips id_ips;

    @Temporal(TemporalType.DATE)
    @Column(name = "fecha_emision")
    private Date fecha_emision;

    @Column(name = "servicios_prestados")
    private String servicios_prestados;

    @Column(name = "monto_total")
    private long monto_total;

    @Column(name = "estado_factura")
    private String estado_factura;

    public Facturacion(Long id_factura, Afiliados id_afiliado, Ips id_ips, Date fecha_emision,
            String servicios_prestados, long monto_total, String estado_factura) {
        this.id_factura = id_factura;
        this.id_afiliado = id_afiliado;
        this.id_ips = id_ips;
        this.fecha_emision = fecha_emision;
        this.servicios_prestados = servicios_prestados;
        this.monto_total = monto_total;
        this.estado_factura = estado_factura;
    }

    public Facturacion() {
    }

    public Long getId_factura() {
        return id_factura;
    }

    public void setId_factura(Long id_factura) {
        this.id_factura = id_factura;
    }

    public Afiliados getId_afiliado() {
        return id_afiliado;
    }

    public void setId_afiliado(Afiliados id_afiliado) {
        this.id_afiliado = id_afiliado;
    }

    public Ips getId_ips() {
        return id_ips;
    }

    public void setId_ips(Ips id_ips) {
        this.id_ips = id_ips;
    }

    public Date getFecha_emision() {
        return fecha_emision;
    }

    public void setFecha_emision(Date fecha_emision) {
        this.fecha_emision = fecha_emision;
    }

    public String getServicios_prestados() {
        return servicios_prestados;
    }

    public void setServicios_prestados(String servicios_prestados) {
        this.servicios_prestados = servicios_prestados;
    }

    public long getMonto_total() {
        return monto_total;
    }

    public void setMonto_total(long monto_total) {
        this.monto_total = monto_total;
    }

    public String getEstado_factura() {
        return estado_factura;
    }

    public void setEstado_factura(String estado_factura) {
        this.estado_factura = estado_factura;
    }

}
