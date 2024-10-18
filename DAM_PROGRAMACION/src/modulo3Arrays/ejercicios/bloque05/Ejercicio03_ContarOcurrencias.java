package modulo3Arrays.ejercicios.bloque05;

import java.util.Scanner;

public class Ejercicio03_ContarOcurrencias {

	public static void main(String[] args) {

		System.out.println("Contar ocurrencias: " + 
				contarOcurrencias("rafa está afónicaf", ""));
	}
	
	/**
	 * 
	 * @param str
	 * @return
	 */
	public static int contarOcurrencias (String str, String patron) {
		if (patron == "") {
			return 0;
		}
		
		int cont = 0;
		
		for (int i = 0; i <= (str.length() - patron.length()); i++) {
			if (str.charAt(i) == patron.charAt(0)) {
				boolean patronCoincide = true;
				for (int j = 0; j < patron.length(); j++) {
					if (str.charAt(i + j) != patron.charAt(j)) {
						patronCoincide = false;
					}
				}
				if (patronCoincide == true) {
					cont++;
				}
			}
		}
		return cont;
	}

}











