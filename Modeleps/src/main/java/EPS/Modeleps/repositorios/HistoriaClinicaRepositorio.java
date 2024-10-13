package EPS.Modeleps.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import EPS.Modeleps.modelo.HistoriaClinica;

@Repository
public interface HistoriaClinicaRepositorio extends JpaRepository<HistoriaClinica, Long>{

}
