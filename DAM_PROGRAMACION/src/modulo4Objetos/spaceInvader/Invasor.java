package modulo4Objetos.spaceInvader;

import utils.Util;

public class Invasor extends Jugador {

	private int danyoArma = Util.pedirNumeroAleatorioEntreDosNumeros(0, 100);
	private String [] partesCuerpo = {"cabeza", "brazos", "pies", "pecho"};
	
	public Invasor(int id) {
		setId(id);
	}

	public String toString() {
		return "Invasores " + super.getId() + " vida: " 
	+ super.getPuntosVida() + " Daño del arma: " + danyoArma;
		
	}
	
}
