package modulo4Objetos.coleccionAntiguedadesLuis;


public class Coches extends Antiguedades {
	
	String marca = null;
	String modelo = null;

	public Coches(int year, String origen, float precioventa, String marca, String modelo) {
		super(year, origen, precioventa);
		this.marca=marca;
		this.modelo=modelo;
		
	}
	
	
	public String toString() {
		
		String mensaje = "el año es " +year +". De origen: " +origen 
				+". Con un precio de: " +precioventa 
				+". de marca " +marca +" y modelo " +modelo;
		return mensaje;
	}

}
