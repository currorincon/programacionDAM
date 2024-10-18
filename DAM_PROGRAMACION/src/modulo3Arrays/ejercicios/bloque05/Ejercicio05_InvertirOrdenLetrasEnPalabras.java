package modulo3Arrays.ejercicios.bloque05;

import java.util.Scanner;

public class Ejercicio05_InvertirOrdenLetrasEnPalabras {

	public static void main(String[] args) {

		System.out.println("Contar ocurrencias: " + 
				palabraMasLarga("rafa está afónico hoy"));
	}
	

	public static String palabraMasLarga (String str) {
		String palabra = "";
		String salida = "";
		
		str += ' '; 
		
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ') { // He terminado una palabra
				System.out.println(palabra);
				// Recorro la palabra al revés y la agrego al String salida
				for (int j = palabra.length() - 1; j > -1; j--) {
					salida += palabra.charAt(j);
				}
				salida += " ";
				palabra = "";
			}
			else { // Estoy visitando las letras de una palabra
				palabra += str.charAt(i);
			}
			
		}
		// Quita el último espacio
		return salida.substring(0, salida.length() - 1);
	}

}











