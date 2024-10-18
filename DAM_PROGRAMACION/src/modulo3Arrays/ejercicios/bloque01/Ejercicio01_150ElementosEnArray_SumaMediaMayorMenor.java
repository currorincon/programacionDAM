package modulo3Arrays.ejercicios.bloque01;

import utils.UtilsArrays;

public class Ejercicio01_150ElementosEnArray_SumaMediaMayorMenor {

	public static void main(String[] args) {
		int array[] = new int[500];

		UtilsArrays.inicializaArray(array, 0, 100);
		
		UtilsArrays.imprimeArray(array);
			
		
		// Imprimo resultados
		System.out.println("Suma: " + UtilsArrays.suma(array) 
				+ " - Media: " + UtilsArrays.promedia(array) + 
				" - Menor: " + UtilsArrays.menor(array) 
				+ " - Mayor: " + UtilsArrays.mayor(array));
		
	}

	
	
}













