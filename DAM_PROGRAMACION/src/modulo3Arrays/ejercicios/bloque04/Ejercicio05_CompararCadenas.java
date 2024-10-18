package modulo3Arrays.ejercicios.bloque04;

import utils.Utils;
import utils.UtilsArrays;
import java.util.Scanner;

public class Ejercicio05_CompararCadenas {

	public static void main(String[] args) {
		String s1, s2;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca cadena s1: ");
		s1 = sc.nextLine();

		System.out.println("Introduzca cadena s2: ");
		s2 = sc.nextLine();

		if (comparaCadenas(s1, s2) == -1) {
			System.out.println(s1 + " es menor que " + s2);
		}
		else System.out.println(s2 + " es menor que " + s1);

	}
	
	
	
	public static int comparaCadenas(String s1, String s2) {
		
		int menorLongitud = (s1.length() < s2.length())? s1.length() : s2.length();
		
		for (int i = 0; i < menorLongitud; i++) {
			if (s1.charAt(i) < s2.charAt(i)) return -1;
			else if (s1.charAt(i) > s2.charAt(i)) return 1;
		}			
		
		if (s1.length() == s2.length()) return 0;
		return (s1.length() < s2.length())? -1 : 1;		
	}

}











