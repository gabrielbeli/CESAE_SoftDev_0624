package EX_03;

public class Marisco {

    private String especie;
    private double peso;
    private double preço;

    public Marisco(String especie, double peso, double preço) {
        this.especie = especie;
        this.peso = peso;
        this.preço = preço;
    }

    public String getEspecie() {
        return especie;
    }

    public void exibirDetalhes(){
        System.out.println(this.especie + "||" + this.peso + "||" + this.preço);
    }
}
