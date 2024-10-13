package EPS.Modeleps.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import EPS.Modeleps.modelo.EncuestasSatisfaccion;

@Repository
public interface EncuentasSatisfaccionRepositorio extends JpaRepository<EncuestasSatisfaccion, Long>{

}
