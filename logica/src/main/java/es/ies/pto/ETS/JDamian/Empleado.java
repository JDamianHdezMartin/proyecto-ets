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
    public void anadirLibro(String isbn){

    }
    public void modificarLibro(String isbn){

    }
    public void eliminarLibro(String isbn){

    }
    public void eliminarUsuario(){

    }
}
