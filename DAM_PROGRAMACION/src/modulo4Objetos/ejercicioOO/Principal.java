package modulo4Objetos.ejercicioOO;

import java.util.Scanner;

import utils.Util;

public class Principal {
	
	

	public static void main(String[] args) {

		
		int numeroPersonas = Util.pedirNumeroUsuario("Cuantas personas quieres");
		Persona[] persona = new Persona[numeroPersonas];
				
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
				if(nPersona != persona.length-1)
					introducirDatos(nPersona, persona);
				else System.out.println("No puedes introducir más personas");
				break;
			case 2:
				mostrarDatos(persona);
				break;
			default:
				System.out.println("Opcion invalida");
				break;
			
			}
			nPersona++;
			
		}while(opcion != 0 || nPersona == persona.length);
		
		sc.close();
		
	}
	
	/**
	 * Muestra los datos de la persona
	 * 
	 */
	private static void mostrarDatos(Persona[] persona) {

		System.out.println("Los datos:");

		for(int i = 0; i<persona.length;i++) {
			  if(persona[i] != null) {
				System.out.println("Nombre: " + persona[i].getNombre());
				System.out.println("Edad: " + persona[i].getEdad());
				System.out.println("Dni: " + persona[i].getDni());
			  }	
		}
		

	}
	
	
	/**
	 * Metodo para introducir los datos de la persona
	 * 
	 */
	private static void introducirDatos(int nPersona, Persona[] persona) {
		
		String nombre = Util.pedirStringUsuario("Dame el nombre");
		String dni = Util.pedirStringUsuario("Dame el dni");
		int edad = Util.pedirNumeroUsuario("Dame tu edad");
		
		
		persona[nPersona] = new Persona();		
		persona[nPersona].setNombre(nombre);
		persona[nPersona].setEdad(edad);
		persona[nPersona].setDni(dni);		
		
	}

}
