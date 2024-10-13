package EPS.Modeleps.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import EPS.Modeleps.modelo.Afiliados;

@Repository
public interface AfiliadosRepositorio extends JpaRepository<Afiliados, Long>{

}
