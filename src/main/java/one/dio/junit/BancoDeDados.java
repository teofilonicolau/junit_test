package one.dio.junit;

import java.util.logging.Logger;

public class BancoDeDados {

    private static final Logger LOOGER = Logger.getLogger(BancoDeDados.class.getName());

    public static void iniciarConexao() {
        LOOGER.info("Iniciou conexão ");
    }

    public static void finalizarConexao() {
        LOOGER.info("Finalizou conexão");
    }

    public static void insereDados(Pessoa pessoa) {
        LOOGER.info("Inseriu Dados");

    }

    public static void removeDados(Pessoa pessoa) {
        LOOGER.info("Removeu Dados");
    }

}
