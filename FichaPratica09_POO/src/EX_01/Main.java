package EX_01;

public class Main {
    public static void main(String[] args) {

        CarroAtual fiat147 = new CarroAtual("Fiat 147", "Fiat", 1985, 190, 1.2, TipoCombustivel.GASOLINA, 3.5);
        CarroAtual adversario = new CarroAtual("Focus", "Ford", 2008, 200, 1.8, TipoCombustivel.GASOLINA, 5.0);

        //fiat147.ligar();

        CarroAtual vencedor = fiat147.corrida(adversario);
        vencedor.mostrarDetalhes();

        fiat147.consultaKm(fiat147.consumoKm(100));
        adversario.consultaKm(adversario.consumoKm(100));

        if(fiat147.consumoKm(97) > adversario.consumoKm(97)){
            System.out.println("O carro fiat faz mais km/lt");
        } else {
            System.out.println("O carro ford tem mais km/lt");
        }

    }
}