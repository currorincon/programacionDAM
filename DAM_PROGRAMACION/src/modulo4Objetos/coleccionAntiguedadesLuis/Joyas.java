package modulo4Objetos.coleccionAntiguedadesLuis;


public class Joyas extends Antiguedades {

	String metalfabricacion = null;
	
	public Joyas(int year, String origen, float precioventa, String metalfabricacion) {
		super(year, origen, precioventa);
		this.metalfabricacion=metalfabricacion;
		
		
	}
	
	Joyas(){
		
	}
	
	public String toString() {
		
		String mensaje = "el año es " +year +". De origen: " +origen 
				+". Con un precio de: " +precioventa 
				+". Y el metal de fabricacion es: " +metalfabricacion;
		return mensaje;
		
		
	}

}
