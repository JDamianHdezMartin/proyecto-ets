package es.ies.pto.ETS.JDamian;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class UsuarioTest {
    Usuario usuario;

    @BeforeEach
    public void beforeEach() {
        if (usuario == null) {
            usuario = new Usuario();
        }
        assertNotNull(Usuario, message:"La instancia de usuario es nula");
    }
}
