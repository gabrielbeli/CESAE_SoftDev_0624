package EX_03;

public class Animal {
    private String nome;
    private String especie;
    private String paisDeOrigem;
    private double peso;
    private String[] alimentacao;

    public Animal(String nome, String especie, String paisDeOrigem, double peso, String[] alimentacao) {
        this.nome = nome;
        this.especie = especie;
        this.paisDeOrigem = paisDeOrigem;
        this.peso = peso;
        this.alimentacao = alimentacao;
    }

    public void comer(String alimento, double pesoEmGramas) {

        boolean gostaDoAlimento = false;

        for (int X = 0; X < alimentacao.length; X++) {
            if (alimentacao[X].equals(alimento)) {
                gostaDoAlimento = true;
            }
        }

        if (gostaDoAlimento) {
            this.peso += pesoEmGramas / 1000.0;
            System.out.println("O animal comeu " + alimento + ".");
        } else {
            System.out.println("O animal recusou essa comida.");
        }
    }

    public double getPeso() {
        return this.peso;
    }

}
