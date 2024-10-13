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
import EPS.Modeleps.modelo.Autorizacion;
import EPS.Modeleps.servicios.AutorizacionServicio;

@RestController
public class AutorizacionControlador {
    @Autowired
    AutorizacionServicio autorizacionServicio;

    @GetMapping("/autorizacion")
    public ArrayList<Autorizacion> cargarAutorizacion() {
        return this.autorizacionServicio.getAutorizaciones();
    }

    //buscar por id
    @GetMapping("/autorizacion/{id}")
    public Autorizacion buscarPorId(@PathVariable Long id){
        return autorizacionServicio.buscarAutorizacion(id);
    }
    //Agregar, crear
    @PostMapping("/autorizacion")
    public ResponseEntity<Autorizacion> agregar(@RequestBody Autorizacion autorizacion){
        Autorizacion obj= autorizacionServicio.nuevoAutorizacion(autorizacion);
        return new ResponseEntity<>(obj, HttpStatus.OK);
    }

    //Modificar
    @PutMapping("/autorizacion") 
    public ResponseEntity<Autorizacion> editar(@RequestBody Autorizacion autorizacion){
        Autorizacion obj = autorizacionServicio.buscarAutorizacion(autorizacion.getId_autorizacion());
        if(obj != null){
            obj.setEstado_autorizado(autorizacion.getEstado_autorizado());
            obj.setFecha_solicitud(autorizacion.getFecha_solicitud());
            obj.setId_afiliado(autorizacion.getId_afiliado());
            obj.setMotivo_solicitud(autorizacion.getMotivo_solicitud());
            autorizacionServicio.nuevoAutorizacion(obj);
        }else {
            return new ResponseEntity<>(obj, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        
        return new ResponseEntity<>(obj, HttpStatus.OK);
    }
    
    //ELiminar
    @DeleteMapping("/autorizacion/{id}")
    public ResponseEntity<Autorizacion> eliminar(@PathVariable Long id){
        Autorizacion obj= autorizacionServicio.buscarAutorizacion(id);
        if(obj != null){
            autorizacionServicio.borrarAutorizacion(id);
        }else{
            return new ResponseEntity<>(obj, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>(obj, HttpStatus.OK);
    }
}
