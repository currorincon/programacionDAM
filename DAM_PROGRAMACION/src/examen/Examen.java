package examen;

import java.util.Random;
import java.util.Scanner;

import utils.Util;
import utils.Utils;

public class Examen {

	public static void main(String[] args) {
		
		//ejercicio1();
		//ejercicio2();
		//ejercicioAdrian();
	    //ejercicio3();
		//ejercicoCHATGPT();
		//corregir();
		
		//ejercicio4();
		ejercicio5();
		
	
	}
	
	/**
	 * 

5. (2 puntos)  Compresión de cadenas. Implementa un programa que 
comprima una cadena contando 
el número de repeticiones de cada carácter. 
Por ejemplo, si disponemos de una cadena 
como “aarrrtssss” la cadena se comprimirá obteniendo “a2r3t1s4”.
	 */

	private static void ejercicio5() {

//		String cadena = "aaarrttsaaa";
//		int index = 0;
//		int numeroRepeticiones = 0;
//		int maximoRepeticiones = 0;
//		
//		char c [] = cadena.toCharArray();
//		
//		
//		Util.mostrarArrayCaracter(c);
//		
//		for (int i = 0; i<c.length; i = i+numeroRepeticiones ) {
//			numeroRepeticiones=0;
//			
//			
//			for (int j = i; j < c.length; j++) {
//				if (c[i] == c[j])
//					numeroRepeticiones++;
//					
//			}
//			
//			System.out.print((char)c[i] + "" +  numeroRepeticiones);
//			
//		}
		
		//Se pide una cadena al ususario
				
		
				String cadena = "ssstttaaarar";
				int contadorRepeticiones = 0;
				boolean loop = false;
				
				
				//Se crea un bucle en el que no parará hasta que se pasen por todas las letras
						
				while(!loop) {
					
					
					//Se elige la primera letra de la cadena
					char letra = cadena.charAt(0);
					contadorRepeticiones = 0;
					
					
					
					//Se itera sobre toda la cadena contando cuantas veces aparece la letra
					for(int i = 0;i<cadena.length();i++) {
						if(cadena.charAt(i) == letra) {
							contadorRepeticiones++;
						}else {
							//Si la letra no coincide, para el bucle for con break. La intencion es parar el bucle for cuando cambia de letra
							break;
						}
					}
					
					
					//Se imprime sin salto de linea la letra junto a sus repeticiones
					System.out.print(letra+""+contadorRepeticiones);
					
					
					
					//Si el numero de repeticiones es menor que la longitud, se corta la cadena para quedarse con el resto de letras no contadas
					//Ejemplo "aarrr", tras contar la letra "a" pasa la cadena a "rrr"
					if(cadena.length()>contadorRepeticiones) {
						cadena = cadena.substring(contadorRepeticiones, cadena.length());
					}else {
						//si el contador de repeticiones es 0 (teniendo en cuenta que el contador se reinicia cada iteracion a 0), termina el bucle
						loop = true;
					}
					
				}
		
		
	}


	private static void ejercicio4() {

		int []numeros = new int [50]; 
		Util.inicializarArrayConNumerosAleatorios(numeros, 1, 10);
		Util.mostrarArray(numeros);
		
		int []numerosMayores = new int [numeros.length];
		Util.inicializarArrayConNumeroFijo(numerosMayores, -1);
		
		int index = 0;
		int numeroRepeticiones = 0;
		int maximoRepeticiones = 0;
		
	
		
		
		
		for (int i = 0; i<numeros.length; i++ ) {
			numeroRepeticiones=0;
			for (int j = 0; j < numeros.length; j++) {
				if (numeros[i] == numeros[j])
					numeroRepeticiones++;
					
			}
			
			if(numeroRepeticiones >= maximoRepeticiones) {
				maximoRepeticiones = numeroRepeticiones;
				
				if(!Util.estaNumeroArray(numeros[i], numerosMayores)) {
					numerosMayores[index] = numeros[i];
					index++;				
				}
			}
			
			
		}
		
		for (int z = 0; z < numerosMayores.length; z++) {
			if(numerosMayores[z] != -1) {
				System.out.println("\nEl numero mayor es: " + numerosMayores[z] 
					+" se repite  " + maximoRepeticiones);
			}
		}
		
		
	}


	private static void corregir() {
		 
			int []numeros = new int[] {2,3,5,7,89,9,5,4,2,3,5,5,12};
	        int divisor = 2, contador = 0;
	        boolean esPrimo = false;

	        // Declaramos un bucle for que recorra el vector
	        for(int i = 0; i < numeros.length; i++)
	        {
	            do // Creamos un bucle do que compruebe si el numero actual da de resto 0 al dividirse entre el divisor mientras que el numero actual sea menor que el divisor
	            {
	                if(numeros[i] % divisor == 0)
	                {
	                    esPrimo = false;
	                }
	                divisor++; // Para salir del bucle, debemos incrementar el valor del divisor
	            }while(numeros[i] < divisor);

	            // Si el numero actual entre el divisor no da de resto 0, el numero es primo
	            if(numeros[i] % divisor != 0)
	            {
	                esPrimo = true;
	                System.out.println("El numero " + numeros[i] + " es primo");
	                contador++; // Si el do se sigue ejecutando, se incrementará el valor de contador
	            }
	            else // Si da de resto 0, el numero no es primo
	            {
	                System.out.println("El numero " + numeros[i] + " no es primo");
	            }
	        }

	        // Mediante una variable contador, podemos cuantificar cuantos numeros primos se han generado
	        System.out.println("\nHay un total de " + contador + " numeros primos");

	}
	
	
	
	
	

