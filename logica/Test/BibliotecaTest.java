package es.ies.pto.ETS.JDamian;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BibliotecaTest {
    Biblioteca biblioteca = null;

    @Test
    public void constructorDefectoTest(){
        biblioteca = new Biblioteca();
        assertNotNull(biblioteca, message: "La variable es nula");
    }

}
