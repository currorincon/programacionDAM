package modulo4Objetos.ejercicioOO;
import java.util.Scanner;

import utils.Util;

public class PrincipalNOStatic {
	
	public static void main(String[] args) {
		
		int numeroPersonas = 3;
		Persona[] personas = new Persona[numeroPersonas];

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
					introducirDatos(nPersona, personas);
					break;
				case 2:
					mostrarDatos(personas);
					break;
				default:
					System.out.println("Opcion invalida");
					break;
			}
			nPersona++;
			
		} while(opcion != 0 || nPersona < numeroPersonas);
		
		sc.close();
	}
	
	/**
	 *  Método para mostrar los datos de las personas
	 * 
	 * @param personas
	 */
	private static void mostrarDatos(Persona[] personas) {
		System.out.println("Los datos:");
		for(int i = 0; i < personas.length; i++) {
			if (personas[i] != null) {  // Comprobamos que la persona no es nula
				System.out.println("Nombre: " + personas[i].getNombre());
				System.out.println("Edad: " + personas[i].getEdad());
				System.out.println("Dni: " + personas[i].getDni());
			}
		}
	}
	
	/**
	 * 
	 * 	 Método para introducir los datos de una persona

	 * 
	 * @param nPersona
	 * @param personas
	 */
	private static void introducirDatos(int nPersona, Persona[] personas) {
		String nombre = Util.pedirStringUsuario("Dame el nombre");
		String dni = Util.pedirStringUsuario("Dame el dni");
		int edad = Util.pedirNumeroUsuario("Dame tu edad");
		
		personas[nPersona] = new Persona();
		personas[nPersona].setNombre(nombre);
		personas[nPersona].setEdad(edad); 
		personas[nPersona].setDni(dni);		
	}
}
