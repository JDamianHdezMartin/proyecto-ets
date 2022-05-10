package es.ies.pto.ETS.JDamian;

public class Empleado {
    int idEmpleado;
    String nombre;
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
     */
    public void anadirLibro(String isbn, String titulo, int fechaPublicacion, String autor, String editorial){
        
    }
    /**
     * Metodo que modifica los datos de un libro ya introducido en la base de datos
     */
    public void modificarLibro(String isbn){

    }
    /**
     * Metodo que elimina un libro de la base de datos
     */
    public void eliminarLibro(String isbn){

    }
    /**
     * Metodo que elimina a un usuario usando su correo electronico
     */
    public void eliminarUsuario(String correoElectrónico){

    }
}
