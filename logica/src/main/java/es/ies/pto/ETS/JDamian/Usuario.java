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
        return correoElectrónico;
    }

    public void setCorreoElectrónico(String correoElectrónico) {
        this.correoElectrónico = correoElectrónico;
    }
    public void buscarLibro(){

    }
    public void registrarse(){

    }
    public void darseDeBaja(){

    }
    public void comprarLibro(){

    }
    public void solicitarDevolucion(){

    }
}

