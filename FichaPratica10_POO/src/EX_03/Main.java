package EX_03;

public class Main {
    public static void main(String[] args) {

        BarcoPesca barco01 = new BarcoPesca("Carmelita", "Branco e azul", "1993", MarcaBarco.BENTZ, 15, 2000 );
        BarcoPesca barco02 = new BarcoPesca("Amélia", "Branco e amarelo", "1994", MarcaBarco.DEVLIN, 10, 1500 );
        BarcoPesca barco03 = new BarcoPesca("Rosalia", "Branco e rosa", "1995", MarcaBarco.MAZURY, 20, 2500 );
        BarcoPesca barco04 = new BarcoPesca("Tereza", "Branco e verde", "1996", MarcaBarco.QUICKSILVER, 15, 2000 );
        BarcoPesca barco05 = new BarcoPesca("Santa Maria", "Branco e laranja", "1997", MarcaBarco.WOOLDRIDGE, 12, 1800 );
        BarcoPesca barco06 = new BarcoPesca("Encarnação", "Branco e preto", "1998", MarcaBarco.VORAZ, 25, 3000 );
        BarcoPesca barco07 = new BarcoPesca("Bromélia", "Branco e roxo", "1999", MarcaBarco.SAVER, 10, 1500 );
        BarcoPesca barco08 = new BarcoPesca("Guardalupe", "Branco e cinza ", "2000", MarcaBarco.SMARTILNER, 15, 1200 );

        Peixe peixe01 = new Peixe("salmão", 6.8, 14.0);
        Peixe peixe02 = new Peixe("truta", 4.5, 9.8);
        Peixe peixe03 = new Peixe("tilapia", 3.7, 5.5);
        Marisco marisco01 = new Marisco("ostra", 0.35, 15.5);
        Marisco marisco02 = new Marisco("mexilhão", 0.15, 7.9);
        Marisco marisco03 = new Marisco("camarão", 0.18, 12.3);

        barco01.exibirDetalhesPesca();


    }
}
