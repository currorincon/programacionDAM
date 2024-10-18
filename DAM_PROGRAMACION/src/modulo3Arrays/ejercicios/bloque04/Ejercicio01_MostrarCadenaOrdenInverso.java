package modulo3Arrays.ejercicios.bloque04;

import utils.Utils;
import utils.UtilsArrays;
import java.util.Scanner;

public class Ejercicio01_MostrarCadenaOrdenInverso {

	public static void main(String[] args) {
		String s;
		 Scanner sc = new Scanner(System.in);

		
	 while(true) {
		System.out.println("Introduzca cadena: ");
		s = sc.nextLine();
		
		if(comprobarCandena(s))
			palimdromo(s);
	 }
		//muestraCadenaOrdenInverso(s);
	 
	}
	
	public static boolean comprobarCandena(String s) {
		
		boolean isValido = false;
		
		do {
			
			for(int i = 0; i<s.length(); i++) {
				if (s.charAt(i) > 64 && s.charAt(i) < 91
						|| s.charAt(i) > 96 && s.charAt(i) < 123) {
					isValido = true;
				}else {
					System.out.println("Su Primoh, queres meter bien la anaena");
					isValido = false;
					break;
				}
			}
		}while(!isValido);
		
		return isValido;
	}
	
	public static void palimdromo(String palabra) {
		
		boolean isPalimdromo = true; 
		
		int longitudPalabra = palabra.length();
		
		palabra = palabra.toLowerCase();
		
		for(int i = 0; i<longitudPalabra; i++) {
							
				if(palabra.charAt(i) == 65 || palabra.charAt(i) == 'a'  ) {
					System.out.println("Hay a's en tu frase");
				}

				if(palabra.charAt(i) == 
				 	palabra.charAt(palabra.length()-1-i)) {
					
				}else {
					isPalimdromo = false;
				}
			
		}
		
		if(isPalimdromo) {
			System.out.println("Es palímdromo");
		}else System.out.println("No es palímdromo");
		
		
	}
	
	public static void muestraCadenaOrdenInverso(String str) {
		for (int i = str.length() - 1; i > -1; i--) {
			System.out.print(str.charAt(i));
		}
	}

}
