package es.ies.pto.ETS.JDamian;

import java.util.Date;

public class Libro {

    String isbn;
    String titulo;
    Date fechaPublicacion;
    String autor;
    String editorial;
    double precio;

    public Libro() {}
    /**
     * Constructor con 5 parámetros
     */
    public Libro(String isbn, String titulo, Date fechaPublicacion, String autor, String editorial,double precio) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.fechaPublicacion = fechaPublicacion;
        this.autor = autor;
        this.editorial = editorial;
        this.precio = precio;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getIsbn() {
        return this.isbn;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Date getFechaPublicacion() {
        return this.fechaPublicacion;
    }

    public void setFechaPublicacion(Date fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public String getAutor() {
        return this.autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return this.editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
}
