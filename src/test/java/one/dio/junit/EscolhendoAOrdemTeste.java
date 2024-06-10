package one.dio.junit;

import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.DisplayName.class)
public class EscolhendoAOrdemTeste {

    @DisplayName("B")
    @Test
    void validaaFluxoA() {
        Assertions.assertTrue(true);

    }
    @DisplayName("C")
    @Test
    void validaaFluxoB() {
        Assertions.assertTrue(true);

    }
    @DisplayName("D")
    @Test
    void validaaFluxoC() {
        Assertions.assertTrue(true);

    }

    @DisplayName("E")
    @Test
    void validaaFluxoD() {
        Assertions.assertTrue(true);

    }
}
