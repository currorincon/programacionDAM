package utils;


public class UtilsArrays {

	
	/**
	 * Imprime el array en consola, de forma que queda en una única línea y con
	 * un espacio en blanco entre valores
	 * @param num
	 */
	public static void imprimeArray (int a[]) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}

	/**
	 * Imprime el array en consola, de forma que queda en una única línea y con
	 * un espacio en blanco entre valores
	 * @param num
	 */
	public static void imprimeArray (char a[]) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}

	/**
	 * 
	 * @param a
	 * @param limInf
	 * @param limSup
	 */
	public static void inicializaArray (int a[], int limInf, int limSup) {
		for (int i = 0; i < a.length; i++) {
			a[i] = Utils.obtenerNumeroAzar(limInf, limSup);
		}
	}
	
	
	/**
	 * 
	 * @param array
	 * @return
	 */
	public static int suma (int array[]) {
		int suma = 0;
		for (int i = 0; i < array.length; i++) {
			suma += array[i];
		}
		return suma;
	}
	
	
	/**
	 * 
	 * @param array
	 * @return
	 */
	public static float promedia (int array[]) {
		return suma(array) / (float) array.length;
	}
	
	
	/**
	 * 
	 * @param array
	 * @return
	 */
	public static int mayor (int array[]) {
		int mayor = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] > mayor) mayor = array[i];
		}
		return mayor;
	}
	
	/**
	 * 
	 * @param array
	 * @return
	 */
	public static int menor (int array[]) {
		int menor = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] < menor) menor = array[i];
		}
		return menor;
	}

	
	
	/**
	 * 
	 * @param filas
	 * @param cols
	 * @param valorInicial
	 * @return
	 */
	public static int[][] creaEInicializaMatriz (int filas, int cols, int valorInicial) {
		int m[][] = new int[filas][cols];
		
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[i][j] = valorInicial;
			}
		}
		
		return m;
	}
	
	
	/**
	 * 
	 * @param filas
	 * @param cols
	 * @param minimo
	 * @param maximo
	 * @return
	 */
	public static int[][] creaEInicializaMatrizAlAzar (
			int filas, int cols, int minimo, int maximo) {
		
		int m[][] = new int[filas][cols];
		
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[i][j] = Utils.obtenerNumeroAzar(minimo, maximo);
			}
		}
		
		return m;
	}
	
	
	/**
	 * 
	 * @param m
	 */
	public static void imprimeMatriz (int m[][]) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.print(m[i][j] + "\t");
			}
			System.out.println();
		}
	}

	
	public static void ordenaArray (int a[], boolean asc) {
		boolean hayIntercambios;
		do {
			hayIntercambios = false;
			for (int i = 0; i < (a.length - 1); i++) {
				if ((asc == true && a[i] > a[i + 1]) 
						|| (asc == false && a[i] < a[i + 1])) {
					int aux = a[i];
					a[i] = a[i + 1];
					a[i + 1] = aux;
					hayIntercambios = true;
				}
			}
		} while (hayIntercambios == true);

	}

	public static void ordenaArray(int[] a) {
		ordenaArray(a, true);		
	}
}














