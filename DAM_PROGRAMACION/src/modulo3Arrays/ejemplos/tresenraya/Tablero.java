package modulo3Arrays.ejemplos.tresenraya;

import utils.Util;

public class Tablero {

	int [][] matrix = new int[][]{{0,0,0},{0,0,0},{0,0,0}};
	Jugador [] jugadores = new Jugador[2];
	
	Tablero() {
		jugadores[0] =new Jugador(Util.pedirStringUsuario("Dime nombre jugador 1: "),1,true);
		jugadores[1] =new Jugador(Util.pedirStringUsuario("Dime nombre jugador 2: "),2,false);
	}
	
	private int turnoJugador() {
		if(jugadores[0].isTurno())
			return 0;
		else return 1;
		
	}
	
	public boolean ponerFicha() {

		boolean hayGanador = false;
		
		System.out.println("Jugador: " + jugadores[turnoJugador()].getNombre() 
				+ "Ficha : " + jugadores[turnoJugador()].getTipoFicha());
			
		int fila = Util.pedirNumeroUsuario("Dame la fila: ");
		int columna = Util.pedirNumeroUsuario("Dame la columna: ");
		
		if (comprobarPosicion(fila, columna)) {
			matrix[fila][columna] = jugadores[turnoJugador()].getTipoFicha();
		}else return ponerFicha();
			
		hayGanador =  comprobrarGanador(fila, columna, turnoJugador());
		
		if(hayGanador)
			System.out.println("TENEMOS GANADOR: " + jugadores[turnoJugador()].getNombre());

		cambiarTurno(turnoJugador());
		
		if(comprobarTablas())
			System.out.println("Hay tablas, paquetes");
		
		return hayGanador;
	}

	private boolean comprobarTablas() {

		boolean hayTablas = true;
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				if(matrix[i][j] == 0) {
					hayTablas = false;
					
				}
			}
		}
		
		return hayTablas;
		
	}

	private void cambiarTurno(int turnoActual) {

		
		if (turnoActual %2 == 0) {
			jugadores[1].setTurno(true);
			jugadores[0].setTurno(false);
		}else {
			jugadores[0].setTurno(true);
			jugadores[1].setTurno(false);
		}
			
	}

	private boolean comprobarPosicion(int fila, int columna) {
		
		boolean esCorrecta = false;
		
		if(fila < matrix.length && fila >= 0) 
			esCorrecta = true;
		else {
			System.out.println("Fila tas colao");
			return false;
		}
		
		if(columna < matrix[0].length && columna >= 0)
			esCorrecta = true;
		else {
			System.out.println("Columna tas colao");
			return false;
		}
		
		
		if(matrix[fila][columna] == 0)
			esCorrecta = true;
		else {
			System.out.println("Ta ocupao, tonto");
			return false;
		}



		System.out.println("Bien puesta, Es correcta " + esCorrecta);
		return esCorrecta;
	
	
	}
	
	public void mostrarTablero() {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				System.out.print(matrix[i][j] + "\t");
			}
			System.out.println();
		}
	}

	public boolean comprobrarGanador(int fila, int columna, int jugador) {

		if (comprobarHorizontal(fila, columna, jugador) ||
				comprobarVertical(fila, columna, jugador) ||
					comprobarDiagonalPrincipal(fila, columna, jugador) ||
						comprobarDiagonalInversa(fila, columna, jugador) )
				return true;
		return false;
	}

	private boolean comprobarDiagonalPrincipal(int fila, int columna, int jugador) {

		boolean hayDiagonal = true;
		
		//Comprobar diagonal principal 
		for (int i = 0; i < matrix.length; i++) {
			if(matrix[i][i] != jugadores[jugador].getTipoFicha()) {
			hayDiagonal = false;
			break;
			}
		}
		
			
		return hayDiagonal;
	}

	private boolean comprobarDiagonalInversa(int fila, int columna, int jugador) {

		boolean hayDiagonal = true;
		
		
		//Comprobar diagonal inversa 
		for (int i = 0; i < matrix.length; i++) {
			if(matrix[i][matrix.length-1-i] != jugadores[jugador].getTipoFicha()) {
			hayDiagonal = false;
			break;
			}
		}
		
		
		return hayDiagonal;
	}

	
	private boolean comprobarVertical(int fila, int columna, int jugador) {

		boolean hayColumna = true;
		
		for (int i = 0; i < matrix.length; i++) {
			if(matrix[i][columna] != jugadores[jugador].getTipoFicha()) {
			hayColumna = false;
			break;
			}
		}
		
		return hayColumna;
	}

	private boolean comprobarHorizontal(int fila, int columna, int jugador) {
		
		boolean hayFila = true;
		
		for (int i = 0; i < matrix.length; i++) {
			if(matrix[fila][i] != jugadores[jugador].getTipoFicha()) {
			hayFila = false;
			break;
			}
		}
		
		return hayFila;

	}
	
}
