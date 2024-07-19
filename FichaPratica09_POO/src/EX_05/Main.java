package EX_05;

public class Main {
    public static void main(String[] args) {

        Pessoa novaPessoa = new Pessoa("Gabriel", 31, "gb@email.com", 935717048);
        Pessoa novaPessoa2 = new Pessoa("Ricardo", 23, "rf@email.com", 938542139);
        Pessoa novaPessoa3 = new Pessoa("Joaquim", 28, "ja@email.com", 935412937);

        Agenda agenda = new Agenda(100);

        agenda.addPessoa(novaPessoa);
        agenda.addPessoa(novaPessoa2);
        agenda.addPessoa(novaPessoa3);

        agenda.imprimirAgenda();

    }
}
