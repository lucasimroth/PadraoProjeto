package up.edu.br;

import up.edu.br.models.Acervo;
import up.edu.br.models.Autor;
import up.edu.br.models.Livro;

public class Main {
    public static void main(String[] args) {
        Autor A1 = new Autor("bruno", "brasileiro");
        Autor A2 = new Autor();
        A2.setNome("linkin");
        A2.setNacionalidade("park");

        Livro L1 = new Livro("Orgulho e preconceito", A1);
        Livro L2 = new Livro();
        Livro L3 = new Livro("1984", A2);
        L2.setAutor(A2);
        L2.setTitulo("jogos vorazes");

        Acervo ac1 = new Acervo();

        ac1.adicionarLivro(L1);
        ac1.adicionarLivro(L2);
        ac1.adicionarLivro(L3);

        ac1.listarLivros();
    }
}