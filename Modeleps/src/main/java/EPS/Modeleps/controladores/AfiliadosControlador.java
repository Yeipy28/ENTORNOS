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
import EPS.Modeleps.modelo.Afiliados;
import EPS.Modeleps.servicios.AfiliadosServicio;

@RestController
public class AfiliadosControlador {

    @Autowired
    AfiliadosServicio afiliadosServicio;

    @GetMapping("/afiliados")
    public ArrayList<Afiliados> cargarAfiliados() {
        return this.afiliadosServicio.getAfiliados();
    }

    //buscar por id
    @GetMapping("/afiliados/{id}")
    public Afiliados buscarPorId(@PathVariable Long id){
        return afiliadosServicio.buscarAfiliados(id);
    }
    //Agregar, crear
    @PostMapping("/afiliados")
    public ResponseEntity<Afiliados> agregar(@RequestBody Afiliados afiliados){
        Afiliados obj= afiliadosServicio.nuevoAfiliados(afiliados);
        return new ResponseEntity<>(obj, HttpStatus.OK);
    }

    //Modificar
    @PutMapping("/afiliados") 
    public ResponseEntity<Afiliados> editar(@RequestBody Afiliados afiliados){
        Afiliados obj = afiliadosServicio.buscarAfiliados(afiliados.getId_afiliado());
        if(obj != null){
            obj.setDireccion(afiliados.getDireccion());
            obj.setEmail(afiliados.getEmail());
            obj.setEstado_afiliacion(afiliados.getEstado_afiliacion());
            obj.setFecha_afiliacion(afiliados.getFecha_afiliacion());
            obj.setFecha_nacimiento(afiliados.getFecha_nacimiento());
            obj.setNombre(afiliados.getNombre());
            obj.setNumero_identificacion(afiliados.getNumero_identificacion());
            obj.setPlan_salud(afiliados.getPlan_salud());
            obj.setSexo(afiliados.getSexo());
            obj.setTelefono(afiliados.getTelefono());
            obj.setTipo_identificacion(afiliados.getTipo_identificacion());
            afiliadosServicio.nuevoAfiliados(obj);
        }else {
            return new ResponseEntity<>(obj, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        
        return new ResponseEntity<>(obj, HttpStatus.OK);
    }
    
    //ELiminar
    @DeleteMapping("/afiliados/{id}")
    public ResponseEntity<Afiliados> eliminar(@PathVariable Long id){
        Afiliados obj= afiliadosServicio.buscarAfiliados(id);
        if(obj != null){
            afiliadosServicio.borrarAfiliados(id);
        }else{
            return new ResponseEntity<>(obj, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>(obj, HttpStatus.OK);
    }
}
