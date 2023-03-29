

import java.util.Scanner;
import java.util.ArrayList;

public class RegistroLibros {

    private static ArrayList<Libro> libros = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion = 0;

        do {
            System.out.println("Elige una opción:");
            System.out.println("1. Agregar libro");
            System.out.println("2. Buscar libro");
            System.out.println("3. Eliminar libro");
            System.out.println("4. Escoger libro");
            System.out.println("5. Salir");

            opcion = sc.nextInt();
            sc.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    agregarLibro();
                    break;
                case 2:
                    buscarLibro();
                    break;
                case 3:
                    eliminarLibro();
                    break;
                case 4:
                    escogerLibro();
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        } while (opcion != 5);
    }

    private static void agregarLibro() {
        System.out.println("Ingrese el título del libro:");
        String titulo = sc.nextLine();

        System.out.println("Ingrese el autor del libro:");
        String autor = sc.nextLine();

        System.out.println("Ingrese el año de publicación del libro:");
        int anio = sc.nextInt();
        sc.nextLine(); // Limpiar buffer

        Libro libro = new Libro(titulo, autor, anio);
        libros.add(libro);

        System.out.println("Libro agregado correctamente.");
    }

    private static void buscarLibro() {
    System.out.println("Los libros agregados son:\n");
    System.out.format("%-30s%-30s%-10s\n", "Titulo", "Autor", "Año");

    if (libros.isEmpty()) {
        System.out.println("No se han agregado libros.");
    } else {
        for (Libro libro : libros) {
            System.out.format("%-30s%-30s%-10d\n", libro.getTitulo(), libro.getAutor(), libro.getAnio());
        }
    }
}
        


    private static void eliminarLibro() {
        System.out.println("Ingrese el título del libro a eliminar:");
        String titulo = sc.nextLine();

        boolean eliminado = false;

        for (int i = 0; i < libros.size(); i++) {
            if (libros.get(i).getTitulo().equals(titulo)) {
                libros.remove(i);
                eliminado = true;
            }
        }

        if (eliminado) {
            System.out.println("Libro eliminado correctamente.");
        } else {
            System.out.println("Libro no encontrado.");
        }
    }

   private static void escogerLibro() {
    System.out.println("Ingrese el título del libro a escoger:");
    String titulo = sc.nextLine();

    System.out.println("Ingrese el autor del libro a escoger:");
    String autor = sc.nextLine();

    boolean existeLibro = false;

    for (Libro libro : libros) {
        if (libro.getTitulo().equals(titulo) && libro.getAutor().equals(autor)) {
            System.out.println("El libro " + libro.getTitulo() + " de " + libro.getAutor() + " (" + libro.getAnio() + ") existe.");
            existeLibro = true;
            break;
        }
    }

    if (!existeLibro) {
        System.out.println("El libro " + titulo + " de " + autor + " no existe o no está registrado.");
    }
}
}