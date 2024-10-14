package EPS.Modeleps.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "login")
public class Login {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_login;

    @OneToOne
    @JoinColumn(name="cedula", referencedColumnName = "numero_identificacion")
    private Afiliados cedula;

    @Column(name = "contraseña")
    private String contraseña;

    public Login(Long id_login, Afiliados cedula, String contraseña) {
        this.id_login = id_login;
        this.cedula = cedula;
        this.contraseña = contraseña;
    }

    public Login() {
    }

    public Long getId_login() {
        return id_login;
    }

    public void setId_login(Long id_login) {
        this.id_login = id_login;
    }

    public Afiliados getCedula() {
        return cedula;
    }

    public void setCedula(Afiliados cedula) {
        this.cedula = cedula;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
}
