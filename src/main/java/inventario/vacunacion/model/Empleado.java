package inventario.vacunacion.model;
import java.sql.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="empleado")

public class Empleado {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	private String nombre;
	private String apellido;
	private String cedula;
	private String mail;
	private String usuario;
	private String contrasena;
	private Integer edad;
	private Date f_nacimiento;
	private String direccion;
	private String e_vacuna; //estado
	private Date f_vacuna; //fecha de vacuna
	private String n_vacuna; //numero de dosis
	
	@ManyToOne
	@JoinColumn (name="id_vacuna")
	private T_vacuna id_vacuna;

	public Empleado() {	
	
	}
	
	
	
	public Empleado(String nombre, String apellido, String cedula, String mail, String usuario, String contrasena,
			Integer edad, Date f_nacimiento, String direccion, String e_vacuna, Date f_vacuna, String n_vacuna,
			T_vacuna id_vacuna, Integer id) {
		super();
		this.id= id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.cedula = cedula;
		this.mail = mail;
		this.usuario = usuario;
		this.contrasena = contrasena;
		this.edad = edad;
		this.f_nacimiento = f_nacimiento;
		this.direccion = direccion;
		this.e_vacuna = e_vacuna;
		this.f_vacuna = f_vacuna;
		this.n_vacuna = n_vacuna;
		this.id_vacuna = id_vacuna;
	}



	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public Date getF_nacimiento() {
		return f_nacimiento;
	}

	public void setF_nacimiento(Date f_nacimiento) {
		this.f_nacimiento = f_nacimiento;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getE_vacuna() {
		return e_vacuna;
	}

	public void setE_vacuna(String e_vacuna) {
		this.e_vacuna = e_vacuna;
	}

	public Date getF_vacuna() {
		return f_vacuna;
	}

	public void setF_vacuna(Date f_vacuna) {
		this.f_vacuna = f_vacuna;
	}

	public String getN_vacuna() {
		return n_vacuna;
	}

	public void setN_vacuna(String n_vacuna) {
		this.n_vacuna = n_vacuna;
	}

	public T_vacuna getId_vacuna() {
		return id_vacuna;
	}

	public void setId_vacuna(T_vacuna id_vacuna) {
		this.id_vacuna = id_vacuna;
	}



	public String getId() {
		// TODO Auto-generated method stub
		return null;
	}
	
}