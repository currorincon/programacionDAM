package modulo3Arrays.ejercicios.bloque04;

import utils.Utils;
import utils.UtilsArrays;
import java.util.Scanner;

public class Ejercicio02_ContarVocalesYConsonantes {

	public static void main(String[] args) {
		String s;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca cadena: ");
		s = sc.nextLine();

		contarVocalesYConsonantes(s);
	}
	
	
	
	public static void contarVocalesYConsonantes(String str) {
		int contVocales = 0, contConsonantes = 0;
		
		for (int i = str.length() - 1; i > -1; i--) {
			char c = str.charAt(i);
			System.out.println(c);
			
			if ( (c >= 'A' && c <= 'Z')	|| (c >= 'a' && c <= 'z') ) {
				
				if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' 
					|| c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
					contVocales++;
				}
				else {
					contConsonantes++;
				}
			}
		}
		
		System.out.println("Vocales: " + contVocales + " - Consonantes: " 
				+ contConsonantes);
	}

}











