package gestorbiblioteca;

public class Libro {
	
	// Atributos encapsulados.

	private String tituloLibro;
	private String autorLibro;

	public Libro(String tituloLibro, String autorLibro) {
		this.tituloLibro = tituloLibro;
		this.autorLibro = autorLibro;
	}
	
	// Getter para poder obtener tituloLibro.

	public String getTituloLibro() {
		return tituloLibro;
	}
	
	/* toString para imprimir directamente el método listarLibros().
	 * Mostrando libro como texto.
	 */
	
    @Override
    public String toString() {
        return tituloLibro + " - " + autorLibro;
    }

}