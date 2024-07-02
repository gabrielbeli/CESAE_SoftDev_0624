package FichaPratica06;

public class ex05 {
    /**
     * Método que retorna o maior elemento do array
     *
     * @param vetor Array a ser analisado
     * @return Maior valor
     */
    public static int maiorElementoArray(int[] vetor) {

        int maiorValor = vetor[0];

        // Ciclo que vai iterar o vetor para encontrar o maior elemento
        for (int X = 1; X < vetor.length; X++) {
            // Se o vetor na posição atual for maior que "maiorElemento"
            if (vetor[X] > maiorValor) {
                maiorValor = vetor[X];
            }
        }

        return maiorValor;
    }

    /**
     * Método que retorna o menor elemento do array
     *
     * @param vetor Array a ser analisado
     * @return Menor valor
     */
    public static int menorElementoArray(int[] vetor) {

        int menorValor = vetor[0];

        for (int X = 1; X < vetor.length; X++) {
            if (vetor[X] < menorValor) {
                menorValor = vetor[X];
            }
        }

        return menorValor;
    }

    /**
     * Método que avalia se um array é ou não crescente
     *
     * @param vetor Array a ser analisado
     * @return True - se crescente || False - se não crescente
     */
    public static boolean arrayCrescente(int[] vetor) {

        for (int X = 1; X < vetor.length; X++) {
            if (vetor[X] <= vetor[X - 1]) {
                return false;
            }
        }

        return true;
    }

    /**
     * Método que imprime um array na consola
     *
     * @param vetor Array a ser impresso
     */
    public static void imprimirArray(int[] vetor) {
        for (int X = 1; X < vetor.length; X++) {
            System.out.println("Array[" + X + "]: " + vetor[X]);
        }
    }
}

