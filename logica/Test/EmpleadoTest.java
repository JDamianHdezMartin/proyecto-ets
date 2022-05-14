package es.ies.pto.ETS.JDamian;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmpleadoTest {

    Empleado empleado;

    @BeforeEach
    public void beforeEach() {
        if (empleado == null) {
            empleado = new Empleado();
        }
        assertNotNull(empleado, message:"La instancia de empleado es nula");
    }
}
