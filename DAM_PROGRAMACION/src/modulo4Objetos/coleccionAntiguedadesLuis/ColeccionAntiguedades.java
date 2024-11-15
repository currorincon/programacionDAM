package modulo4Objetos.coleccionAntiguedadesLuis;

import java.util.Scanner;

public class ColeccionAntiguedades {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int operacion = 0;
		int tipoAntiguedad = 0;
		System.out.println("¿cuantas antiguedades vas a introducir?");
		int n = sc.nextInt();
		int contador = 0;
		Antiguedades[] bmw = new Antiguedades[n];

		do {
			do {

				switch (PreguntarQueHacer()) {

				case 0:
					switch (TipoAntiguedad()) {

					case 0:
						bmw[contador] = MeterNuevaJoya();
						contador++;
						break;

					case 1:
						bmw[contador] = MeterLibros();
						contador++;
						break;

					case 2:
						bmw[contador] = MeterCoches();
						contador++;
						break;

					case 3:
						bmw[contador] = MeterCuadros();
						contador++;
						break;

					}
					break;
				case 1:
					for(int i = 0; i<bmw.length; i++)
						if (bmw[i] != null)
						System.out.println(bmw[i].toString());
					break;

				case 2:
					break;
				case 3:
					break;

				}

			} while (contador != n);
		} while (operacion != 3);

		sc.close();
	}

	public static int PreguntarQueHacer() {
		Scanner sc = new Scanner(System.in);
		System.out.println("¿Qué desea hacer?");
		System.out.println("0-Introducir una antiguedad");
		System.out.println("1-Consultar las antiguedades");
		System.out.println("2-Cambiar alguno de los datos");
		System.out.println("3-Salir");
		int operacion = sc.nextInt();
		return operacion;

	}

	public static int TipoAntiguedad() {

		Scanner sc = new Scanner(System.in);
		int tipo = 0;
		System.out.println("¿De que tipo la quieres introducir?");
		System.out.print("0-Joyas / 1-Libros / 2-Coches /3-Cuadros");
		tipo = sc.nextInt();
		return tipo;

	}

	public static Joyas MeterNuevaJoya() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el año");
		int añoJoya = sc.nextInt();
		System.out.println("Introduce el origen");
		String origenJoya = sc.next();
		System.out.println("Introduce el precio de venta");
		float precioJoya = sc.nextFloat();
		System.out.println("Introduce el metal de fabricación");
		String metalJoya = sc.next();
		return new Joyas(añoJoya, origenJoya, precioJoya, metalJoya);

	}

	public static Libros MeterLibros() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el año");
		int añoLibro = sc.nextInt();
		System.out.println("Introduce el origen");
		String origenLibro = sc.next();
		System.out.println("Introduce el precio de venta");
		float precioLibro = sc.nextFloat();
		System.out.println("Introduce el titulo");
		String tituloLibro = sc.next();
		System.out.println("Introduce el autor");
		String autorLibro = sc.next();
		return new Libros(añoLibro, origenLibro, precioLibro, tituloLibro, autorLibro);

	}

	public static Coches MeterCoches() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el año");
		int añoCoche = sc.nextInt();
		System.out.println("Introduce el origen");
		String origenCoche = sc.next();
		System.out.println("Introduce el precio de venta");
		float precioCoche = sc.nextFloat();
		System.out.println("Introduce la marca");
		String marcaCoche = sc.next();
		System.out.println("Introduce el modelo");
		String modeloCoche = sc.next();
		return new Coches(añoCoche, origenCoche, precioCoche, marcaCoche, modeloCoche);
	}

	public static Cuadros MeterCuadros() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el año");
		int añoCuadro = sc.nextInt();
		System.out.println("Introduce el origen");
		String origenCuadro = sc.next();
		System.out.println("Introduce el precio de venta");
		float precioCuadro = sc.nextFloat();
		System.out.println("Introduce el autor");
		String autorCuadro = sc.next();
		System.out.println("Introduce el modelo");
		int sigloCuadro = sc.nextInt();
		return new Cuadros(añoCuadro, origenCuadro, precioCuadro, autorCuadro, sigloCuadro);

	}

}
