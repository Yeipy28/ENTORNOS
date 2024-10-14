package EPS.Modeleps.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import EPS.Modeleps.modelo.Login;
import EPS.Modeleps.repositorios.LoginRepositorio;
import jakarta.transaction.Transactional;
import java.util.ArrayList;

@Service
@Transactional
public class LoginServicio {
    @Autowired
    LoginRepositorio loginRepositorio;

    public ArrayList<Login> getLogin(){
        return (ArrayList<Login>) loginRepositorio.findAll();
    }

    public Login nuevoLogin(Login login){
        return loginRepositorio.save(login);
    }

    public Login buscarLogin(Long id){
        Login login = null;
        login = loginRepositorio.findById(id).orElse(null);
        if(login == null){
            return null;
        } return login;
    }

    public int borrarLogin(Long id){
        loginRepositorio.deleteById(id);
        return 1;
    }

}
