package EX_01;

public class Main {
    public static void main(String[] args) {

        MusicPlayer player = new MusicPlayer();

        Musica musica1 = new Musica("The Scientist", "Rock Alternativo", "Coldplay", 260);
        Musica musica2 = new Musica("Bohemian Rhapsody", "Rock", "Queen", 359);
        Musica musica3 = new Musica("Mestre da Culinária", "Heavy Metal", "Quim Barreiros", 233);
        Musica musica4 = new Musica("Imagine", "Soft Rock", "John Lennon", 183);
        Musica musica5 = new Musica("Billie Jean", "Pop", "Michael Jackson", 294);
        Musica musica6 = new Musica("Hotel California", "Rock", "Eagles", 391);

        player.adicionarMusica(musica1);
        player.adicionarMusica(musica2);
        player.adicionarMusica(musica3);
        player.adicionarMusica(musica4);
        player.adicionarMusica(musica5);
        player.adicionarMusica(musica6);

        System.out.println("Relatório inicial:");
        player.imprimirRelatorio();

        // Trocar a última música com a primeira
        player.trocarMusicas(0, 5);
        System.out.println("\nApós troca da última com a primeira:");
        player.imprimirRelatorio();

        // Remover a música número 3
        player.removerMusica(2);
        System.out.println("\nApós remover a música número 3:");
        player.imprimirRelatorio();

        // Calcular duração total
        player.duracao();

        // Remover todas as músicas
        player.removerTodasMusicas();
        System.out.println("\nApós remover todas as músicas:");
        player.imprimirRelatorio();

        // Calcular duração total após remover todas as músicas
        System.out.println("\nApós remover todas as músicas.");
        player.duracao();
    }
}