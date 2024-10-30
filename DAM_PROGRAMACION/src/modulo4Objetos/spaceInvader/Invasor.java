package modulo4Objetos.spaceInvader;

import utils.Util;

public class Invasor extends Jugador {

	private int danyoArma = Util.pedirNumeroAleatorioEntreDosNumeros(0, 100);
	//private String [] partesCuerpo = {"cabeza", "brazos", "pies", "pecho"};
	
	public Invasor(int id) {
		setId(id);
	}
	/**
	 * 
	 * 
	 * 
	 */
	@Override
	public String toString() {
		return "Invasores " + super.getId() + " vida: " 
	+ super.getPuntosVida() + " Daño del arma: " + danyoArma;
		
	}
	/**
	 * 
	 * 
	 * 
	 * 
	 */
	@Override
	public void recibirDisparo() {
		super.puntosVida -= Util.pedirNumeroAleatorioEntreDosNumeros(5, 25);
	
		if(danyoArma > 30) {
			super.puntosVida -= 10;
		}
		
		if (super.puntosVida <= 0) {
			super.estaVivo = false;
			super.puntosVida = 0;
		}
		
	}
	
	 
	
	
}
