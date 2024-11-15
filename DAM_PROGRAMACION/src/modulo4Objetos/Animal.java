package modulo4Objetos;

import utils.Util;

public abstract class Animal {

	//Propiedades estaticas
	//0-perro 1-gato 2-loro
	public static int tipoPERRO = 0; //perro
	public static int tipoGATO = 1; //gato
	public static int tipoLORO = 2; //gato
	
	//Propiedades internas 
	private int longitud = 0;
	private float peso = 0;
	private String color =null;
	private int tipo = 0;
	private String nombre ="";
	private int id = Util.pedirNumeroAleatorioEntreDosNumeros(0,100000);
	protected int velocidad =0; 
	
	/**
	 * Metodo constructo de la clase Animal para crear un Animal con un nombre
	 * @param nombre nombre que va a recibir el animal
	 */
	public Animal(String nombre){
		this.nombre=nombre;
	}
	
	/**
	 * Metodo secundario para la clase Animal para crear un Animal con un nombre
	 * @param animal tipo de animal que es
	 * @param nombre nombre que va a recibir el animal
	 */
	Animal(int animal, String nombre){
		this.nombre = nombre;
		tipo = animal;

	}
	
	Animal(int longitud, float peso, String color){
		
		this.longitud = longitud;
		this.peso = peso;
		this.color  = color;

		
	}
	public String toString() {
	
		String identificar = "ID: " + id + "nombre: " + nombre;
		return identificar;
		
	}

	
	public int getID() {
		return this.id;
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
	public void setPeso(float nuevoPeso) {
		this.peso = nuevoPeso;
	}
	
	public float getPeso() {
		return this.peso;
	}
	
	
	
	public void mostrarCaracteristicas() {
		System.out.println("Hola, soy " + nombre  +" mis caracteristicas son :" 
				+ longitud + " longitud " + peso + " peso " +" y color " +
				 color);
		
	
		
	}
	

		
	
	void identificarme() {		
		System.out.println("Hola soy " + tipo);
	}
	
	void saltar() {
		
	}
	
	public abstract void emitirSonido();
	
	void andar() {
		this.velocidad +=2;
		
	}
	
	void correr() {
		
		velocidad *= 2;
		
	}
	
	void atacar(){
		
	}
	
	
	

}
