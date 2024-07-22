package EX_03;

public class Marisco {

    private String especie;
    private double peso;
    private double precoPorKg;

    public Marisco(String especie, double peso, double precoPorKg) {
        this.especie = especie;
        this.peso = peso;
        this.precoPorKg = precoPorKg;
    }

    public double getPeso() {
        return peso;
    }

    public double getPrecoPorKg() {
        return precoPorKg;
    }

    public void exibirDetalhes(){
        System.out.println(" " + this.especie + "||" + this.peso + "||" + this.precoPorKg);
    }
}
