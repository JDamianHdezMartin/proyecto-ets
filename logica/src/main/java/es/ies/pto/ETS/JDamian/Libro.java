package es.ies.pto.ETS.JDamian;

public class Libro{
    String isbn;
    String titulo;
    Date fechaPublicacion;
    String autor;
    String editorial;
    /**
     * Constructor con 5 parámetros
     */
    public Libro(String isbn, String titulo, Date fechaPublicacion, String autor, String editorial) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.fechaPublicacion = fechaPublicacion;
        this.autor = autor;
        this.editorial = editorial;
    }

	public void setIsbn (String isbn) {
		this.isbn = isbn,;
	}

	public = getIsbn() {
		return this.isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public void getTitulo() {
		return this.titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void getFechaPublicacion() {
		return this.fechaPublicacion;
	}

	public void setFechaPublicacion(Date fechaPublicacion) {
		this.fechaPublicacion = fechaPublicacion;
	}

	public void getAutor() {
		return this.autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public void getEditorial() {
		return this.editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
}