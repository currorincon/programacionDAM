package modulo3Arrays.ejercicios.bloque05;

import java.util.Scanner;

public class Ejercicio06_Pangrama {

	public static void main(String[] args) {

		System.out.println("Pangrama: " + 
				esPangrama("rafa esta afonico hoy, pero esta bien"));
	}
	

	public static boolean esPangrama (String str) {
		String abecedario = "abcdefghijklmnñopqrstuvwxyz";

		for (int i = 0; i < abecedario.length(); i++) {
			if (str.indexOf(abecedario.charAt(i)) == -1) {
				System.out.println("no encontrado en cadena " + abecedario.charAt(i));
				return false;
			}
		}
		return true;
	}

}











