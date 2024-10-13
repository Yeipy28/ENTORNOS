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
import EPS.Modeleps.modelo.Facturacion;
import EPS.Modeleps.servicios.Facturacionservicio;

@RestController
public class FacturacionControlador {
    @Autowired
    Facturacionservicio facturacionservicio;

    @GetMapping("/facturacion")
    public ArrayList<Facturacion> cargarFacturacion() {
        return this.facturacionservicio.getFacturacion();
    }

    //buscar por id
    @GetMapping("/facturacion/{id}")
    public Facturacion buscarPorId(@PathVariable Long id){
        return facturacionservicio.buscarFacturacion(id);
    }
    //Agregar, crear
    @PostMapping("/facturacion")
    public ResponseEntity<Facturacion> agregar(@RequestBody Facturacion facturacion){
        Facturacion obj= facturacionservicio.nuevoFacturacion(facturacion);
        return new ResponseEntity<>(obj, HttpStatus.OK);
    }

    //Modificar
    @PutMapping("/facturacion") 
    public ResponseEntity<Facturacion> editar(@RequestBody Facturacion facturacion){
        Facturacion obj = facturacionservicio.buscarFacturacion(facturacion.getId_factura());
        if(obj != null){
            obj.setEstado_factura(facturacion.getEstado_factura());
            obj.setFecha_emision(facturacion.getFecha_emision());
            obj.setId_afiliado(facturacion.getId_afiliado());
            obj.setId_ips(facturacion.getId_ips());
            obj.setMonto_total(facturacion.getMonto_total());
            obj.setServicios_prestados(facturacion.getServicios_prestados());
            facturacionservicio.nuevoFacturacion(obj);
        }else {
            return new ResponseEntity<>(obj, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        
        return new ResponseEntity<>(obj, HttpStatus.OK);
    }
    
    //ELiminar
    @DeleteMapping("/facturacion/{id}")
    public ResponseEntity<Facturacion> eliminar(@PathVariable Long id){
        Facturacion obj= facturacionservicio.buscarFacturacion(id);
        if(obj != null){
            facturacionservicio.borrarFacturacion(id);
        }else{
            return new ResponseEntity<>(obj, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>(obj, HttpStatus.OK);
    }
}
