package es.ies.pto.ETS.JDamian;


import java.util.ArrayList;
import java.util.HashMap;

public class Biblioteca {
    HashMap <String, Libro> libros = new HashMap <> ();
    HashMap <String, Libro> devoluciones = new HashMap <> ();
    ArrayList<Empleado> empleados = new ArrayList();
    ArrayList<Usuario> usuarios = new ArrayList();
}
