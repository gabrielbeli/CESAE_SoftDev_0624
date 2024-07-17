package EX_08;

public class Main {
    public static void main(String[] args) {

        Aluno aluno = new Aluno("João Silva", 20, "Engenharia", 9.0);
        Aluno aluno2 = new Aluno("João Silva", 20, "Engenharia", 15.0);

        System.out.println("Situação do aluno: " + aluno.situacao());
        System.out.println("Situação do aluno: " + aluno2.situacao());
    }
}
