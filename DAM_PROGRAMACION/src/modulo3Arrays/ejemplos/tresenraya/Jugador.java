package modulo3Arrays.ejemplos.tresenraya;

public class Jugador {

	String nombre = null;
	boolean turno = false;
	int tipoFicha = 0;
	
	Jugador(String nombre, int tipoFicha, boolean turno){
		this.nombre = nombre;
		this.tipoFicha = tipoFicha;
		this.turno = turno;		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public boolean isTurno() {
		return turno;
	}

	public void setTurno(boolean turno) {
		this.turno = turno;
	}

	public int getTipoFicha() {
		return tipoFicha;
	}

	public void setTipoFicha(int tipoFicha) {
		this.tipoFicha = tipoFicha;
	}
	
		
	
}
