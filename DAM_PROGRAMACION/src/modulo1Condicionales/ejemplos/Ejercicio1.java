package modulo1Condicionales.ejemplos;

import java.util.*;
import utils.Util;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		//comprobarNumero();
		ejercicio1();
	}
	
	public static void ejercicio1() {
		
		int acumulador =0;
		int numero = 0;
		
		for(int i=0; i<4; i++) {
			
			numero = Util.pedirNumeroUsuario("dame un numero");
			if(numero > 10)
			{
				acumulador = numero + acumulador;
			}
		}
		
		System.out.println("Los numeros mas de 10 suman: " + acumulador);
		
		
	}
	
	public static void comprobarNumero() {
		
		int numero1=0;
		int numero2=0;
		
		
		//numero1 = Util.pedirNumeroUsuario("Introduce un numero"); 
		//numero2 = Util.pedirNumeroUsuario("Introduce otro"); 
		
		numero1 = Util.pedirNumeroAleatorio();
		numero2 = Util.pedirNumeroAleatorio();
		
		
//		int min = Util.pedirNumeroUsuario("Dame el valor min del numero aletorio");
//		int max = Util.pedirNumeroUsuario("Ahora, dame el valor max del numero aletorio");
//
//		numero1 = Util.pedirNumeroAleatorioEntreDosNumeros(min,max);
//		numero2 = Util.pedirNumeroAleatorioEntreDosNumeros(min,max);

		System.out.println("El numero1 es: " + numero1);
		System.out.println("El numero2 es: " + numero2);

		
		if (numero1 == numero2) {
			System.out.println("Los numeros son iguales" + numero1 +" " + numero2);
		}else {
		
				if(numero1 > numero2) {
					
					System.out.println("El mumero mayor es: " + numero1);
		
				}else {
					System.out.println("El mumero mayor es: " + numero2);
				}
		}
		
		
	}

}
