package EPS.Modeleps.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Medico")
public class Medico {

@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "apellidos")
private String apellidos;

@Column(name = "direccion")
private String direccion;

@Column(name = "email")
private String email;

@Column(name = "nombres")
private String nombres;

@Column(name = "telefono")
private String telefono;

public Medico(Long id, String apellidos, String direccion, String email, String nombres, String telefono) {
    this.id = id;
    this.apellidos = apellidos;
    this.direccion = direccion;
    this.email = email;
    this.nombres = nombres;
    this.telefono = telefono;
}

public Medico() {
}

public Long getId() {
    return id;
}

public void setId(Long id) {
    this.id = id;
}

public String getApellidos() {
    return apellidos;
}

public void setApellidos(String apellidos) {
    this.apellidos = apellidos;
}

public String getDireccion() {
    return direccion;
}

public void setDireccion(String direccion) {
    this.direccion = direccion;
}

public String getEmail() {
    return email;
}

public void setEmail(String email) {
    this.email = email;
}

public String getNombres() {
    return nombres;
}

public void setNombres(String nombres) {
    this.nombres = nombres;
}

public String getTelefono() {
    return telefono;
}

public void setTelefono(String telefono) {
    this.telefono = telefono;
}
}
