package EX_01;

public class CarroAtual {

    private String modelo;
    private String marca;
    private int ano;
    private int potencia;
    private double cilindrada;
    private TipoCombustivel tipoCombustivel;
    private double litrosKm;
    private int anoAtual = 2024;

    public CarroAtual(String modelo, String marca, int ano, int potencia, double cilindrada, TipoCombustivel tipoCombustivel, double litrosKm) {
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.potencia = potencia;
        this.cilindrada = cilindrada;
        this.tipoCombustivel = tipoCombustivel;
        this.litrosKm = litrosKm;
    }

    public void ligar() {

        if(anoAtual - this.ano > 30 && this.tipoCombustivel.equals(TipoCombustivel.DIESEL)){
            System.out.println("O carro "+ this.modelo + " deita um pouco de fumo...custa a pegar... Está ligado!");
            System.out.println("Vrum-vrum-vrum");
        }

        if(anoAtual - this.ano > 30 && this.tipoCombustivel.equals(TipoCombustivel.GASOLINA) || this.tipoCombustivel.equals(TipoCombustivel.GPL)){
            System.out.println("O carro "+ this.modelo + " custa a pegar... Está ligado!.");
            System.out.println("Vrum-vrum-vrum");
        }

        if(anoAtual - this.ano <= 30 && this.potencia < 250){
            System.out.println("O carro "+ this.modelo + " está ligado!");
            System.out.println("Vrummmmmmm");
        }

        if(anoAtual - this.ano <= 30 && this.potencia >= 250){
            System.out.println("O carro "+ this.modelo + " está ligado!");
            System.out.println("VRUMMMMMMMMMM");
        }

    }

    public CarroAtual corrida(CarroAtual adversario){

        if(this.potencia > adversario.potencia){
            return this;
        } else

        if(this.potencia == adversario.potencia && this.cilindrada > adversario.cilindrada){
            return this;
        } else

        if(this.potencia == adversario.potencia && this.cilindrada == adversario.cilindrada && this.ano > adversario.ano){
            return this;
        } else {
            return adversario;
        }
    }

    public void mostrarDetalhes(){
        System.out.println("O carro vencedor é o " + this.modelo + " marca " + this.marca );
        System.out.println("Ano: " + this.ano);
        System.out.println("Potencia: " + this.potencia);
        System.out.println("Cilindrada: " + this.cilindrada);
    }

    public double consumoKm(double distancia){
        double consumo = distancia / this.litrosKm;

        return  consumo;
    }

    public void consultaKm(double consumo) {
        System.out.println("O carro " + this.modelo + " faz " + consumo + " por km" );
    }

}
