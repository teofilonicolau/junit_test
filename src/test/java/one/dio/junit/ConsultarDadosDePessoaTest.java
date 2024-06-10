package one.dio.junit;

import org.junit.jupiter.api.*;

import java.time.LocalDateTime;

public class ConsultarDadosDePessoaTest {

    @BeforeAll
    static  void configuraConexao() {
        BancoDeDados.iniciarConexao();
    }

    @BeforeEach
    void insereDadosParaTest() {
        BancoDeDados.insereDados(new Pessoa("Nicolau", LocalDateTime.of(1967, 8, 4, 16, 0 ,0)));
    }
    @AfterEach
    void removerDadosDoTest() {
        BancoDeDados.removeDados(new Pessoa("Nicolau", LocalDateTime.of(1967, 8, 4, 16, 0 ,0)));
    }


    @Test
    void  validarDadosRetorno() {
        Assertions.assertTrue(true);
    }

    @Test
    void validarDadosRetorno2() {
        Assertions.assertNull(null);
    }


    @AfterAll
    static  void  finalizaConexao() {
        BancoDeDados.finalizarConexao();

    }
}
