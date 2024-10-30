package modulo4Objetos.spaceInvader;

import utils.Util;

public class Humano extends Jugador {

	private int danyoArma = Util.pedirNumeroAleatorioEntreDosNumeros(0, 50);
	boolean escudo = true;
	
	public Humano(int id) {
		super.setId(id);
		
		if ( Util.pedirNumeroAleatorioEntreDosNumeros(0, 1) == 0) {
			escudo=false;
		}
		
	}
	
	public String toString() {
		return "Humano " + super.getId() + " vida: " 
	+ super.getPuntosVida() + " escudo: " + escudo;
		
	}

	@Override
	public void recibirDisparo() {
		
		if(!escudo)
			super.puntosVida -= Util.pedirNumeroAleatorioEntreDosNumeros(5, 25);
		else System.out.println("Tengo escudo, payaso");
		
	
		if (super.puntosVida <= 0) {
			super.estaVivo = false;
			super.puntosVida = 0;
		}		
	}

}
