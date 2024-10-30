package modulo2Bucles.ejemplos;

import java.util.Scanner;

import utils.Util;

public class Ejercicio1Clase {

	public static void main(String[] args) {

//		int numUser = 5;
//		int resultado = 0;
//		int nVeces=0;
//		
//		for(int i = 0;i>-5;i++) {
//			numUser = Util.pedirNumeroUsuario("Dame un "
//					+ "numero para sumarlos. 0. para Salir");
//			if(numUser != 0){
//				resultado = resultado + numUser;
//			}else break;
//			nVeces++;
//
//		}
//		
//		//OTRA FORMA
//		for(;numUser !=0;) {
//			numUser = Util.pedirNumeroUsuario("Dame un "
//					+ "numero para sumarlos. 0. para Salir");
//			
//			resultado = resultado + numUser;
//			
//			nVeces++;
//
//		}
//			
//		System.out.println("El valor sumado es: "+ resultado);
//		System.out.println("El valor medio es: "+ resultado/nVeces);
//
//		
		boolean variable = ejercicioJose();
		
		//ejercicioJosePro();
		
		
		
	}

	private static void ejercicioJosePro() {
			 
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Introduce un numero:");
			int numero = sc.nextInt();
			int acumuladorresto=0,acumuladordiv=0;
			
			int malaSuerte=0,buenaSuerte=0;
			
			acumuladorresto=numero%10;
			acumuladordiv=numero/10;

			for(int i=0;i<=acumuladordiv;i++) {
		
			
			System.out.println(acumuladorresto);
			
			switch (acumuladorresto) {
			case 0:
			case 1:
			case 2:
			case 4:
			case 5:
			case 6:
				malaSuerte=malaSuerte+1;
				break;
			case 3:
			case 7:
			case 8:
			case 9:
				buenaSuerte=buenaSuerte+1;
				break;
			 }
			
			acumuladorresto=acumuladordiv%10;
			acumuladordiv=acumuladordiv/10;
			
			
			System.out.println(acumuladordiv);
			}
			
			if(buenaSuerte>malaSuerte) {
				System.out.println("Este es un numero de la suerte");
			}else {
				System.out.println("Este es un numero de la mala suerte");
			}
			
		
			sc.close();
			
	}

	public static boolean ejercicioJose() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un numero:");
		int numero = sc.nextInt();
		
		int malaSuerte=0,buenaSuerte=0;
		
//		System.out.println("ddiv: " + numero/10);
//		System.out.println("div: " + numero/100);
//		System.out.println("div: " + (numero - (numero/10)));
//

//		System.out.println("modulo del numero: " + numero%10);
//		System.out.println("el numero menos modulo: " + (numero - (numero%10))/10);
//		int nuevoNumero = (numero - (numero%10))/10;
//		System.out.println("Nuevo nume2 "+ (nuevoNumero%10));
//		
		int auxiliar = numero;

		int numeroCifras = 0;
		
		 while (numero != 0) {
	            numero = numero/10; // Dividir entre 10
	            numeroCifras++; // Incrementar el contador de cifras
	     }
		 System.out.println("numero de cifras " + numeroCifras);
		 
		
	//	for(int i=0;i<numeroCifras;i++) {
		for(int i=0;;i++) {		
			int cifra = auxiliar%10;

			System.out.println("Cifra: " + cifra);
			
			switch (cifra) {
			case 0:
			case 1:
			case 2:
			case 4:
			case 5:
			case 6:
				malaSuerte=malaSuerte+1;
				break;
			case 3:
			case 7:
			case 8:
			case 9:
				buenaSuerte=buenaSuerte+1;
				break;
			 }
			
			auxiliar = (auxiliar - (cifra))/10;
			if(auxiliar == 0)
				break;
			System.out.println("El nuevo numero es: "+ auxiliar);

		}
		
		if(buenaSuerte>malaSuerte) {
			System.out.println("Este es un numero de la suerte");
		}else {
			System.out.println("Este es un numero de la mala suerte");
		}
		
		
		sc.close();
		
		boolean variable = true;
		
		return variable ;
	}
	
	
}
