package modulo4Objetos;

public class Gato extends Animal {
	
	public int camada = 0;
	private static String tipoAnimal = "Gato";

	public Gato(String nombre) {
		super(nombre);
		// TODO Auto-generated constructor stub
	}

	public Gato(int animal, String nombre) {
		super(animal, nombre);
		// TODO Auto-generated constructor stub
	}

	public Gato( int longitud, float peso, String color) {
		super(longitud, peso, color);
		// TODO Auto-generated constructor stub
	}
	
	public void crearMaullido() {
		System.out.println("Miuauauau");
	}

	
	public void emitirSonido() {
		System.out.println("Miau");
	}

}
