package EX_10;

public class Main {
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario("Ana Pereira", 3000.00, "Recursos Humanos");

        funcionario.aumentarSalario(10);

        funcionario.exibirDados();
    }
}
