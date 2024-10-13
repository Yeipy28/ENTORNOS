package EPS.Modeleps.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import EPS.Modeleps.modelo.Medico;

@Repository
public interface MedicoRepositorio extends JpaRepository<Medico, Long>{

}
