package EPS.Modeleps.servicios;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import EPS.Modeleps.modelo.EncuestasSatisfaccion;
import EPS.Modeleps.repositorios.EncuentasSatisfaccionRepositorio;
import jakarta.transaction.Transactional;

@Service
@Transactional
public class EncuestasSatisfaccionService {
    
    @Autowired
    EncuentasSatisfaccionRepositorio encuentasSatisfaccionRepositorio;

    public ArrayList<EncuestasSatisfaccion> getEncuestasSatisfaccion(){
        return (ArrayList<EncuestasSatisfaccion>) encuentasSatisfaccionRepositorio.findAll();
    }

    public EncuestasSatisfaccion nuevoEncuestasSatisfaccion(EncuestasSatisfaccion encuestasSatisfaccion){
        return encuentasSatisfaccionRepositorio.save(encuestasSatisfaccion);
    }

    public EncuestasSatisfaccion buscarEncuestasSatisfaccion(Long id){
        EncuestasSatisfaccion encuestasSatisfaccion = null;
        encuestasSatisfaccion = encuentasSatisfaccionRepositorio.findById(id).orElse(null);
        if(encuestasSatisfaccion == null){
            return null;
        } return encuestasSatisfaccion;
    }

    public int borrarEncuestasSatisfaccion(Long id){
        encuentasSatisfaccionRepositorio.deleteById(id);
        return 1;
    }
}
