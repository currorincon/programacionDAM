package modulo3Arrays.ejercicios.bloque04;

import utils.Utils;
import utils.UtilsArrays;
import java.util.Scanner;

public class Ejercicio03_Palindromo {

	public static void main(String[] args) {
		String s;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca cadena: ");
		s = sc.nextLine();

		if (esPalindromo(s)) System.out.println("Es un palíndromo");
		else System.out.println("NO es un palíndromo");
	}
	
	
	
	public static boolean esPalindromo(String str) {
		for (int i = 0; i < (str.length() / 2); i++) {
			if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
				return false;
			}
		}
		return true;
	}

}











