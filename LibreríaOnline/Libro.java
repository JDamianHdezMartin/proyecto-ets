public class Libro{
    String isbn;
    String titulo;
    int fechaPublicacion;
    String autor;
    String editorial;
    /**
     * Constructor con 5 parametros
     */
    public Libro(String isbn, String titulo, int fechaPublicacion, String autor, String editorial) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.fechaPublicacion = fechaPublicacion;
        this.autor = autor;
        this.editorial = editorial;
    }

}