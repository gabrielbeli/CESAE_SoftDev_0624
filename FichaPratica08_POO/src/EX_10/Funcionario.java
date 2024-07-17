package EX_10;

public class Funcionario {

    private String nome;
    private double salario;
    private String departamento;

    public Funcionario(String nome, double salario, String departamento) {
        this.nome = nome;
        this.salario = salario;
        this.departamento = departamento;
    }

    public void aumentarSalario(double percentual) {
        if (percentual > 0) {
            this.salario += this.salario * (percentual / 100);
            System.out.println("Salário aumentado em " + percentual + "%.");
        } else {
            System.out.println("Percentual inválido para aumento.");
        }
    }

    public void exibirDados() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Salário: " + this.salario);
        System.out.println("Departamento: " + this.departamento);
    }
}
