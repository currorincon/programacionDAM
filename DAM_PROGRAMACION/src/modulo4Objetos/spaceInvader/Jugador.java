package modulo4Objetos.spaceInvader;

import utils.Util;

public abstract class Jugador {

	protected int puntosVida = 100;
	protected boolean estaVivo = true;
	protected int id;
	
	Jugador() {
		
	}
	
	public abstract void recibirDisparo();
	
	 
	
	public int getPuntosVida() {
		return puntosVida;
	}

	public void setPuntosVida(int puntosVida) {
		this.puntosVida = puntosVida;
	}

	public boolean isEstaVivo() {
		return estaVivo;
	}

	public void setEstaVivo(boolean estaVivo) {
		this.estaVivo = estaVivo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
}
