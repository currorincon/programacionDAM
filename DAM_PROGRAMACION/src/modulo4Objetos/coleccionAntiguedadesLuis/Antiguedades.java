package modulo4Objetos.coleccionAntiguedadesLuis;


public class Antiguedades {
	
	int year = 0;
	String origen = null; //El origen se denominará con paises o ciudades. Ej: Malaga
	float precioventa = 0;
	
	Antiguedades(int year, String origen, float precioventa){
		
		this.origen=origen;
		this.precioventa=precioventa;
		this.year=year;
	}
	Antiguedades(){
		
		
	}
	
	public String toString() {
		
		String mensaje = "el año es " +year +". De origen: " +origen 
				+". Con un precio de: " +precioventa;
		return mensaje;
		
		
	}

}
