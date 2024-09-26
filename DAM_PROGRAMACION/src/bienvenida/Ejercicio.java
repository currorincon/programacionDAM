
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Ejercicio {

	/*
	 * Esta clase el main de mi código donde muestros los diferentes
	 * tipos primitivos para mi clase
	 *  
	 * @author 
	 * @param args
	 * 
	 */
	public static void main(String[] args) {
		
		System.out.println("Hola Mundo clase");
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca el valor de a: ");
		int a = sc.nextInt();
		System.out.println("Introduzca el valor de b: ");
		int b = sc.nextInt();
		System.out.println("Introduzca el valor de c: ");
		int c = sc.nextInt();
		
		float contenidoRaiz = (float) Math.sqrt( Math.pow(b, 2) - 4 * a * c );
		float x1 = (-b + contenidoRaiz) / (2 * a);
		float x2 = (-b - contenidoRaiz) / (2 * a);
		
		System.out.println("X1: " + x1 + " # x2: " + x2);
	}
		
		

}


