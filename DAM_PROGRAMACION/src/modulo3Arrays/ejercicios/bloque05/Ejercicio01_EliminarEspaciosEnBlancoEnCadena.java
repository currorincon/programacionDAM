package modulo3Arrays.ejercicios.bloque05;

import java.util.Scanner;

public class Ejercicio01_EliminarEspaciosEnBlancoEnCadena {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduzca la cadena: ");
		String cadena = sc.nextLine();

		System.out.println("Sin espacios: " + eliminaEspaciosEnBlanco(cadena));
	}
	
	/**
	 * 
	 * @param str
	 * @return
	 */
	public static String eliminaEspaciosEnBlanco (String str) {
		StringBuffer strSinEspacios = new StringBuffer();
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ' ') {
//				strSinEspacios += str.charAt(i);
				strSinEspacios.append(str.charAt(i));
			}
		}
		return strSinEspacios.toString();
	}

}











