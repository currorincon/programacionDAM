package utils;

import java.util.Scanner;

public class Util {
	
	public static int pedirNumeroUsuario(String msg) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println(msg);
		
		int numeroUsuario = sc.nextInt();
		
		return numeroUsuario; 
	}

	public static int pedirNumeroAleatorio() {

		int numeroAleatorio = (int) Math.round(Math.random()*10);
		return numeroAleatorio;
	}

	public static int pedirNumeroAleatorioEntreDosNumeros( int min, int max) {

		int numeroAleatorio = (int) Math.round(Math.random()*(max-min)+min);
		return numeroAleatorio;
	}



}
