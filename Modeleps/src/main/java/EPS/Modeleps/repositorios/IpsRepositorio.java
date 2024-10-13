package EPS.Modeleps.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import EPS.Modeleps.modelo.Ips;

@Repository
public interface IpsRepositorio extends JpaRepository<Ips, Long>{

}
