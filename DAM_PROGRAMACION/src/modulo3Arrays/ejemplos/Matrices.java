package modulo3Arrays.ejemplos;

import utils.Util;

public class Matrices {

	
	
	
	
	public static void main(String []args) {
		
		int matriz [][] = new int[3][3];
		
		
//		int vector [] = new int [] {2,3,4};
//		
//		int m2[][] = new int[][] {{1, 0, 0}, {0, 1, 0}, {0, 0, 1}};

		System.out.println("Longitud fila: " + matriz.length);
		System.out.println("Longitud columna: " + matriz[0].length);

		inicializarMatriz(matriz);
		mostrarMatriz(matriz);
				
//		for (int i = 0; i < matriz.length; i++) {
//			for (int j = 0; j < matriz[0].length; j++) {
//				matriz[i][j] = 3;
//			}
//		}
//		
//		mostrarMatriz(m2);
//		
//		System.out.println("MAtriz 2: ");
//		mostrarMatriz(m2);
//		mostrarDiagonalMatriz(m2);

		
	}
	
	
	
	
	private static void mostrarDiagonalMatriz(int[][] m) {

	if(m.length == m[0].length)
		for (int i = 0; i < m.length; i++) {
			System.out.print("La matriz diagonal es: " + m[i][i]);
		}
	else System.out.println("Su matriz no es cuadra, señor");
		
	}




	/**
	 * 
	 * 
	 * 
	 * 
	 * @param m
	 */
	public static void inicializarMatriz(int [][]m) {
		
		int cont = 1;
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[i][j] = Util.pedirNumeroAleatorioEntreDosNumeros(0, 50);
			//	m[i][j] = cont;
			//	cont++;
			}
		}
	}
	
	
	/**
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	public static void mostrarMatriz(int [][]m) {
		
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.print(m[i][j] + "\t");
			}
			System.out.println();
		}
	}
	
	
	
}
