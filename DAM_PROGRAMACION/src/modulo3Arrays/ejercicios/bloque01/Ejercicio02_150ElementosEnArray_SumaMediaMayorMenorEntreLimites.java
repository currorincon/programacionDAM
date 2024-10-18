package modulo3Arrays.ejercicios.bloque01;

import utils.Utils;
import utils.UtilsArrays;
import java.util.Scanner;

public class Ejercicio02_150ElementosEnArray_SumaMediaMayorMenorEntreLimites {

	public static void main(String[] args) {
		int array[] = new int[5], suma = 0, mayor, menor;
		int limInf, limSup;
		float media;		
		
		limInf = Utils.pideNumeroEntero("Introduzca límite inferior: ");
		limSup = Utils.pideNumeroEntero("Introduzca límite superior: ");
		
		UtilsArrays.inicializaArray(array, limInf, limSup);
		
		UtilsArrays.imprimeArray(array);
		
	}

	
	
}













