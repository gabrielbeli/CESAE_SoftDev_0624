package EX_06;

import EX_05.Pessoa;

public class Competicao {

    private String nomeCompeticao;
    private String local;
    private Atleta[] competidores;

    public Competicao(String nomeCompeticao,String local,int capacidade){
        this.nomeCompeticao = nomeCompeticao;
        this.local = local;
        this.competidores = new Atleta[capacidade];
    }

    public void addAtleta(Atleta competidorNovo){

        for (int X = 0; X < competidores.length; X++){
            if (this.competidores[X] == null){
                this.competidores[X] = competidorNovo;
                return;
            }
        }
    }

    public void imprimirCompetidores(){
        System.out.println("           \uD83C\uDFC5 Competição: " + this.nomeCompeticao);
        System.out.println("           \uD83C\uDF0E Local: " + this.local + "\n");

        for (int X = 0; X < competidores.length && this.competidores[X] != null; X++) {
            System.out.println("Atleta " + (X +  1) + ": ");
            this.competidores[X].exibirDetalhes();
        }
    }

}
