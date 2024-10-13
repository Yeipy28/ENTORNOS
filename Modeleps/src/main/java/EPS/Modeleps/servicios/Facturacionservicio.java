package EPS.Modeleps.servicios;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import EPS.Modeleps.modelo.Facturacion;
import EPS.Modeleps.repositorios.FacturacionRepositorio;
import jakarta.transaction.Transactional;

@Service
@Transactional
public class Facturacionservicio {
    @Autowired
    FacturacionRepositorio facturacionRepositorio;

    public ArrayList<Facturacion> getFacturacion(){
        return (ArrayList<Facturacion>) facturacionRepositorio.findAll();
    }

    public Facturacion nuevoFacturacion(Facturacion facturacion){
        return facturacionRepositorio.save(facturacion);
    }

    public Facturacion buscarFacturacion(Long id){
        Facturacion facturacion = null;
        facturacion = facturacionRepositorio.findById(id).orElse(null);
        if(facturacion == null){
            return null;
        } return facturacion;
    }

    public int borrarFacturacion(Long id){
        facturacionRepositorio.deleteById(id);
        return 1;
    }
}
