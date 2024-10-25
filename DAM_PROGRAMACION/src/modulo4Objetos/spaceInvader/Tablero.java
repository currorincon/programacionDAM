package modulo4Objetos.spaceInvader;

public class Tablero {

	public static void main(String[] args) {

		Humano [] humanos = new Humano[100];
		Invasor [] invasores = new Invasor[100];

		for(int i=0;i<humanos.length;i++) {
			humanos[i] = new Humano(i);
			System.out.println("Humano "+ i +": "+humanos[i] );
		}
		
		
		for(int i=0;i<invasores.length;i++) {
			invasores[i] = new Invasor(i);
			System.out.println("Invasor "+ i +": "+invasores[i] );
		}
		
		//Coger Invasor
		//Dipara 
		//veo si escudo o quito vida
		//Cogo Humano
		//Disparo
		//Resto vida 
		//REPITO HASTA QUE UNO DE LOS DOS TODOS MUERTOS
		
		
		
	}

}
