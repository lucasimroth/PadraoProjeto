package up.edu.br.models;

public abstract class Funcionario {
    private String nome;
    private int matricula;

    public Funcionario(String nome, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public abstract double calcularSalario();
    public void exibirDados(){
        System.out.println("--dados funcionario--");
        System.out.println("nome: " + nome);
        System.out.println("matricula" + matricula);
    }
}
