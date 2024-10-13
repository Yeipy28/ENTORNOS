package EPS.Modeleps.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import EPS.Modeleps.modelo.Facturacion;

@Repository
public interface FacturacionRepositorio extends JpaRepository<Facturacion, Long>{

}
