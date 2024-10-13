package EPS.Modeleps.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import EPS.Modeleps.repositorios.CitasMedicasRepositorio;
import jakarta.transaction.Transactional;
import EPS.Modeleps.modelo.CitasMedicas;


@Service
@Transactional
public class CitasMedicasSevicio {

    @Autowired
    CitasMedicasRepositorio citasMedicasRepositorio;
    
    public ArrayList<CitasMedicas> getCitasMedicas(){
        return (ArrayList<CitasMedicas>) citasMedicasRepositorio.findAll();
    }

    public CitasMedicas nuevoCitasMedicas(CitasMedicas citasMedicas){
        return citasMedicasRepositorio.save(citasMedicas);
    }

    public CitasMedicas buscarCitasMedicas(Long id){
        CitasMedicas citasMedicas = null;
        citasMedicas = citasMedicasRepositorio.findById(id).orElse(null);
        if(citasMedicas == null){
            return null;
        } return citasMedicas;
    }

    public int borrarCitasMedicas(Long id){
        citasMedicasRepositorio.deleteById(id);
        return 1;
    }
}
