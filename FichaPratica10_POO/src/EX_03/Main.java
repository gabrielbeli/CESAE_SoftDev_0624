package EX_03;

public class Main {
    public static void main(String[] args) {

        BarcoPesca barco01 = new BarcoPesca("Carmelita", "Branco e azul", 1993, MarcaBarco.BENTZ, 8, 2000);
        BarcoPesca barco02 = new BarcoPesca("Amélia", "Branco e amarelo", 1994, MarcaBarco.DEVLIN, 6, 1500);
        BarcoPesca barco03 = new BarcoPesca("Rosalia", "Branco e rosa", 1995, MarcaBarco.MAZURY, 10, 2500);
        BarcoPesca barco04 = new BarcoPesca("Tereza", "Branco e verde", 1996, MarcaBarco.QUICKSILVER, 7, 2000);

        Peixe[] peixes = {
                new Peixe("Salmão", 10, 15.5),
                new Peixe("Atum", 20, 12.0),
                new Peixe("Bacalhau", 5, 10.0),
                new Peixe("Truta", 3, 8.0)
        };

        Marisco[] mariscos = {
                new Marisco("Camarão", 1, 30.0),
                new Marisco("Lagosta", 2, 50.0),
                new Marisco("Caranguejo", 4, 20.0)
        };

        System.out.println("\n \uD83C\uDF8F Aberta temporada de pesca! \uD83D\uDC20 ");

        // Pescar até o limite do barco1
        System.out.println("\n \uD83D\uDEA4 Pescando com o barco " + barco01.getNome() + " \uD83C\uDFA3");
        for (Peixe peixe : peixes) {
            barco01.pescarPeixe(peixe);
        }
        for (Marisco marisco : mariscos) {
            barco01.pescarMarisco(marisco);
        }

        // Pescar até o limite do barco2
        System.out.println("\n \uD83D\uDEA4 Pescando com o barco " + barco02.getNome() + " \uD83C\uDFA3");
        for (Peixe peixe : peixes) {
            barco02.pescarPeixe(peixe);
        }
        for (Marisco marisco : mariscos) {
            barco02.pescarMarisco(marisco);
        }

        // Pescar até o limite do barco3
        System.out.println("\n \uD83D\uDEA4 Pescando com o barco " + barco03.getNome() + " \uD83C\uDFA3");
        for (Peixe peixe : peixes) {
            barco03.pescarPeixe(peixe);
        }
        for (Marisco marisco : mariscos) {
            barco03.pescarMarisco(marisco);
        }

        // Pescar até o limite do barco4
        System.out.println("\n \uD83D\uDEA4 Pescando com o barco " + barco04.getNome() + " \uD83C\uDFA3");
        for (Peixe peixe : peixes) {
            barco04.pescarPeixe(peixe);
        }
        for (Marisco marisco : mariscos) {
            barco04.pescarMarisco(marisco);
        }

        System.out.println("\n \uD83C\uDF0A  \uD83C\uDF0A  \uD83C\uDF0A  \uD83C\uDF0A  \uD83C\uDF0A  \uD83C\uDF0A  \uD83C\uDF0A");

        System.out.println("\n \uD83D\uDCB5 Total pescado pelo barco " + barco01.getNome() + ": " + barco01.calcularTotal() + "€");
        System.out.println(" \uD83D\uDCB0 Salário por tripulante do barco " + barco01.getNome() + ": " + barco01.salarioTripulacao() + "€");
        barco01.exibirDetalhesPesca();

        System.out.println("\n \uD83D\uDCB5 Total pescado pelo barco " + barco02.getNome() + ": " + barco02.calcularTotal() + "€");
        System.out.println(" \uD83D\uDCB0 Salário por tripulante do barco " + barco02.getNome() + ": " + barco02.salarioTripulacao() + "€");
        barco02.exibirDetalhesPesca();

        System.out.println("\n \uD83D\uDCB5 Total pescado pelo barco " + barco03.getNome() + ": " + barco03.calcularTotal() + "€");
        System.out.println(" \uD83D\uDCB0 Salário por tripulante do barco " + barco03.getNome() + ": " + barco03.salarioTripulacao() + "€");
        barco03.exibirDetalhesPesca();

        System.out.println("\n \uD83D\uDCB5 Total pescado pelo barco " + barco04.getNome() + ": " + barco04.calcularTotal() + "€");
        System.out.println(" \uD83D\uDCB0 Salário por tripulante do barco " + barco04.getNome() + ": " + barco04.salarioTripulacao() + "€");
        barco04.exibirDetalhesPesca();
    }
}

