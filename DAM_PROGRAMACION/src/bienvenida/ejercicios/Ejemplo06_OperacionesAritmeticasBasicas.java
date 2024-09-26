package bienvenida.ejercicios;

import java.util.Scanner;

public class Ejemplo06_OperacionesAritmeticasBasicas {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dame un número entero: ");
		int num1 = sc.nextInt();
		System.out.println("Valor de numEntero: " + num1);

		System.out.println("Dame otro número entero: ");
		int num2 = sc.nextInt();
		System.out.println("Valor de numEntero: " + num2);
		
		System.out.println("La suma de los valores es: " + (num1 + num2));
		System.out.println("La resta de los valores es: " + (num1 - num2));
		System.out.println("La multiplicación de los valores es: " + (num1 * num2));

		System.out.println("La división de los valores es: " + (num1 / num2));
		
		System.out.println("La potencia de los valores es: " + (Math.pow(num1, num2)));

		System.out.println("La raíz cuadrada del primer valor es: " + (Math.sqrt(num1)));
		System.out.println("La raíz cúbica del primer valor es: " + (Math.cbrt(num1)));
		System.out.println("La raíz n-ésima del primer valor con índice "
				+ "el segundo valor es: " + (Math.pow(num1, 1f / num2)));
	
	}
}












