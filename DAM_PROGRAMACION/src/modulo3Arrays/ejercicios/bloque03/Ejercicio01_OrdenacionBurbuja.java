package modulo3Arrays.ejercicios.bloque03;

import utils.Utils;
import utils.UtilsArrays;
import java.util.Scanner;

public class Ejercicio01_OrdenacionBurbuja {

	public static void main(String[] args) {
//		int a[] = new int[] {33, 17, 72, 11, 35};
		int a[] = new int[1000];
		boolean hayIntercambios = false;
		
		UtilsArrays.inicializaArray(a, 0, 100);
		UtilsArrays.imprimeArray(a);		
		
		do {
			hayIntercambios = false;
			for (int i = 0; i < (a.length - 1); i++) {
				if (a[i] > a[i + 1]) {
					int aux = a[i];
					a[i] = a[i + 1];
					a[i + 1] = aux;
					hayIntercambios = true;
				}
			}
		} while (hayIntercambios == true);
		
		UtilsArrays.imprimeArray(a);

	}

}
