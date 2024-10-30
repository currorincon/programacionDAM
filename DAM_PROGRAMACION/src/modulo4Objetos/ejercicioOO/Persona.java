package modulo4Objetos.ejercicioOO;

public class Persona {

	public String nombre = "";
	public String apellidos ="";
	
	public String dni = "";
	
	public int edad = 0;
	public int telefono = 0;
	public String direccion ="";
	
	Persona(){
		System.out.println("Persona instanciada");
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	@Override
	public String toString() {
		String texto = this.nombre + " " + this.dni;
		return texto;
	}
	
}
