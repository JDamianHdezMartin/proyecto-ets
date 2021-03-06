package es.ies.pto.ETS.JDamian;

import java.util.ArrayList;

public class Usuario {

    String dni;
    String nombre;
    String apellidos;
    int contrasenia;
    String correoElectronico;
    ArrayList<Libro> carrito = new ArrayList<>();
    Biblioteca bt;

    /**
     * Constructor pordefecto
     */
    public Usuario() {
    }

    /**
     * Constructor con 4 variables
     *
     * @param nombre de la clase
     * @param apellidos de la clase
     * @param contrasenia de la clase
     * @param correoElectrónico de la clase
     */
    public Usuario(String dni, String nombre, String apellidos, int contrasenia, String correoElectrónico) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.contrasenia = contrasenia;
        this.correoElectronico = correoElectrónico;
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(int contrasenia) {
        this.contrasenia = contrasenia;
    }

    public String getCorreoElectrónico() {
        return correoElectronico;
    }

    public void setCorreoElectrónico(String correoElectrónico) {
        this.correoElectronico = correoElectrónico;
    }

    //este metodo no haria falta, ya esta en la clase Biblioteca
    public Libro buscarLibro(String isbn) {
        return bt.libros.get(isbn);

    }

    public void registrarse(String dni, String nombre, String apellidos, int contrasenia, String correoElectronico) {
        Usuario u = new Usuario(dni, nombre, apellidos, contrasenia, correoElectronico);
        bt.usuarios.add(u);

    }

    public void darseDeBaja(String dni) {
        //aquí hay un error
        bt.usuarios.remove(dni);
    }

    public void comprarLibro(Libro l) {
        carrito.add(l);
    }

    public void solicitarDevolucion(Libro l) {
        bt.devoluciones.put(dni, l);
    }
}
