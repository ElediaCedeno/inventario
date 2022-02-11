package inventario.vacunacion.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import inventario.vacunacion.model.Empleado;

public interface EmpleadoRepository extends JpaRepository<Empleado, Long>{

}
