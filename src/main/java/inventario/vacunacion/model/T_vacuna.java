package inventario.vacunacion.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="t_vacuna")

public class T_vacuna {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String n_vacuna;
	
	
	public T_vacuna() {
		
	}
	
	
	public T_vacuna(String n_vacuna) {
		super();
		this.n_vacuna = n_vacuna;
	}


	public String getN_vacuna() {
		return n_vacuna;
	}
	public void setN_vacuna(String n_vacuna) {
		this.n_vacuna = n_vacuna;
	}
	
	
}