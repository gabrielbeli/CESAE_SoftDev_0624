package EX_05;

public class Agenda {

    private Pessoa[] agenda;

    public Agenda(int capacidade){
        this.agenda = new Pessoa[capacidade];
    }

    public void addPessoa(Pessoa pessoaNova){

        for (int X = 0; X < agenda.length; X++){
            if (this.agenda[X] == null){
                this.agenda[X] = pessoaNova;
                return;
            }
        }
    }

    public void imprimirAgenda(){
        System.out.println("-----Agenda-----");

        for (int X = 0; X < agenda.length && this.agenda[X] != null; X++) {
            System.out.println("Contato " + (X +  1) + ": ");
            this.agenda[X].exibirDetalhes();
        }
    }
}
