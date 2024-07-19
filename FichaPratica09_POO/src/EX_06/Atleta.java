package EX_06;

public class Atleta {

    private String nome;
    private Modalidades modalidade;
    private double altura;
    private double peso;
    private String origem;

    public Atleta(String nome, Modalidades modalidade, double altura, double peso, String origem){
        this.nome = nome;
        this.modalidade = modalidade;
        this.altura = altura;
        this.peso = peso;
        this.origem = origem;
    }

    public void exibirDetalhes(){
        System.out.println(this.nome + " || " + this.modalidade + " || " + this.altura + " || " + this.peso + " || " + this.origem);
    }

    public Atleta nadoLivre(Atleta adversario){

        if(this.peso / (this.peso*2) > adversario.peso / (this.peso*2)){
            return this;
        }

        if(this.peso / (this.peso*2) == adversario.peso / (this.peso*2) && this.altura > adversario.altura){
            return this;
        }
        else {
            return adversario;
        }
    }

    public Atleta saltoOrnamental(Atleta adversario){

        if(this.peso / (this.peso*2) > adversario.peso / (this.peso*2)){
            return this;
        }
        if(this.peso / (this.peso*2) == adversario.peso / (this.peso*2) && this.altura > adversario.altura){
            return this;
        }
        else {
            return adversario;
        }
    }

    public Atleta saltoVara(Atleta adversario){

        if(this.altura > adversario.altura){
            return this;
        }
        if(this.altura == adversario.altura && this.peso / (this.peso*2) == adversario.peso / (this.peso*2)){
            return this;
        }
        else {
            return adversario;
        }
    }
}
