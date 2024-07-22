package EX_02;

import java.util.ArrayList;
import java.util.Random;

public class Sorteio {
    private double premio;

    ArrayList<Pessoa> listaparticipantes;

    public Sorteio(double premio){
        this.premio= premio;
        this.listaparticipantes = new ArrayList<Pessoa>();
    }

    public void addParticipante(Pessoa participanteNovo){
        if (participanteNovo.getIdade() >= 18){
            System.out.println("Inscritos com sucesso: " + participanteNovo.getNome());
            this.listaparticipantes.add(participanteNovo);
        } else {
            System.out.println("Não é possivel inscrever: " + participanteNovo.getNome() + " pois é menor de idade");
        }
    }

    public Pessoa sortear(){
        Random rd = new Random();

        int indexSorteado = rd.nextInt(this.listaparticipantes.size());

        return this.listaparticipantes.get(indexSorteado);
    }

    public void exibirDetalhes(){
        System.out.println("Lista de participantes");

        for (int X = 0; X < listaparticipantes.size(); X++) {
            System.out.println("Participantes " + (X + 1) + " - ");
            this.listaparticipantes.get(X).exibirDetalhes();
        }
    }
}
