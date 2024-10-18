package modulo3Arrays.ejercicios.bloque01;

import utils.Utils;
import utils.UtilsArrays;
import java.util.Scanner;


public class Ejercicio03_MuestraArrayEnOrdenInverso {

	public static void main(String[] args) {
		int array[] = new int[5];
		
		UtilsArrays.inicializaArray(array, 0, 100);
		
		UtilsArrays.imprimeArray(array);
		
		for (int i = array.length-1; i >= 0; i--) {
			System.out.print(array[i] + " ");
		}

	}

}
