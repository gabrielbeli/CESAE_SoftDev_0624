package EX_05;

public class Pessoa {

    private String nome;
    private int idade;
    private String email;
    private int telemovel;


    public Pessoa(String nome, int idade, String email, int telemovel){
        this.nome = nome;
        this.idade = idade;
        this.email = email;
        this.telemovel = telemovel;
    }

    public void exibirDetalhes(){
        System.out.println(this.nome + "||" + this.idade + "||" + this.email + "||" + this.telemovel);
    }
}
