package EX_01;

import java.util.ArrayList;

public class MusicPlayer {

    private ArrayList<Musica> programacao;

    public MusicPlayer() {
        this.programacao = new ArrayList<>();
    }

    // Adicionar música
    public void adicionarMusica(Musica musica) {
        programacao.add(musica);
    }

    // Trocar músicas
    public void trocarMusicas(int indice1, int indice2) {
        if (indice1 < programacao.size() && indice2 < programacao.size()) {

            Musica temp = programacao.get(indice1);
            programacao.set(indice1, programacao.get(indice2));
            programacao.set(indice2, temp);

        } else {
            System.out.println("Índices inválidos.");
        }
    }

    // Remover música
    public void removerMusica(int indice) {
        if (indice < programacao.size()) {
            programacao.remove(indice);
        } else {
            System.out.println("Índice inválido.");
        }
    }

    // Remover todas as músicas
    public void removerTodasMusicas() {
        programacao.clear();
    }

    // Imprimir relatório
    public void imprimirRelatorio() {

        if (programacao.isEmpty()) {
            System.out.println("A programação está vazia.");
        } else {

            for (int X = 0; X < programacao.size(); X++) {
                System.out.println("Música " + (X + 1) + ": " + programacao.get(X).toString());
            }
        }
    }

    // Calcular e imprimir duração total
    public void duracao() {
        int duracaoTotal = 0;

        for (int X = 0; X < programacao.size(); X++) {
            duracaoTotal += programacao.get(X).getDuracao();
        }

        int horas = duracaoTotal / 3600;
        int minutos = (duracaoTotal % 3600) / 60;
        int segundos = duracaoTotal % 60;

        System.out.println("\nDuração total: " + horas + minutos + segundos);
    }
}
