package modulo3Arrays.ejercicios.bloque02;

import utils.Utils;
import utils.UtilsArrays;
import java.util.Scanner;

public class Ejercicio01_ParesCambianSignoEnArray {

	/**
	 * 
	 * @param args
	 */
	public static void main (String args[]) {
		int a[] = new int[15];
		UtilsArrays.inicializaArray(a, -100, 100);
		UtilsArrays.imprimeArray(a);
		cambiaSignoEnValores(a);
		UtilsArrays.imprimeArray(a);
	}
	
	/**
	 * 
	 * @param array
	 */
	public static void cambiaSignoEnValores(int array[]) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0) {
				array[i] = -array[i];
			}
		}
	}
	
}
