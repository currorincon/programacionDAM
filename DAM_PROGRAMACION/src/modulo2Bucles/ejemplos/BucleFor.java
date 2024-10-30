package modulo2Bucles.ejemplos;

import utils.Util;
import utils.Utils;

public class BucleFor {

	public static void main(String[] args) {

		Utils.obtenerCadena();
		
		//tabladeMultiplicar();
		//numeroPrimo();
		//primoWhile();
		
		int cantidad = 5;	
		
		int [] myArray = new int[cantidad];
		int [] myArrayInverso = new int[myArray.length];
 		
		for(int i=0; i<cantidad;i++) {
			myArray[i] = Utils.obtenerNumeroAzar(90, 100);
				
		}
		
		for(int i=0; i<cantidad;i++) {
				System.out.println("El array "+ i +"  es: " + myArray[i]);
		}
		
		int contador=0;
		
		for(int i=cantidad-1; i>=0;i--) {
			myArrayInverso[contador] = myArray[i];
			contador++;
		}
		
		ejercicio1();
		

		
	}
	private static void ejercicio1() {
		int numeroUsuario = 93;
		int cantidad = 5;	
		
		int [] myArray = new int[cantidad];
		int [] myArrayInverso = new int[myArray.length];
 		
		for(int i=0; i<cantidad;i++) {
			System.out.println("El array "+ i +"  es: " + myArrayInverso[i]);
			if(numeroUsuario == myArrayInverso[i])
			   System.out.println("Numero encontrado " + numeroUsuario);
		}
	}
	
	
	private static void factorial() {
		
		
		int numFactorial = Util.pedirNumeroUsuario("Dime cual quieres para factorial");
		int resultado = 1;
		
		for (int i=numFactorial ;i>1  ;i--  ) {
			resultado = resultado * i;
		}
		System.out.println("Factorial: " + resultado);
		
	}
	
	private static void primoWhile() {
		
		int numPrimos = Util.pedirNumeroUsuario("Dime hasta que primos busco");
		
		boolean esPrimo = true;
		
		
		int contador = numPrimos;
		while (contador > 1)	
		{		
			esPrimo = true;
			for( int i = contador-1;i > 1 ;i--) {
				
				if(contador%i == 0)
				{
					esPrimo = false;
				}
					
			}
			if(esPrimo)
				System.out.println("El numero "+ contador + " es primo");
			contador = contador -1;
		}	
		
		
		
		
	}

	private static void numeroPrimo() {

		int numPrimos = Util.pedirNumeroUsuario("Dame cantidad de primos que quieres saber");
		
		boolean esPrimo = true;
		int contador = 0;
		
		for (int i = 2; contador < numPrimos; i++) {
			esPrimo = true;
			for(int j = i-1; j>1; j--) {
				
				if(i%j == 0) {
					esPrimo = false;
					break;
				}
					
			}
			if(esPrimo) {
				System.out.println("El numero es primo " + i);
				contador = contador + 1;
			}
		}		
		
		
		
		
		//CODIGO PARA SABER LOS X PRIMEROS NUMEROS
//		boolean esPrimo = true;
//		
//		for (int j = numPrimos; j > 1; j--) 
//		{
//			esPrimo = true;
//			for( int i = j-1;i > 1 ;i--) {
//				
//				if(j%i == 0)
//				{
//					esPrimo = false;
//				}
//					
//			}
//			if(esPrimo)
//				System.out.println("El numero "+ j + " es primo");
//			
//		}	
//		
		
		
	}

	private static void tabladeMultiplicar() {
		int variable = Util.pedirNumeroUsuario("Dime que tabla quieres");
		
//		for(int i=0;i<10;i++) {
//			
//			if(i%2 == 0) {
//			System.out.println("La tabla del " + variable +": "+
//					variable +"x"+i+"="+variable*i );
//			}
//		}
	
//		for(int i=5;i<10;i++) {
//			
//			System.out.println("La tabla del " + variable +": "+
//					variable +"x"+i+"="+variable*i );
//			
//		}
		int factor = 5;
		
		for(int i=5;i>3;i++) {
			
			System.out.println("La tabla inversa del " + variable +": "+
					variable +"x"+i+"="+variable*i );
			
		}
	
		
	}
	
	
	

}