	private static void ejercicoCHATGPT() {
	    int[] array = new int[] {2, 3, 1, 3, 4, 1};

        // Pedimos al usuario el valor de la suma deseada
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el valor de la suma deseada: ");
        int sumaObjetivo = scanner.nextInt();
    	//String para guardar los numeros que van saliendo
		String numeros = "";
		
		
		for(int numero = 0; numero <array.length; numero++) {
			for(int i = 0;i<array.length;i++) {
				if(!numeros.contains(numero+"")) {
					if(numero+array[i]==sumaObjetivo) {
						System.out.println(numero+" "+array[i]+" = 5");
						numeros += numero;
					}
				}
				
			}
			
		}
	}

	private static void ejercicio3() {

		int [] array = new int[] {2,3,1,3,4,1};	
		int [] arrayNumerosEncontrado = new int[array.length];
		int contador = 0;

		int numeroUsuario = Util.pedirNumeroUsuario("Dame un numero");
		//Util.inicializarArrayConNumerosAleatorios(array, 1, 10);
		Util.mostrarArray(array);
		
		for(int z =0; z<arrayNumerosEncontrado.length;z++) {
			arrayNumerosEncontrado[z] = 0;
		}
		
//		for(int i = 0; i<array.length; i++) {
//			System.out.println("\nLa i: " +i + "Array i: " +array[i] );
//
//			for(int j = 0; j<array.length; j++) {
//				
//				for(int k = 0;k<arrayNumerosEncontrado.length;k++) {
//				 if(arrayNumerosEncontrado[k] != array[i]) {
//					if(array[i] < numeroUsuario && array[j] < numeroUsuario ) {
//						if(array[i] + array[j] == numeroUsuario) {
//							arrayNumerosEncontrado[contador] = array[i];
//							contador++;
//							System.out.println("\n" + array[i] +" "+ array[j] + "suman: "+numeroUsuario);
//						}
//					}
//				 }
//			}
//			}
//		}

		for(int k = 0;k<arrayNumerosEncontrado.length;k++) {
			for(int i = 0; i<array.length; i++) {
			
				if(arrayNumerosEncontrado[k] != array[i]) {
					for(int j = 0; j<array.length; j++) {					
					if(array[i] < numeroUsuario && array[j] < numeroUsuario ) {
						if(array[i] + array[j] == numeroUsuario) {
							arrayNumerosEncontrado[contador] = array[i];
							contador++;
							System.out.println("\n" + array[i] +" "+ array[j] + "suman: "+numeroUsuario);
							break;
						}
					}
					
				}
				
				
			}
			}
			
			
		}
		
		
		
		
	}

	private static void ejercicioAdrian() {
		/**
		 * @author Adrián encontrar la cantidad de numeros primos de un array.
		 */
		/*
		 * declaramos las variables maximo y minimo para generar números aleatorios,
		 * contadores de primos y no primos, un array y un boleano esPrimo.
		 */
		int numeros[] = new int[5];
		int max = 5, min = 1, contadorPrimo = 0, contadorNoPrimo = 0;
		boolean esPrimo = true;
		
		
		
		// creamos un bucle para rellenar los datos del array.
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = (int) (Math.random() * (max - min + 1)) + min;
		
			System.out.println("Numero: " +numeros[i] + " iter " + i);
			for (int j = numeros[i] - 1; j < numeros.length; j++) {
				while (numeros[i] % j == 0) {
					esPrimo = false;
					contadorPrimo += 1;
				}
				if (esPrimo = true) {
					contadorNoPrimo += 1;
				}
				// imprimimos la cantidad de primos y la cantidad de no primos.
				
			}
		}
		System.out.println("La cantidad de números primos es: " + contadorPrimo);
		System.out.println("La cantidad de númeoros no primos es: " + contadorNoPrimo);
					
	}

	private static void ejercicio2() {

		int [] array = new int[100];	
		int contadorPrimos = 0;
		Util.inicializarArrayConNumerosAleatorios(array, 0, 100);
				
		for(int i=0; i<array.length;i++) {
			if(esPrimo(array[i])) {
				contadorPrimos++;
				System.out.println("Los primos son "+ array[i]);
			}
		}
		
		System.out.println("el numero de primos es: " + contadorPrimos);
		
		
	}

	private static boolean esPrimo(int numero) {

		for(int i=numero-1; i>1 ;i--) {
			if(numero%i == 0) {
				return false;
			}
		}
		return true;
	}

	private static void ejercicio1() {

		
		int num = Util.pedirNumeroUsuario("Dame un numero");  
		int divisores = 0;
		
		//Vamos a sacarle los divisores
		for(int i=num-1; i>0;i--) {
			if (num%i == 0) {
				divisores = divisores + i;
			}
		}
		
		if(divisores == num) {
			System.out.println("El numero es perfecto");
		}else System.out.println("El numero No es perfecto");
		
		
		
	}

}
