package gestorbiblioteca;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// Creación del objeto Scanner para más adelante añadir la entrada de teclado.
		
		Scanner entrada = new Scanner(System.in);
		
		// Instancia biblioteca. Y se agregan objetos libro.
		
		Biblioteca biblioteca = new Biblioteca();
		
		biblioteca.agregarLibro("Los Pilares de la Tierra", "Ken Follett");
		biblioteca.agregarLibro("Buscando Esposa", "Julia Quinn");
		biblioteca.agregarLibro("La Península de las Casas Vacías", "David Uclés");
		
		// Petición de entrada a usuario.
		
		System.out.println("Presiona enter para mostrar la lista de libros");
		
		entrada.nextLine();
		
		// Recorrido de la lista ordenada para mostrar cada libro en una línea.
		
		for (Libro libro : biblioteca.listarLibros()) {
			System.out.println(libro);
		}
		
	}

}