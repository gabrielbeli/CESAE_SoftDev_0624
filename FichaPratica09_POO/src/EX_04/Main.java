package EX_04;

public class Main {
    public static void main(String[] args) {

        Imovel imovel1 = new Imovel("Cimo de vila", 1, "Porto",
                TipoImovel.APARTAMENTO, Acabamento.NOVA, 100, 3, 2, 10);
        Imovel imovel2 = new Imovel("Laurides Bonamigo", 2, "São Paulo", TipoImovel.CASA,
                Acabamento.USADA, 150, 4, 3, 15);

        imovel1.imprimirDescricao();
        System.out.println("Valor do Imóvel 1: " + imovel1.calcularValor() + " EUR");

        System.out.println("--------------------------------------");

        imovel2.imprimirDescricao();
        System.out.println("Valor do Imóvel 2: " + imovel2.calcularValor() + " EUR");

        System.out.println("--------------------------------------");

        Imovel imovelMaisCaro = imovel1.compararImoveis(imovel2);

        if (imovelMaisCaro != null) {
            System.out.println("O imóvel mais caro é o da rua: " + imovelMaisCaro.getRua());
        } else {
            System.out.println("Os imóveis têm o mesmo valor.");
        }

        imovel1.mudarEstado(Acabamento.NOVA_COM_ALTO_ACABAMENTO);
        System.out.println("Novo valor: " + imovel1.calcularValor() + " EUR");

        imovel1.imprimirDescricao();

    }
}
