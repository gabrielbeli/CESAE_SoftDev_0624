package EX_02;

public class Main {
    public static void main(String[] args) {

        Pessoa novaPessoa = new Pessoa("Gabriel", 31, 935717048,"gb@email.com");
        Pessoa novaPessoa2 = new Pessoa("Ricardo", 23, 938542139,"rf@email.com");
        Pessoa novaPessoa3 = new Pessoa("Joaquim", 28, 935412937,"ja@email.com");
        Pessoa novaPessoa4 = new Pessoa("Maria", 28, 935412937,"maria@email.com");
        Pessoa novaPessoa5 = new Pessoa("Jose", 28, 935412937,"jose@email.com");

        Sorteio cabaznatal = new Sorteio(5000);

        cabaznatal.addParticipante(novaPessoa);
        cabaznatal.addParticipante(novaPessoa2);
        cabaznatal.addParticipante(novaPessoa3);
        cabaznatal.addParticipante(novaPessoa4);
        cabaznatal.addParticipante(novaPessoa5);

        cabaznatal.exibirDetalhes();

        System.out.println("---------Vencedor-----------");
        cabaznatal.sortear().exibirDetalhes();
    }
}
