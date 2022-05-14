package es.ies.pto.ETS.JDamian;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LibroTest {
    Libro libro;

    @BeforeEach
    public void beforeEach() {
        if (libro == null) {
            libro = new Libro();
        }
        assertNotNull(libro, mesaage: "La instancia de libro es nula");

    }
}
