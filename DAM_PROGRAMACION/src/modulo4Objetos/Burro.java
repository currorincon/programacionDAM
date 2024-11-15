package modulo4Objetos;

public class Burro extends Animal implements AnimalVolador {

	public Burro(String nombre) {
		super(nombre);
	}

	private int capacidadCarga = 0;

	@Override
	public void emitirSonido() {
		System.out.println("Ioooooo IoOoooo");
	}

	@Override
	public void vuelaAltoVuela() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void vuelaARasSuelo() {
		// TODO Auto-generated method stub
		
	}
	

}
