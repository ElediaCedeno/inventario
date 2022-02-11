package inventario.vacunacion.rest;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import inventario.vacunacion.model.Empleado;
import inventario.vacunacion.service.EmpleadoService;

@RestController
@RequestMapping("/personas/")
public class EmpleadoREST {
	@Autowired
	private EmpleadoService empleadoService;
	
	@GetMapping
	private ResponseEntity<List<Empleado>> getAllPersonas(){
		return ResponseEntity.ok(empleadoService.findAll());
	}	
	
	@PostMapping
	private ResponseEntity<Empleado> saveEmpleado (@RequestBody Empleado empleado){
		try {
			Empleado Empleadoregistrado = empleadoService.save(empleado);
			return ResponseEntity.created(new URI("/empleado/"+Empleadoregistrado.getId())).body(Empleadoregistrado);			
		} catch (Exception e) {
			// TODO: handle exception
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
		
	}
	

}
