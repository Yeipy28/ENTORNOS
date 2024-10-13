package EPS.Modeleps.repositorios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import EPS.Modeleps.modelo.Beneficiarios;

@Repository
public interface BeneficiarioRepositorio extends JpaRepository<Beneficiarios, Long>{

}
