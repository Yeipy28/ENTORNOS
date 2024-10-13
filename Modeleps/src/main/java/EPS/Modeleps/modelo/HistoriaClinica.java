package EPS.Modeleps.modelo;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name="HistoriaClinica")
public class HistoriaClinica {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_historia;

    @ManyToOne
    @JoinColumn(name="id_afiliado")
    private Afiliados id_afiliado;

    @ManyToOne
    @JoinColumn(name="id_cita")
    private CitasMedicas id_cita;

    @Temporal(TemporalType.DATE)
    @Column(name = "fecha_registro")
    private Date fecha_registro;

    @Column(name = "diagnostico")
    private String diagnostico;

    @Column(name = "tratamiento")
    private String tratamiento;

    @Column(name = "notas_medicas")
    private String notas_medicas;

    public HistoriaClinica(Long id_historia, Afiliados id_afiliado, CitasMedicas id_cita, Date fecha_registro,
            String diagnostico, String tratamiento, String notas_medicas) {
        this.id_historia = id_historia;
        this.id_afiliado = id_afiliado;
        this.id_cita = id_cita;
        this.fecha_registro = fecha_registro;
        this.diagnostico = diagnostico;
        this.tratamiento = tratamiento;
        this.notas_medicas = notas_medicas;
    }

    public HistoriaClinica() {
    }

    public Long getId_historia() {
        return id_historia;
    }

    public void setId_historia(Long id_historia) {
        this.id_historia = id_historia;
    }

    public Afiliados getId_afiliado() {
        return id_afiliado;
    }

    public void setId_afiliado(Afiliados id_afiliado) {
        this.id_afiliado = id_afiliado;
    }

    public CitasMedicas getId_cita() {
        return id_cita;
    }

    public void setId_cita(CitasMedicas id_cita) {
        this.id_cita = id_cita;
    }

    public Date getFecha_registro() {
        return fecha_registro;
    }

    public void setFecha_registro(Date fecha_registro) {
        this.fecha_registro = fecha_registro;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(String tratamiento) {
        this.tratamiento = tratamiento;
    }

    public String getNotas_medicas() {
        return notas_medicas;
    }

    public void setNotas_medicas(String notas_medicas) {
        this.notas_medicas = notas_medicas;
    }

}
