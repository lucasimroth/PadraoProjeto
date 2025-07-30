package up.edu.br.models;
import java.util.ArrayList;
import java.util.List;
public class Acervo {
    private List<Livro> livros;

    public Acervo() {
        this.livros = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro){
        this.livros.add(livro);
        System.out.println("Livro" + livro.getTitulo() + " adicionado");

    }

    public void removerLivro(String titulo) {
        Livro livroR = null;
        for (Livro livro : livros) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                livroR = livro;
                break;
            }
        }
        if (livroR != null) {
            livros.remove(livroR);
            System.out.println("livro removido");
        }
        System.out.println("livro nao encontrado");
    }

    public void listarLivros(){
        for(Livro livro: livros){
            livro.exibirDados();
        }
    }
}
