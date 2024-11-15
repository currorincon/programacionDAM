package modulo4Objetos.ejemplo2;

public class Empleado extends Object{

	protected String nombre = "";
	protected int edad = 0;
	protected double salarioBase = 0;
	
	Empleado(String nombre, int edad, double salarioBase){
		this.nombre=nombre;
		this.edad = edad;
		this.salarioBase = salarioBase;
	}
	
	public double calcularSalario() {
		return this.salarioBase;
	}
	
	@Override
	public String toString() {
		return this.nombre + " " + this.edad + " " + this.salarioBase;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}
	
	
}
