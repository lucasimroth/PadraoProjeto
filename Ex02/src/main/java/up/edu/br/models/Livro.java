package up.edu.br.models;

public class Livro {
    private String titulo;
    private Autor autor;

    public Livro(String titulo, Autor autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public Livro() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public void exibirDados(){
        System.out.println("Dados do livro");
        System.out.println("titulo: " + titulo);
        System.out.println("autor: " + autor.getNome());
    }
}
