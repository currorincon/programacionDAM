package modulo3Arrays.ejercicios.bloque02;

import utils.Utils;
import utils.UtilsArrays;
import java.util.Scanner;

public class Ejercicio06_DeplazamientoCiclicoLugaresYDireccionPersonalizadas {

	/**
	 * 
	 * @param args
	 */
	public static void main (String args[]) {
		int a[] = new int[] {1, 2, 3, 4, 5};
		int posiciones, direccion;
		
		UtilsArrays.imprimeArray(a);
		
		posiciones = Utils.pideNumeroEntero("Indica cantidad de posiciones: ");
		direccion = Utils.pideNumeroEntero("Indica dirección (0-Izquierda, 1-Derecha): ");
		desplazaCiclico(a, posiciones, direccion);
		UtilsArrays.imprimeArray(a);
	}
	
	/**
	 * 
	 * @param a
	 * @param factor
	 */
	public static void desplazaCiclico (int a[], int posiciones, int direccion) {

		if (direccion == 1) { // Se desea desplazar a derecha
			for (int repeticiones = 0; repeticiones < posiciones; repeticiones++) {
				int aux = a[a.length - 1];
				for (int i = (a.length - 1); i > 0; i--) {
					a[i] = a[i - 1];
				}
				a[0] = aux;
			}
		}
		else { // Se desea desplazar a izquierda
			for (int repeticiones = 0; repeticiones < posiciones; repeticiones++) {
				int aux = a[0];
				for (int i = 0; i < (a.length - 1); i++) {
					a[i] = a[i + 1];
				}
				a[a.length - 1] = aux;
			}			
		}
	}
	
}










