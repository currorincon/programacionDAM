package modulo4Objetos.ejercicioOO;

import java.util.Scanner;

import utils.Util;

public class Principal {
	
	static int numeroPersonas = 3;
	static Persona[] persona = new Persona[numeroPersonas];

	public static void main(String[] args) {

		int opcion = 0;		
		Scanner sc = new Scanner(System.in);
		int nPersona = 0;
		
		do {
			
			System.out.println("Introduce la opcion que quieras");
			System.out.println("\t0-Salir\n\t1-Introducir datos\n\t2-Ver personas");

			opcion = sc.nextInt();
			
			switch(opcion) {
			case 0:
				System.out.println("Adios");
				break;
			case 1:
				introducirDatos(nPersona);
				break;
			case 2:
				mostrarDatos();
				break;
			default:
				System.out.println("Opcion invalida");
				break;
			
			}
			nPersona++;
			
		}while(opcion != 0 || nPersona < 3);
		
	}
	
	/**
	 * Muestra los datos de la persona
	 * 
	 */
	private static void mostrarDatos() {

		System.out.println("Los datos:");

		for(int i = 0; i<persona.length;i++) {
			System.out.println("Nombre: " + persona[i].getNombre());
			System.out.println("Edad: " + persona[i].getEdad());
			System.out.println("Dni: " + persona[i].getDni());
		}
		

	}
	
	
	/**
	 * Metodo para introducir los datos de la persona
	 * 
	 */
	private static void introducirDatos(int nPersona) {
		
		String nombre = Util.pedirStringUsuario("Dame el nombre");
		String dni = Util.pedirStringUsuario("Dame el dni");
		int edad = Util.pedirNumeroUsuario("Dame tu edad");
		
		persona[nPersona] = new Persona();		
		persona[nPersona].setNombre(nombre);
		persona[nPersona].setEdad(edad);
		persona[nPersona].setDni(dni);		
		
	}

}
