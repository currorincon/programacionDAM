package modulo4Objetos.ejemplo2;

public class Principal {

	public static void main(String[] args) {

		EmpleadoTiempoCompleto[] empleadoTiempoCompleto = new EmpleadoTiempoCompleto[2];
				
		empleadoTiempoCompleto[0] = new EmpleadoTiempoCompleto("Pepe", 45, 2000);
		empleadoTiempoCompleto[1] = new EmpleadoTiempoCompleto("Juan", 65, 3000);
		
		EmpleadoPorHoras[] empleadoPorHoras = new EmpleadoPorHoras[2];
		
		empleadoPorHoras[0] = new EmpleadoPorHoras("Jorge", 18, 1200);
		empleadoPorHoras[1] = new EmpleadoPorHoras("Lucas", 21, 1300);

		empleadoPorHoras[1].setNombre("Lucas Maria");
		
		System.out.println("Empleado 1 " + empleadoPorHoras[1]);
		empleadoPorHoras[1].setNumeroHorasTrabajadas(5);
		empleadoPorHoras[1].setTarifaHora(15);
		
		System.out.println("Salario de: " +empleadoPorHoras[1].getNombre() 
				+ " es: " +empleadoPorHoras[1].calcularSalario() );
		
		
		for(int i = 0; i<empleadoTiempoCompleto.length;i++) {
			
			if(empleadoTiempoCompleto[i].getSalarioBase() > 2500) {
				System.out.println("El tio que cobra mas de 2500 es " 
					+ empleadoTiempoCompleto[i].getNombre());
			}
			
			
		}
		
	}

	
	
	
	
	
	
	
	
	
	
	
}
