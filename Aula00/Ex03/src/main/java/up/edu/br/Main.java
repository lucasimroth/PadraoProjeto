package up.edu.br;
import models;

public class Main {
    public static void main(String[] args) {
        FuncionarioH1 = new FuncionarioHorista("lucas", 1891, 1899.19, 40);
        FuncionarioC1 = new FuncionarioClt("jose", 8451, 2450.91, 300);

        FuncionarioH1.exibirDados();
        FuncionarioC1.exibirDados();

    }
}