package modulo4Objetos;

public class Perro extends Animal {

	private String raza = "";
	private static String tipoAnimal = "Perro";
	
	Perro( int longitud, float peso, String color) {
		super(longitud, peso, color);
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}
	
	@Override
	public void emitirSonido() {
		System.out.println("Guau");
	}
	
	@Override
	public void correr() {
		super.velocidad += 10;
	}

}
