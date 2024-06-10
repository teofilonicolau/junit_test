package one.dio.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PessoaTest {

    @Test
    void validarCalculoDeIdade() {
        Pessoa jessica = new Pessoa("Jessica", LocalDateTime.of(2000, 1, 1,15,0,0));
        int idadeEsperada = 4;  // Assumindo que o ano atual seja 2024
        Assertions.assertEquals(24, jessica.getIdade());
    }

    @Test
    void deveRetornarSeEhMaiorDeIdade() {
        Pessoa jessica = new Pessoa("Jessica", LocalDateTime.of(2000, 1, 1,15,0,0));
        Assertions.assertTrue(jessica.ehMaiorDeIdade());

        Pessoa joao =  new Pessoa("Joao", LocalDateTime.now());
        Assertions.assertFalse(joao.ehMaiorDeIdade());

    }


}
