package inventario.vacunacion.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import inventario.vacunacion.model.T_vacuna;

public interface T_vacunaRepository extends JpaRepository<T_vacuna, Long>{

}
