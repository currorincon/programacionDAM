package modulo4Objetos.spaceInvader;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("\tPrograma principal - SpaceInvaders");
		System.out.println(".... Generando Rivales");
	
		Tablero tablero = new Tablero();
		tablero.generarRivales();
		System.out.println(".... GENERADOS CON EXITO");

		
		//Coger Invasor
		//Diparar 
		//ver si escudo o quito vida
		//Coger Humano
		//Disparo
		//Resto vida 
		//REPITO HASTA QUE UNO DE LOS DOS TODOS MUERTOS
		
		do {
			// Disparar sobre el primera malvado. Necesito que haya
			// un humano vivo
			if (tablero.getPrimerHumanoVivo() != null) {
				tablero.getPrimerMalvadoVivo().recibirDisparo();
			}
			
			// Antes de disparar sobre un humano, debo comprobar que existe
			// al menos un malvado vivo
			if (tablero.getPrimerMalvadoVivo() != null) {
				tablero.getPrimerHumanoVivo().recibirDisparo();
			}
			
			tablero.muestraEstadoActual();
		
			sc.nextLine();
			
		} while (tablero.getPrimerHumanoVivo() != null &&
				tablero.getPrimerMalvadoVivo() != null);
		
		// Muestro el ganador
		if (tablero.getPrimerHumanoVivo() != null) {
			System.out.println("\nHan ganado los humanos");
		}
		else {
			if (tablero.getPrimerMalvadoVivo() != null) {
				System.out.println("\nHan ganado los invasores");
			}
			else {
				System.out.println("\nEmpate");
			}
		}
		
		System.out.println(".... Mostrando estado actual: Tablero");
	}
	

}
