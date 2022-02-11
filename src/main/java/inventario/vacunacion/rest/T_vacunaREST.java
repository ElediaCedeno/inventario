package inventario.vacunacion.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import inventario.vacunacion.model.T_vacuna;
import inventario.vacunacion.service.T_vacunaService;

@RestController
@RequestMapping("/t_vacuna/")
public class T_vacunaREST {
	@Autowired
	private T_vacunaService t_vacunaService;
	@GetMapping
	private ResponseEntity<List<T_vacuna>> getAllT_vacunas (){
		return ResponseEntity.ok(t_vacunaService.findAll());
	}
	

}
