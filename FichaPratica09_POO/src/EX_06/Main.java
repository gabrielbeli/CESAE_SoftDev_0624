package EX_06;

public class Main {
    public static void main(String[] args) {

        Atleta atleta1 = new Atleta("Gabriel", Modalidades.NADO_LIVRE, 1.82, 77.5, "Brasil");
        Atleta atleta2 = new Atleta("Ricardo", Modalidades.NADO_LIVRE, 1.78, 64.5, "Brasil");
        Atleta atleta3 = new Atleta("Vitor", Modalidades.SALTO_VARA, 1.76, 58.4, "Portugal");
        Atleta atleta4 = new Atleta("Pedro", Modalidades.SALTO_VARA, 1.80, 75.5, "Portugal");
        Atleta atleta5 = new Atleta("Amelie", Modalidades.SALTO_ORNAMENTAL, 1.64, 52.5, "França");
        Atleta atleta6 = new Atleta("Poulin", Modalidades.SALTO_ORNAMENTAL, 1.59, 50.5, "França");

        Competicao competicao1 = new Competicao("Nado Livre","Paris", 2);
        Competicao competicao2 = new Competicao("Salto Vara","Paris", 2);
        Competicao competicao3 = new Competicao("Salto Ornamental","Paris", 2);

        // competição 1
        competicao1.addAtleta(atleta1);
        competicao1.addAtleta(atleta2);

        competicao1.imprimirCompetidores();
        Atleta vencedorC1 = atleta1.nadoLivre(atleta2);

        System.out.println("\n          \uD83C\uDFC6 Vencedor na competição \uD83C\uDFCA\uD83C\uDFFF\n");
        vencedorC1.exibirDetalhes();

        System.out.println("\n");

        // competição 2
        competicao2.addAtleta(atleta3);
        competicao2.addAtleta(atleta4);

        competicao2.imprimirCompetidores();
        Atleta vencedorC2 = atleta3.nadoLivre(atleta4);

        System.out.println("\n          \uD83C\uDFC6 Vencedor na competição \uD83C\uDFC3\n");
        vencedorC2.exibirDetalhes();

        // competição 3
        System.out.println("\n");

        competicao3.addAtleta(atleta5);
        competicao3.addAtleta(atleta6);

        competicao3.imprimirCompetidores();
        Atleta vencedorC3 = atleta5.nadoLivre(atleta6);

        System.out.println("\n           \uD83C\uDFC6 Vencedor na competição \uD83C\uDFCA\uD83C\uDFFB\u200D♀\uFE0F\n");
        vencedorC3.exibirDetalhes();

        System.out.println("\n");




    }

}
