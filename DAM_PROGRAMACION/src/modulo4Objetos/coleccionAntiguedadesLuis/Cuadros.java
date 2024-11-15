package modulo4Objetos.coleccionAntiguedadesLuis;


public class Cuadros extends Antiguedades {

	
	String autor = null;
	int siglo = 0; //Ej. siglo 2
	public Cuadros(int year, String origen, float precioventa, String autor, int siglo) {
		super(year, origen, precioventa);
		this.autor=autor;
		this.siglo=siglo;
		
	}
	
	public String toString(){
		
		String mensaje = "el año es " +year +". De origen: " +origen 
				+". Con un precio de: " +precioventa 
				+". el autor es " +autor +" del siglo " +siglo;
		return mensaje;
		
	}

}
