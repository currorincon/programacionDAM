package modulo3Arrays.ejercicios.bloque03;

import utils.Utils;
import utils.UtilsArrays;
import java.util.Scanner;

public class Ejemplo04_OrdenacionSeleccion {

	public static void main (String args[]) {
//		int a[] = new int[] {33, 17, 72, 11, 35};
		int a[] = new int[100];
		int posicionMenor, aux;
		
		UtilsArrays.inicializaArray(a, 0, 100);
		UtilsArrays.imprimeArray(a);
		
		for (int i = 0; i < a.length; i++) {
			// Asumo que el menor es la posición de i
			posicionMenor = i;

			// Busco la posición REAL del menor, a partir de la posición i
			for (int j = i + 1; j < a.length; j++) {
				if (a[posicionMenor] > a[j]) {
					posicionMenor = j;
				}
			}

			// Intercambio
			aux = a[i];
			a[i] = a[posicionMenor];
			a[posicionMenor] = aux;	
		}		
		
		UtilsArrays.imprimeArray(a);
		
	}
}




