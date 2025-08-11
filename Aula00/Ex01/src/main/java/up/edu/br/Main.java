package up.edu.br;
import up.edu.br.models.Produto;
public class Main {
    public static void main(String[] args) {
        Produto p = new Produto("Café", 12.50, 10);

        Produto p1 = new Produto();
        p1.setNome("agua");
        p1.setPreco(5.50);
        p1.setQuantidade(5);

        p.exibirDados();
        p1.exibirDados();

    }
}