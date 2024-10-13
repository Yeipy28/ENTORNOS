package EPS.Modeleps.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import EPS.Modeleps.modelo.CitasMedicas;

@Repository
public interface CitasMedicasRepositorio extends JpaRepository<CitasMedicas, Long>{

}
