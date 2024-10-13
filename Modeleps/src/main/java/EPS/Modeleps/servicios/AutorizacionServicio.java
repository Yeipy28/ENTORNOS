package EPS.Modeleps.servicios;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import EPS.Modeleps.modelo.Autorizacion;
import EPS.Modeleps.repositorios.AutorizacionRepositorio;
import jakarta.transaction.Transactional;

@Service
@Transactional
public class AutorizacionServicio {
    @Autowired
    AutorizacionRepositorio autorizacionRepositorio;

    public ArrayList<Autorizacion> getAutorizaciones(){
        return (ArrayList<Autorizacion>) autorizacionRepositorio.findAll();
    }

    public Autorizacion nuevoAutorizacion(Autorizacion autorizacion){
        return autorizacionRepositorio.save(autorizacion);
    }

    public Autorizacion buscarAutorizacion(Long id){
        Autorizacion autorizacion = null;
        autorizacion = autorizacionRepositorio.findById(id).orElse(null);
        if(autorizacion == null){
            return null;
        } return autorizacion;
    }

    public int borrarAutorizacion(Long id){
        autorizacionRepositorio.deleteById(id);
        return 1;
    }
}
