package modulo3Arrays.ejercicios.bloque02;

import utils.Utils;
import utils.UtilsArrays;
import java.util.Scanner;

public class Ejercicio03_MultiplicaElementosArray {

	/**
	 * 
	 * @param args
	 */
	public static void main (String args[]) {
		int a1[] = new int[15];
		int factor;
		
		// Incializo e imprimo el array
		UtilsArrays.inicializaArray(a1, 0, 100);
		UtilsArrays.imprimeArray(a1);
		
		factor = Utils.pideNumeroEntero("Por favor, introduzca el factor: ");
		
		multiplicaValoresPorFactor(a1, factor);
	}
	
	/**
	 * 
	 * @param a
	 * @param factor
	 */
	public static void multiplicaValoresPorFactor (int a[], int factor) {
		for (int i = 0; i < a.length; i++) {
			a[i] *= factor;
		}
	}
	
}










