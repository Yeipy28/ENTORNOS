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
import EPS.Modeleps.modelo.EncuestasSatisfaccion;
import EPS.Modeleps.servicios.EncuestasSatisfaccionService;

@RestController
public class EncuestaSatisfaccionControlador {
    @Autowired
    EncuestasSatisfaccionService encuestasSatisfaccionService;

    @GetMapping("/encuesta")
    public ArrayList<EncuestasSatisfaccion> cargarEncuestasSatisfaccion() {
        return this.encuestasSatisfaccionService.getEncuestasSatisfaccion();
    }

    //buscar por id
    @GetMapping("/encuesta/{id}")
    public EncuestasSatisfaccion buscarPorId(@PathVariable Long id){
        return encuestasSatisfaccionService.buscarEncuestasSatisfaccion(id);
    }
    //Agregar, crear
    @PostMapping("/encuesta")
    public ResponseEntity<EncuestasSatisfaccion> agregar(@RequestBody EncuestasSatisfaccion encuestasSatisfaccion){
        EncuestasSatisfaccion obj= encuestasSatisfaccionService.nuevoEncuestasSatisfaccion(encuestasSatisfaccion);
        return new ResponseEntity<>(obj, HttpStatus.OK);
    }

    //Modificar
    @PutMapping("/encuesta") 
    public ResponseEntity<EncuestasSatisfaccion> editar(@RequestBody EncuestasSatisfaccion encuestasSatisfaccion){
        EncuestasSatisfaccion obj = encuestasSatisfaccionService.buscarEncuestasSatisfaccion(encuestasSatisfaccion.getId_encuesta());
        if(obj != null){
            obj.setComentarios(encuestasSatisfaccion.getComentarios());
            obj.setCalificacion_servicios(encuestasSatisfaccion.getCalificacion_servicios());
            obj.setFecha_encuesta(encuestasSatisfaccion.getFecha_encuesta());
            obj.setId_afiliado(encuestasSatisfaccion.getId_afiliado());
            encuestasSatisfaccionService.nuevoEncuestasSatisfaccion(obj);
        }else {
            return new ResponseEntity<>(obj, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        
        return new ResponseEntity<>(obj, HttpStatus.OK);
    }
    
    //ELiminar
    @DeleteMapping("/encuesta/{id}")
    public ResponseEntity<EncuestasSatisfaccion> eliminar(@PathVariable Long id){
        EncuestasSatisfaccion obj= encuestasSatisfaccionService.buscarEncuestasSatisfaccion(id);
        if(obj != null){
            encuestasSatisfaccionService.borrarEncuestasSatisfaccion(id);
        }else{
            return new ResponseEntity<>(obj, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>(obj, HttpStatus.OK);
    }
}
