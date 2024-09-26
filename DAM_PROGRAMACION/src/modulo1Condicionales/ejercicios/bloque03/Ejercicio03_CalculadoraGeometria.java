package modulo1Condicionales.ejercicios.bloque03;

import java.util.Scanner;

public class Ejercicio03_CalculadoraGeometria {

	public static void main(String[] args) {
		int opcion, num1, num2;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\n\tMenú\n"
				+ "\n1.- Hipotenusa de un triángulo."
				+ "\n2.- Superficie de un círculo."
				+ "\n3.- Longitud de una circunferencia."
				+ "\n4.- Área de un rectángulo."
				+ "\n5.- Área de un triángulo."
				+ "\n\nIntroduzca su opción: ");
		opcion = sc.nextInt();
		
		switch (opcion) {
		// Hipotenusa de un triángulo rectángulo
		case 1:
			System.out.println("Introduzca primer cateto: ");
			num1 = sc.nextInt();
			System.out.println("Introduzca segundo cateto: ");
			num2 = sc.nextInt();
			System.out.println("Resultado = " + Math.hypot(num1, num2));
			break;
		// Superficie de un círculo
		case 2:
			System.out.println("Introduzca radio del círculo: ");
			num1 = sc.nextInt();
			System.out.println("Resultado = " + (Math.PI * Math.pow(num1, 2)));
			break;
		// Longitud de una circunferencia
		case 3:
			System.out.println("Introduzca radio del círculo: ");
			num1 = sc.nextInt();
			System.out.println("Resultado = " + (2 * Math.PI * num1));
			break;			
		// Área de un rectángulo
		case 4:
			System.out.println("Introduzca la base: ");
			num1 = sc.nextInt();
			System.out.println("Introduzca la altura: ");
			num2 = sc.nextInt();
			System.out.println("Resultado = " + (num1 * num2));
			break;
		// Área de un triángulo
		case 5:
			System.out.println("Introduzca la base: ");
			num1 = sc.nextInt();
			System.out.println("Introduzca la altura: ");
			num2 = sc.nextInt();
			System.out.println("Resultado = " + (num1 * num2) / 2);
			break;

		}
	}

}
