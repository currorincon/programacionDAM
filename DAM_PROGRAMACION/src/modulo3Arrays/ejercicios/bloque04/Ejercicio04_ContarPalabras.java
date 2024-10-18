package modulo3Arrays.ejercicios.bloque04;

import utils.Utils;
import utils.UtilsArrays;
import java.util.Scanner;

public class Ejercicio04_ContarPalabras {

	public static void main(String[] args) {
		String s;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca cadena: ");
		s = sc.nextLine();

		System.out.println("Palabras: " + cuentaPalabras(s));
	}
	
	
	
	public static int cuentaPalabras(String str) {
		int count =0;
		boolean existePalabra = true;
		
		for (int i = 0; i < str.length(); i++) {
			
			if (str.charAt(i) >= 'A' && str.charAt(i)<= 'Z' || 
					str.charAt(i) >= 'a' && str.charAt(i)<= 'z' 
					&& existePalabra == true ) {
				
				count++;
				existePalabra = false;
			}
			
			if (str.charAt(i) == ' ') {
				existePalabra =  true;
			}			
		}
		return count;		
	}

}











