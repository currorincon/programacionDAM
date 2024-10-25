package modulo4Objetos.spaceInvader;

import utils.Util;

public class Humano extends Jugador {

	private int danyoArma = Util.pedirNumeroAleatorioEntreDosNumeros(0, 50);
	boolean escudo = true;
	
	public Humano(int id) {
		super.setId(id);
	}
	
	public String toString() {
		return "Humano " + super.getId() + " vida: " 
	+ super.getPuntosVida() + " escudo: " + escudo;
		
	}

}
