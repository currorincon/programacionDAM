package modulo4Objetos;

import utils.Util;

public class Principal extends Object {

	public static void main(String[] args) {
//		
////		Animal gato = new Animal(Animal.tipoGATO, 45, 5, "negro");
////		Animal perro = new Animal(Animal.tipoPERRO, 55, 23, "marron");
////		Animal loro = new Animal(Animal.tipoLORO,12,4,"verde");
////		
//		String [] nombres = {"pepe","juan","toby"};
//		
//		Animal burro = new Animal("curro");
//		Animal burro2 = new Animal("curro");
////		perro.setNombre("Toby");
//
//		Animal [] animalesZoo = new Animal[10];
//		
//		
//		System.out.println(burro.equals(burro2));
//		
//		System.out.println(burro.hashCode());
//		System.out.println(burro.toString());
//		System.out.println(burro2.toString());
//		System.out.println(perro.toString());

		
//		Animal burro = new Animal("Curro");
//		System.out.println(burro.getColor());
//		
//		if(burro.getColor()!= null)
//			burro.setColor("marron");
//
//		System.out.println("Id de burro :" + burro.getID());
//		System.out.println("Id de perro :" + perro.getID());
//		System.out.println("Id de gato :" + gato.getID());
//		
		//gato.mostrarCaracteristicas();
		//perro.mostrarCaracteristicas();
		//loro.mostrarCaracteristicas();
		
//		float nuevoPeso=Util.pedirNumeroUsuario("Dame el peso nuevo del gato");
//		gato.setNombre("Misifu");
//		gato.setPeso(nuevoPeso);
//		
//		System.out.println(gato.getPeso());
//		gato.mostrarCaracteristicas();
//		perro.setNombre("Lala");
//		perro.mostrarCaracteristicas();
//		
//		gato.emitirSonido(Animal.tipoGATO);
//		perro.emitirSonido(Animal.tipoPERRO);
//		
//		System.out.println(gato);
//		
//		
		
		/**
		 * Con HERENCIAAAA
		 */
		
		Perro toby = new Perro(5, 50, "marron");
		Gato misifu = new Gato(5, 50, "negro");
		
		toby.emitirSonido();
		misifu.emitirSonido();
		
	}

}
