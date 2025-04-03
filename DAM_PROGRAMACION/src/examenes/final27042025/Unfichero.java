package examenes.final27042025;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

class Libro {
    private String titulo;
    private String autor;
    private int paginas;
    private boolean prestado;
    
    
    
    private Date fechaPublicacion = null;
    private Date fechaPrestamo = null;
    
    public String nombre;

    public Libro(String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
        this.prestado = false;
        fechaPublicacion = new Date(); //Central European Summer Time 1 ENERO 1970
       
        
        
        System.out.println("fecha en String; " + fechaPublicacion); 
        System.out.println("fecha en String; " + fechaPublicacion.getYear());
        
        
        //Date to String -> Format
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy E HH:mm:ss");
        System.out.println("FECHA ACTUAL FORMATEADA " + sdf.format(fechaPublicacion));
        
        
        //String to Date -> Parser
        Date fechaParseo = null;
        
   
			try {
				fechaParseo = sdf.parse("01/04/2005 mié 11:24:00");
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
        
        System.out.println("Fecha parseada:" + fechaParseo.getTime());
        System.out.println("Fecha parseada:" + sdf.format(fechaParseo));

    }

    public String getTitulo() { return titulo; }
    public String getAutor() { return autor; }
    public int getPaginas() { return paginas; }
    public boolean isPrestado() { return prestado; }

    public void prestar() { this.prestado = true; }
    public void devolver() { this.prestado = false; }

    @Override
    public String toString() {
        return "Título: " + titulo + ", Autor: " + autor + ", Fecha Publicacion: " + fechaPublicacion + ", Páginas: " + paginas + ", Estado: " + (prestado ? "Prestado" : "Disponible");
    }
}

class Biblioteca {
  
	private Libro[] catalogo;

    public Biblioteca() {
        catalogo = new Libro[]{
            new Libro("1984", "George Orwell", 328),
            new Libro("Cien años de soledad", "Gabriel García Márquez", 471),
            new Libro("El principito", "Antoine de Saint-Exupéry", 96),
            new Libro("Don Quijote", "Miguel de Cervantes", 863),
            new Libro("Fahrenheit 451", "Ray Bradbury", 249),
            new Libro("Moby Dick", "Herman Melville", 635),
            new Libro("Los juegos del hambre", "Suzanne Collins", 374),
            new Libro("El Hobbit", "J.R.R. Tolkien", 310),
            new Libro("Orgullo y prejuicio", "Jane Austen", 432),
            new Libro("Crimen y castigo", "Fiódor Dostoievski", 671)
        };
    }

    public void mostrarCatalogo() {
        for (Libro libro : catalogo) {
            System.out.println(libro.getTitulo());
        }
    }

    public void prestarLibro(String titulo) {
        for (Libro libro : catalogo) {
            if (libro.getTitulo().equalsIgnoreCase(titulo) && !libro.isPrestado()) {
                libro.prestar();
                System.out.println("Libro prestado: " + titulo);
                return;
            }
        }
        System.out.println("Libro no encontrado o ya prestado.");
    }

    public void devolverLibro(String titulo) {
        for (Libro libro : catalogo) {
            if (libro.getTitulo().equalsIgnoreCase(titulo) && libro.isPrestado()) {
                libro.devolver();
                System.out.println("Libro devuelto: " + titulo);
                return;
            }
        }
        System.out.println("Libro no encontrado o no estaba prestado.");
    }

    public void mostrarDisponibles() {
        for (Libro libro : catalogo) {
            if (!libro.isPrestado()) {
                System.out.println(libro);
            }
        }
    }

    public void generarReporte() {
        int totalPrestados = 0;
        Libro mayorPaginas = catalogo[0];

        for (Libro libro : catalogo) {
            if (libro.isPrestado()) {
                totalPrestados++;
                
            }
            if (libro.getPaginas() > mayorPaginas.getPaginas()) {
                mayorPaginas = libro;
            }
        }

        System.out.println("Total de libros prestados: " + totalPrestados);
        System.out.println("Libro con mayor cantidad de páginas: " + mayorPaginas);

        Arrays.sort(catalogo, (a, b) -> a.getTitulo().compareToIgnoreCase(b.getTitulo()));
        System.out.println("Listado de libros ordenados alfabéticamente:");
        for (Libro libro : catalogo) {
            System.out.println(libro);
        }
        
        
        
        
        
    }
}

public class Unfichero {
    public static void main(String[] args) {
        
    	
    	
    	Biblioteca biblioteca = new Biblioteca();
    	
        
    	
    	Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\nMenú:");
            System.out.println("1. Mostrar catálogo");
            System.out.println("2. Prestar libro");
            System.out.println("3. Devolver libro");
            System.out.println("4. Mostrar libros disponibles");
            System.out.println("5. Generar reporte");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            switch (opcion) {
                case 1:
                    biblioteca.mostrarCatalogo();
                    break;
                case 2:
                    System.out.print("Ingrese el título del libro a prestar: ");
                    String prestarTitulo = scanner.nextLine();
                    biblioteca.prestarLibro(prestarTitulo);
                    break;
                case 3:
                    System.out.print("Ingrese el título del libro a devolver: ");
                    String devolverTitulo = scanner.nextLine();
                    biblioteca.devolverLibro(devolverTitulo);
                    break;
                case 4:
                    biblioteca.mostrarDisponibles();
                    break;
                case 5:
                    biblioteca.generarReporte();
                    break;
                case 6:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida, intente de nuevo.");
            }
        } while (opcion != 6);
       
        scanner.close();
    }
}

