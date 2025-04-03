package modulo3Arrays.ejemplos.tresenraya;

import java.util.Scanner;

public class Principal {

	
	public static void main(String[] args) {

		boolean ganador = false;
		
		Scanner sc = new Scanner(System.in);
		
		
		//Genero el tablero para jugar
		Tablero tablero = new Tablero();
			
		tablero.mostrarTablero();
		
		do
		{
			
			
			ganador = tablero.ponerFicha();
			tablero.mostrarTablero();
			tablero.jugadores[0].getTipoFicha();
			
			
		}while (!ganador);
		
	}

}
