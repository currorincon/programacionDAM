package modulo3Arrays.ejercicios.bloque04;

import utils.Utils;
import utils.UtilsArrays;
import java.util.Scanner;

public class Ejercicio06_ObtenerCadenaMinusculas {

	public static void main(String[] args) {
		String s;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca cadena: ");
		s = sc.nextLine();

		System.out.println("Convertida a minúsculas es: " + 
				convierteAMinusculas(s));
	}
	
	
	
	public static String convierteAMinusculas(String s) {
		String res = "";
		
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
				res += (char) (s.charAt(i) + 32);
			}
			else {
				res += s.charAt(i);
			}
		}
		
		return res;
	}

}











