package modulo3Arrays.ejercicios.bloque05;

import java.util.Scanner;

public class Ejercicio02_CifradoCesar {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduzca la cadena: ");
//		String cadena = sc.nextLine();
		String cadena = "rafaxyz";

		System.out.println("César: " + cifradoCesar(cadena, 3));
	}
	
	/**
	 * 
	 * @param str
	 * @return
	 */
	public static String cifradoCesar (String str, int clave) {
		String abecedario = "abcdefghijklmnñopqrstuvwxyz";
		
		StringBuffer strCesar = new StringBuffer();
		
		for (int i = 0; i < str.length(); i++) {
			int posicionCharOriginal = abecedario.indexOf(str.charAt(i));
			System.out.println();
			int posicionTrasCifradoCesar = (posicionCharOriginal + clave) % abecedario.length();
			strCesar.append(abecedario.charAt(posicionTrasCifradoCesar));
		}
		
		
		return strCesar.toString();
	}

}











