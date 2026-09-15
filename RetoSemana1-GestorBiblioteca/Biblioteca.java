package gestorbiblioteca;

import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;

// Clase de la lista de libros y métodos para agregar y visualizar.

public class Biblioteca {

	private List<Libro> libros;

	public Biblioteca() {
		this.libros = new ArrayList<>();
	}

	public void agregarLibro(String tituloLibro, String autorLibro) {
		Libro libro = new Libro(tituloLibro, autorLibro);
		libros.add(libro);
	}
	
	/* Se crea lista copia para mostrarla ordenada.
	 * Con "copyOf" la lista devuelta no es modificable.
	 * compare compara todos los elementos de la lista en parejas.
	 * Por eso libro1 y libro2, variables que utiliza compare
	 * para recorrer todos los elementos y comparar.
	 */

	public List<Libro> listarLibros() {

		List<Libro> listaOrdenada = new ArrayList<>(libros);
		
		listaOrdenada.sort(new Comparator<Libro>() {
			@Override
			public int compare(Libro libro1, Libro libro2) {
				return libro1.getTituloLibro().compareTo(libro2.getTituloLibro());
			}
		});

		return List.copyOf(listaOrdenada);
		
	}
	
}