package one.dio.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

import static org.junit.jupiter.api.condition.JRE.JAVA_17;
import static org.junit.jupiter.api.condition.JRE.JAVA_19;

public class CodicionaisTest {

    @Test
    @EnabledOnJre(JAVA_17)
    void validarAlgoSomenteNoUsuarioNicolau() {
        Assertions.assertEquals(10, 5 + 5);
    }
}
