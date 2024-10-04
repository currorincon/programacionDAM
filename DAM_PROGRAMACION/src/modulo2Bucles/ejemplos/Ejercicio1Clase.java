package modulo2Bucles.ejemplos;

import utils.Util;

public class Ejercicio1Clase {

	public static void main(String[] args) {

		int numUser = 5;
		int resultado = 0;
		int nVeces=0;
		
		for(int i = 0;i>-5;i++) {
			numUser = Util.pedirNumeroUsuario("Dame un "
					+ "numero para sumarlos. 0. para Salir");
			if(numUser != 0){
				resultado = resultado + numUser;
			}else break;
			nVeces++;

		}
		
		//OTRA FORMA
		for(;numUser !=0;) {
			numUser = Util.pedirNumeroUsuario("Dame un "
					+ "numero para sumarlos. 0. para Salir");
			
			resultado = resultado + numUser;
			
			nVeces++;

		}
			
		System.out.println("El valor sumado es: "+ resultado);
		System.out.println("El valor medio es: "+ resultado/nVeces);

		
	}

}
