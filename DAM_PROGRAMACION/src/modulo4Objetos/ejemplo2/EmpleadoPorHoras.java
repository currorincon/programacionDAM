package modulo4Objetos.ejemplo2;

public class EmpleadoPorHoras extends Empleado {

	public double tarifaHora = 0;
	public int numeroHorasTrabajadas = 0;
	
	EmpleadoPorHoras(String nombre, int edad, double salarioBase) {
		super(nombre, edad, salarioBase);
	}
	
	@Override
	public double calcularSalario() {
		super.salarioBase = tarifaHora*numeroHorasTrabajadas;
		return super.salarioBase ;
	}

	public double getTarifaHora() {
		return tarifaHora;
	}

	public void setTarifaHora(double tarifaHora) {
		this.tarifaHora = tarifaHora;
	}

	public int getNumeroHorasTrabajadas() {
		return numeroHorasTrabajadas;
	}

	public void setNumeroHorasTrabajadas(int numeroHorasTrabajadas) {
		this.numeroHorasTrabajadas = numeroHorasTrabajadas;
	}

}
