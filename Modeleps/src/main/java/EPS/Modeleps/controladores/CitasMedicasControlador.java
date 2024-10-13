package EPS.Modeleps.controladores;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import EPS.Modeleps.modelo.CitasMedicas;
import EPS.Modeleps.servicios.CitasMedicasSevicio;

@RestController
public class CitasMedicasControlador {
    @Autowired
    CitasMedicasSevicio citasMedicasSevicio;

    @GetMapping("/citasmedicas")
    public ArrayList<CitasMedicas> cargarCitasMedicas() {
        return this.citasMedicasSevicio.getCitasMedicas();
    }

    //buscar por id
    @GetMapping("/citasmedicas/{id}")
    public CitasMedicas buscarPorId(@PathVariable Long id){
        return citasMedicasSevicio.buscarCitasMedicas(id);
    }
    //Agregar, crear
    @PostMapping("/citasmedicas")
    public ResponseEntity<CitasMedicas> agregar(@RequestBody CitasMedicas citasMedicas){
        CitasMedicas obj= citasMedicasSevicio.nuevoCitasMedicas(citasMedicas);
        return new ResponseEntity<>(obj, HttpStatus.OK);
    }

    //Modificar
    @PutMapping("/citasmedicas") 
    public ResponseEntity<CitasMedicas> editar(@RequestBody CitasMedicas citasMedicas){
        CitasMedicas obj = citasMedicasSevicio.buscarCitasMedicas(citasMedicas.getId_cita());
        if(obj != null){
            obj.setEspecialidad(citasMedicas.getEspecialidad());
            obj.setEstado_cita(citasMedicas.getEstado_cita());
            obj.setFecha_cita(citasMedicas.getFecha_cita());
            obj.setHora_cita(citasMedicas.getHora_cita());
            obj.setId_afiliado(citasMedicas.getId_afiliado());
            obj.setId_cita(citasMedicas.getId_cita());
            obj.setId_ips(citasMedicas.getId_ips());
            citasMedicasSevicio.nuevoCitasMedicas(obj);
        }else {
            return new ResponseEntity<>(obj, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        
        return new ResponseEntity<>(obj, HttpStatus.OK);
    }
    
    //ELiminar
    @DeleteMapping("/citasmedicas/{id}")
    public ResponseEntity<CitasMedicas> eliminar(@PathVariable Long id){
        CitasMedicas obj= citasMedicasSevicio.buscarCitasMedicas(id);
        if(obj != null){
            citasMedicasSevicio.borrarCitasMedicas(id);
        }else{
            return new ResponseEntity<>(obj, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>(obj, HttpStatus.OK);
    }
}
