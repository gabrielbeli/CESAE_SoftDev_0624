package EX_03;

public class Peixe {

    private String especie;
    private double peso;
    private double preço;

    public Peixe(String especie, double peso, double preço) {

        this.especie = especie;
        this.peso = peso;
        this.preço = preço;
    }

    public double getPeso() {
        return peso;
    }

    public double getPreço() {
        return preço;
    }

    public String getEspecie() {
        return especie;
    }

    public void exibirDetalhes(){
        System.out.println(this.especie + "||" + this.peso + "||" + this.preço);
    }

}
