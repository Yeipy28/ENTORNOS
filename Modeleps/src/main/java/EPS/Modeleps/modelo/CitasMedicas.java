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
@Table(name="CitasMedicas")
public class CitasMedicas {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "id_cita")
private Long id_cita;

@ManyToOne
@JoinColumn(name="id_afiliado")
private Afiliados id_afiliado;

@ManyToOne
@JoinColumn(name="id_ips")
private Ips id_ips;

@ManyToOne
@JoinColumn(name="medico_id")
private Medico medico_id;

@Temporal(TemporalType.DATE)
@Column(name = "fecha_cita")
private Date fecha_cita;

@Temporal(TemporalType.DATE)
@Column(name = "hora_cita")
private Date hora_cita;

@Column(name = "especialidad")
private String especialidad;

@Column(name = "estado_cita")
private String estado_cita;

public CitasMedicas(Long id_cita, Afiliados id_afiliado, Ips id_ips, Medico medico_id, Date fecha_cita, Date hora_cita,
        String especialidad, String estado_cita) {
    this.id_cita = id_cita;
    this.id_afiliado = id_afiliado;
    this.id_ips = id_ips;
    this.medico_id = medico_id;
    this.fecha_cita = fecha_cita;
    this.hora_cita = hora_cita;
    this.especialidad = especialidad;
    this.estado_cita = estado_cita;
}

public CitasMedicas() {
}

public Long getId_cita() {
    return id_cita;
}

public void setId_cita(Long id_cita) {
    this.id_cita = id_cita;
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

public Medico getId() {
    return medico_id;
}

public void setId(Medico medico_id) {
    this.medico_id = medico_id;
}

public Date getFecha_cita() {
    return fecha_cita;
}

public void setFecha_cita(Date fecha_cita) {
    this.fecha_cita = fecha_cita;
}

public Date getHora_cita() {
    return hora_cita;
}

public void setHora_cita(Date hora_cita) {
    this.hora_cita = hora_cita;
}

public String getEspecialidad() {
    return especialidad;
}

public void setEspecialidad(String especialidad) {
    this.especialidad = especialidad;
}

public String getEstado_cita() {
    return estado_cita;
}

public void setEstado_cita(String estado_cita) {
    this.estado_cita = estado_cita;
}



}
