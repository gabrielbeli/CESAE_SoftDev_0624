package EX_05;

public class Carro {

    private String modelo;
    private String marca;
    private int ano;

    public Carro(String modelo, String marca, int ano) {
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
    }

    public void ligar() {
        System.out.println("O carro "+ this.modelo + " está ligado.");
    }
}
