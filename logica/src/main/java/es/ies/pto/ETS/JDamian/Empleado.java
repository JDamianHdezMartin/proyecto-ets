package es.ies.pto.ETS.JDamian;

import java.util.Date;

public class Empleado {
    int idEmpleado;
    String nombre;
    Biblioteca bt;
    //Se necesita una estructura que almacene datos de forma ordenada
    //un Hashmap estaría bien, es una estructura ordenada y permite búsquedas instantáneas

    /**
     * Constructor con dos atributos
     */
    public Empleado (int idEmpleado, String nombre) {
        this.idEmpleado = idEmpleado;
        this.nombre = nombre;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * Método que agrega un libro a la base de datos
     * @param isbn
     * @param titulo
     * @param fechaPublicacion
     * @param autor
     * @param editorial
     */
    public void anadirLibro(String isbn, String titulo, Date fechaPublicacion, String autor, String editorial){
        Libro l = new Libro(isbn,titulo,fechaPublicacion,autor,editorial);
        bt.libros.put(isbn,l);
    }
    /**
     * Metodo que modifica los datos de un libro ya introducido en la base de datos
     */
    public void reemplazarLibro(String isbn, String titulo, Date fechaPublicacion, String autor, String editorial){
        Libro l = new Libro(isbn, titulo,fechaPublicacion, autor, editorial);
        bt.libros.replace(isbn, l);
        
    }
    /**
     * Metodo que elimina un libro de la base de datos
     */
    public void eliminarLibro(String isbn){
        bt.libros.remove(isbn);

    }
    /**
     * Metodo que elimina a un usuario usando su dni
     */
    public void eliminarUsuario(String dni){
        bt.usuarios.remove(dni);
    }
}
