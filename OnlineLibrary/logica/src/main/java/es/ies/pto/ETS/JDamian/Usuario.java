package es.ies.pto.ETS.JDamian;

public class Usuario {
    String nombre;
    String apellidos;
    int contrasenia;
    String correoElectrónico;

    /**
     * Constructor pordefecto
     */
    public Usuario() {
    }

    /**
     * Constructor con 4 variables
     * @param nombre de la clase
     * @param apellidos de la clase
     * @param contrasenia de la clase
     * @param correoElectrónico de la clase
     */
    public Usuario(String nombre, String apellidos, int contrasenia, String correoElectrónico) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.contrasenia = contrasenia;
        this.correoElectrónico = correoElectrónico;
    }
}

