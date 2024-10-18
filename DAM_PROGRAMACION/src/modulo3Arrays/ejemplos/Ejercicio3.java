package modulo3Arrays.ejemplos;

import utils.Utils;

public class Ejercicio3 {

	public void main(String args[]) {
		
	/**
	 * 
	 * 3o.- Realiza un ejercicio que inicialice un array de 150 elementos enteros al azar entre 0 y 100. 
	 * Después de su inicialización debéis 
	 * imprimir el array en orden inverso.	
	 */
		
	int cantidad = 150;	
	
	int [] myArray = new int[cantidad];
	
	
	for(int i=0; i<cantidad;i++) {
		myArray[i] = Utils.obtenerNumeroAzar(0, 100);
			
	}
	
	for(int i=0; i<cantidad;i++) {
			System.out.println("El array es: " + myArray[i]);
	}
	
		
	}
	
	
}


