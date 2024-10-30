package modulo4Objetos.spaceInvader;

public class Tablero {
	
	public Humano [] humanos = new Humano[3];
	public Invasor [] invasores = new Invasor[3];

	public Tablero() {
		
		
		
	}
	
	
	public void generarRivales() {

		for(int i=0;i<humanos.length;i++) {
			humanos[i] = new Humano(i);
			System.out.println("Humano "+ i +": "+humanos[i] );
		}
		
		
		for(int i=0;i<invasores.length;i++) {
			invasores[i] = new Invasor(i);
			System.out.println("Invasor "+ i +": "+invasores[i] );
		}
		
		
	}
	
	public void muestraEstadoActual() {
		
		for (int i = 0; i < humanos.length; i++) {
			System.out.println(humanos[i] + " - ");
		}
		System.out.println();
		for (int i = 0; i < invasores.length; i++) {
			System.out.println(invasores[i] + " - ");
		}
		System.out.println("\n");
	}

	public Humano getPrimerHumanoVivo() {
		for (int i = 0; i < humanos.length; i++) {
			if (humanos[i].isEstaVivo() == true) {
				return humanos[i];
			}
		}
		return null;
	}


	public Invasor getPrimerMalvadoVivo() {
		for (int i = 0; i < invasores.length; i++) {
			if (invasores[i].isEstaVivo() == true) {
				return invasores[i];
			}
		}
		return null;
	}

	
}
