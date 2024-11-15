package modulo4Objetos.coleccionAntiguedadesLuis;


public class Libros extends Antiguedades {
	
	String titulo = null;
	String autor = null;

	public Libros(int year, String origen, float precioventa, String titulo, String autor) {
		super(year, origen, precioventa);
		this.autor=autor;
		this.titulo=titulo;
	}
	
	public String toString() {
		
		String mensaje = "el año es " +year +". De origen: " +origen 
				+". Con un precio de: " +precioventa +". El autor del libro " +titulo +" es " +autor;
		return mensaje;
		

}}
