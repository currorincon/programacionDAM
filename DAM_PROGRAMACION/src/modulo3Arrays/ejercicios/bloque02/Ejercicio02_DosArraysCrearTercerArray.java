package modulo3Arrays.ejercicios.bloque02;

import utils.Utils;
import utils.UtilsArrays;
import java.util.Scanner;


public class Ejercicio02_DosArraysCrearTercerArray {

	/**
	 * 
	 * @param args
	 */
	public static void main (String args[]) {
		int a1[] = new int[15];
		int a2[] = new int[15];
		int a3[];
		
		UtilsArrays.inicializaArray(a1, 0, 100);
		UtilsArrays.imprimeArray(a1);
		UtilsArrays.inicializaArray(a2, 0, 100);
		UtilsArrays.imprimeArray(a2);
		
		a3 = creaTercerArray(a1, a2);
		UtilsArrays.imprimeArray(a3);
	}
	
	/**
	 * 
	 * @param array
	 */
	public static int[] creaTercerArray (int a1[], int a2[]) {
		int a[] = new int[a1.length];
		for (int i = 0; i < a1.length; i++) {
			if (i % 2 == 1) {
				a[i] = a1[i];
			}
			else {
				a[i] = a2[i];
			}
		}
		return a;
	}
	
}










