package EPS.Modeleps.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import EPS.Modeleps.modelo.Autorizacion;

@Repository
public interface AutorizacionRepositorio extends JpaRepository<Autorizacion, Long>{

}
