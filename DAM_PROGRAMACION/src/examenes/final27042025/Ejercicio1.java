package examenes.final27042025;

import java.util.Random;

public class Ejercicio1 {
	
	 public static void main(String[] args) {
	        int[] array = new int[15];
	        Random rand = new Random();

	        // Inicializar el array con valores aleatorios entre 1 y 100
	        for (int i = 0; i < array.length; i++) {
	            array[i] = rand.nextInt(100) + 1;
	        }

	        // Mostrar el array
	        System.out.print("Array generado: ");
	        for (int num : array) {
	            System.out.print(num + " ");
	        }
	        System.out.println();

	        // Encontrar la mayor diferencia absoluta entre consecutivos
	        int maxDif = 0;
	        int num1 = 0, num2 = 0;

	        for (int i = 0; i < array.length -1; i++) {
	            int diferencia = Math.abs(array[i] - array[i + 1]);
	            if (diferencia > maxDif) {
	                maxDif = diferencia;
	                num1 = array[i];
	                num2 = array[i + 1];
	                
	                
	                // index = i y posteriormente array[index] y array[]
	            }
	            
	        }

	        // Mostrar los resultados
	        System.out.println("Números con mayor diferencia: " + num1 + " y " + num2);
	        System.out.println("Mayor diferencia: " + maxDif);
	    }

}