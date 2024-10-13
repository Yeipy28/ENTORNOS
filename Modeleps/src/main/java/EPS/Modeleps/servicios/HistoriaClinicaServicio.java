package EPS.Modeleps.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import EPS.Modeleps.modelo.HistoriaClinica;
import EPS.Modeleps.repositorios.HistoriaClinicaRepositorio;
import jakarta.transaction.Transactional;

@Service
@Transactional
public class HistoriaClinicaServicio {
    @Autowired
    HistoriaClinicaRepositorio historiaClinicaRepositorio;

    public ArrayList<HistoriaClinica> getHistoriaClinica(){
        return (ArrayList<HistoriaClinica>) historiaClinicaRepositorio.findAll();
    }

    public HistoriaClinica nuevoHistoriaClinica(HistoriaClinica historiaClinica){
        return historiaClinicaRepositorio.save(historiaClinica);
    }

    public HistoriaClinica buscarHistoriaClinica(Long id){
        HistoriaClinica historiaClinica = null;
        historiaClinica = historiaClinicaRepositorio.findById(id).orElse(null);
        if(historiaClinica == null){
            return null;
        } return historiaClinica;
    }

    public int borrarHistoriaClinica(Long id){
        historiaClinicaRepositorio.deleteById(id);
        return 1;
    }
}
