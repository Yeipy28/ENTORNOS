package EPS.Modeleps.servicios;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import EPS.Modeleps.modelo.Afiliados;
import EPS.Modeleps.repositorios.AfiliadosRepositorio;
import jakarta.transaction.Transactional;

@Service
@Transactional
public class AfiliadosServicio {
    @Autowired
    AfiliadosRepositorio afiliadoRepositorio;

    public ArrayList<Afiliados> getAfiliados(){
        return (ArrayList<Afiliados>) afiliadoRepositorio.findAll();
    }

    public Afiliados nuevoAfiliados(Afiliados afiliados){
        return afiliadoRepositorio.save(afiliados);
    }

    public Afiliados buscarAfiliados(Long id){
        Afiliados afiliados = null;
        afiliados = afiliadoRepositorio.findById(id).orElse(null);
        if(afiliados == null){
            return null;
        } return afiliados;
    }

    public int borrarAfiliados(Long id){
        afiliadoRepositorio.deleteById(id);
        return 1;
    }
}
