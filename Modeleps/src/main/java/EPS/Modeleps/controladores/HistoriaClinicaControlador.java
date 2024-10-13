package EPS.Modeleps.controladores;

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

import java.util.ArrayList;
import EPS.Modeleps.modelo.HistoriaClinica;
import EPS.Modeleps.servicios.HistoriaClinicaServicio;

@RestController
public class HistoriaClinicaControlador {
    @Autowired
    HistoriaClinicaServicio historiaClinicaServicio;

    @GetMapping("/historiaClinica")
    public ArrayList<HistoriaClinica> cargarHistoriaClinica() {
        return this.historiaClinicaServicio.getHistoriaClinica();
    }

    //buscar por id
    @GetMapping("/historiaClinica/{id}")
    public HistoriaClinica buscarPorId(@PathVariable Long id){
        return historiaClinicaServicio.buscarHistoriaClinica(id);
    }
    //Agregar, crear
    @PostMapping("/historiaClinica")
    public ResponseEntity<HistoriaClinica> agregar(@RequestBody HistoriaClinica historiaClinica){
        HistoriaClinica obj= historiaClinicaServicio.nuevoHistoriaClinica(historiaClinica);
        return new ResponseEntity<>(obj, HttpStatus.OK);
    }

    //Modificar
    @PutMapping("/historiaClinica") 
    public ResponseEntity<HistoriaClinica> editar(@RequestBody HistoriaClinica historiaClinica){
        HistoriaClinica obj = historiaClinicaServicio.buscarHistoriaClinica(historiaClinica.getId_historia());
        if(obj != null){
            obj.setDiagnostico(historiaClinica.getDiagnostico());
            obj.setFecha_registro(historiaClinica.getFecha_registro());
            obj.setId_afiliado(historiaClinica.getId_afiliado());
            obj.setId_cita(historiaClinica.getId_cita());
            obj.setNotas_medicas(historiaClinica.getNotas_medicas());
            obj.setTratamiento(historiaClinica.getTratamiento());
            historiaClinicaServicio.nuevoHistoriaClinica(obj);
        }else {
            return new ResponseEntity<>(obj, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        
        return new ResponseEntity<>(obj, HttpStatus.OK);
    }
    
    //ELiminar
    @DeleteMapping("/historiaClinica/{id}")
    public ResponseEntity<HistoriaClinica> eliminar(@PathVariable Long id){
        HistoriaClinica obj= historiaClinicaServicio.buscarHistoriaClinica(id);
        if(obj != null){
            historiaClinicaServicio.borrarHistoriaClinica(id);
        }else{
            return new ResponseEntity<>(obj, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>(obj, HttpStatus.OK);
    }
}
