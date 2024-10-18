package modulo3Arrays.ejercicios.bloque05;

import java.util.Scanner;

public class Ejercicio04_EncontrarPalabraMasLarga {

	public static void main(String[] args) {

		System.out.println("Contar ocurrencias: " + 
				palabraMasLarga("rafa está afónico hoy"));
	}
	

	public static String palabraMasLarga (String str) {
		String palabraCandidata = "";
		String palabraMasLarga = "";
		
		str += ' '; 
		
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ') { // He terminado una palabra
				System.out.println(palabraCandidata);
				if (palabraCandidata.length() > palabraMasLarga.length()) {
					palabraMasLarga = palabraCandidata;
				}
				palabraCandidata = "";
			}
			else { // Estoy visitando las letras de una palabra
				palabraCandidata += str.charAt(i);
			}
			
		}
		return palabraMasLarga;
	}

}











