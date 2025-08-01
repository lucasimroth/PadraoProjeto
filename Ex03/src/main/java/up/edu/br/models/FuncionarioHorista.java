package up.edu.br.models;

public class FuncionarioHorista extends Funcionario {
    private double valorHora;
    private double QuantidadeHoras;

    public FuncionarioHorista(String nome, int matricula, double valorHora, double quantidadeHoras) {
        super(nome, matricula);
        this.valorHora = valorHora;
        this.QuantidadeHoras = quantidadeHoras;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public double getQuantidadeHoras() {
        return QuantidadeHoras;
    }
    public void setQuantidadeHoras(double quantidadeHoras) {
        QuantidadeHoras = quantidadeHoras;
    }

    @Override
    public double calcularSalario() {
        return valorHora * QuantidadeHoras;
    }
    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("valor hora: " + valorHora);
        System.out.println("quantidade horas: " + QuantidadeHoras);
        System.out.println("salario: " + calcularSalario());
        
        System.out.println("---------------------");
    }
}
