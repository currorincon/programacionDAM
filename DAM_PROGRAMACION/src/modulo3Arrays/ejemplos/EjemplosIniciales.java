package modulo3Arrays.ejemplos;

import java.util.Scanner;

import utils.Util;

public class EjemplosIniciales {
	
	
	
	
	
	/**
	 * Metodo main que hace la llamada a los métodos iniciales de los ejemplos
	 * 
	 * @param args argumentos que recibe el main cuando se ejecuta
	 */
	public static void main(String[] args) {
		primerEjemploArray();
		//segundoEjemploArray();
		//tercerEjemploArray();
		
		int valor = 3;
		int valorMultiplicadoTRES = 0;
		
		if (false) {
			System.out.println("Mi valor es par");
		}else {
			System.out.println("Mi valor es impar");
		}
		
		valorMultiplicadoTRES = multiplicaTres(valor);
			
		
	}

	
	private static int multiplicaTres(int auxiliar) {
		return auxiliar*3;
	}


	/**
	 * Ejemplo de declaración de un array, inicialización de valores al azar y mostrar el array en consola
	 */
	public static void primerEjemploArray () {
		
		int tamanyo = 0;
		
		tamanyo = Util.pedirNumeroAleatorioEntreDosNumeros(3, 3);
		
		// Declaración del array, a través de la sentencia "new"
		int numeros[] = new int[tamanyo];
		int numerosCopiados[] = new int[numeros.length];
					
		Util.inicializarArrayConNumerosAleatorios(numeros, 0, 10);
		Util.mostrarArray(numeros);
		
		numerosCopiados = Util.copiarArray(numeros);
		multiplicarPorDosArray(numerosCopiados);
		
		numeros = Util.copiarArray(numerosCopiados);
		
		System.out.println("\nEl array multiplicado x2:");
		Util.mostrarArray(numerosCopiados);
		System.out.println("\nY sin multiplicar x2:");
		Util.mostrarArray(numeros);

		
	//	Util.ordenarArray(numeros);
//		System.out.println("\nEl array ordenado:");
//		Util.mostrarArray(numeros);
//		
	}
	
	public static void multiplicarPorDosArray(int[] array) {
		
		for(int i=0; i<array.length;i++ ) {
			array[i] = array[i] * 2;
		}
		
	}
	
	
	/**
	 * Ejemplo de una segunda forma de crear un array, en este caso lo creamos con unos valores directamente, en
	 * lugar de inicializarlo con valores al azar.
	 */
	public static void segundoEjemploArray() {
		// Otra forma de inicializar el array
		int array2[] = new int[] {88, 89, 90, 4, 5, 6, 7, 8, 9, 10};

		for (int i = 0; i < array2.length; i++) {
			System.out.println("Array2[ "+i+"] es igual a  "+ array2[i] );
		} 
		
		// Recorrido del array para imprimir sus valores en pantalla.
		// Este tipo de bucle se conoce como "for each".
		for (int valorDentroDeArray : array2) {
			System.out.println(valorDentroDeArray*2);
		}
	}

	
	/**
	 * Método que crea e inicializa un array con 100 elementos al azar entre 0 y 100.
	 * Después calcula la suma, la media, el mayor y el menor de todos.
	 */
	public static void tercerEjemploArray() {
		
		int suma = 0, mayor, menor;
		float media;
		
		// Declaración del array
		int array[] = new int[10];
		
		// Recorro para inicializar el array
		for (int i = 0; i < array.length; i++) {
			array[i] = Util.pedirNumeroAleatorioEntreDosNumeros(0, 100);
		}
		
		// Recorro e imprimo en pantalla
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println("");
		
		// Recorro para obtener la suma
		for (int i = 0; i < array.length; i++) {
			suma += array[i];
			suma = suma + array[i];
		}
		// Calculo la media
		media = suma / ((float) array.length);
		
		// Mayor y menor
		mayor = array[0];
		menor = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] > mayor) {
				mayor = array[i];
			}
			if (array[i] < menor) menor = array[i];
		}
		
		// Impresión de resultados
		System.out.println("suma: " + suma + " - media: " + media +
				" - mayor: " + mayor + " - menor: " + menor);
	}
}
