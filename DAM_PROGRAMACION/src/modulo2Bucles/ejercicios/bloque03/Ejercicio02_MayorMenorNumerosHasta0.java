package modulo2Bucles.ejercicios.bloque03;

import java.util.Scanner;

public class Ejercicio02_MayorMenorNumerosHasta0 {

	public static void main(String[] args) {
		int mayor = 0, menor = 0, num = 1;
		Scanner sc = new Scanner(System.in);

		
		for (int i = 0; num != 0; i++) {
			System.out.println("Introduzca número: ");
			num = sc.nextInt();
			if (i == 0) {
				mayor = num;
				menor = num;
			}
			else {
				if (num > mayor) mayor = num;
				if (num < menor) menor = num;
			}
		}
			
		System.out.println("Mayor: " + mayor + " - Menor: " + menor);

	}

}
