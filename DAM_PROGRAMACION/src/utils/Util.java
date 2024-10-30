package utils;

import java.util.Scanner;

public class Util {
	
		
	
	/**
	 * METODO PARA PEDIR un numero al usuario y se le pasa un mensaje
	 * @param msg Es el mensaje que recibe el metodo para imprimir por consola
	 * @return numero solicitado al usuario
	 */
	public static int pedirNumeroUsuario(String msg) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println(msg);
		
		int numeroUsuario = sc.nextInt();
		
		return numeroUsuario; 
	}
	
	public static String pedirStringUsuario(String msg) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println(msg);
		
		String stringUsuario = sc.nextLine();
		
		return stringUsuario; 
	}

	public static int pedirNumeroAleatorio() {

		int numeroAleatorio = (int) Math.round(Math.random()*10);
		return numeroAleatorio;
	}

	/**
	 * Solicitar un numero aleatorio entre dos numeros, uno minimo y uno maximo
	 * 
	 * @param min Limite inferior del numero aleatorio
	 * @param max Limite superior del numero aleatorio
	 * @return el numero aleatorio 
	 */
	public static int pedirNumeroAleatorioEntreDosNumeros( int min, int max) {

		int numeroAleatorio = (int) Math.round(Math.random()*(max-min)+min);
		return numeroAleatorio;
	}

	public static void mostrarArray(int[] array) {

		// Recorrido del array para imprimir sus valores en pantalla
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		} 
		
	}

	public static void inicializarArrayConValoresUsuario(int[] array) {
		
		// Inicialización de los valores del array con numeros pedidos al usuario
		for (int i = 0; i < array.length; i++) {
			array[i] = Util.pedirNumeroUsuario("Mete el valor del array");
		}
				
	}

	/**
	 * Metodo para inicializar un Array con numeros aleatorios entre un limite max y min
	 * 
	 * @param array array para guardar los numeros
	 * @param min numero inferior aleatorio
	 * @param max numero maximo aleatorio
	 */
	public static void inicializarArrayConNumerosAleatorios(int[] array, int min, int max) {
				
		// Inicialización de los valores del array con numeros aleatorios del 0 al 10 
		for (int i = 0; i < array.length; i++) {
			array[i] = Util.pedirNumeroAleatorioEntreDosNumeros(min, max);
		}		
	}

	/**
	 * Metodo para ordenar un array
	 * @param Un array [numeros]
	 */
	public static void ordenarArray(int[] numeros) {

		//numeros[i]
		int aux = 0;
		
		for(int i=0;i<numeros.length;i++)
		{
			System.out.println("\nIteracion i: " + i);
			for(int j=i;j<numeros.length;j++) {
				System.out.println("\tIteracion j: " + j);

				if(numeros[i] > numeros[j]) {
					System.out.println("El numero " + 
					numeros[i] + " es menor que " + numeros[j]);
					aux = numeros[i];
					numeros[i] = numeros[j];
					numeros[j] = aux;
					
				}
				
				
			}
			System.out.println("Tras la primera vuelta, array: ");
			mostrarArray(numeros);	
		}
		
	}

	public static int[] copiarArray(int[] numeros) {

		int arrayCopiados [] = new int[numeros.length];
		
		for(int i=0; i<arrayCopiados.length;i++) {
			arrayCopiados[i]= numeros[i];	
		}
		
		return arrayCopiados;
	}
	
	public static boolean esParImpar(int valor) {
		
		boolean parImpar = false;
		
		if(valor%2 == 0) {
			parImpar = true; 
		}
		return parImpar;
	}


}
