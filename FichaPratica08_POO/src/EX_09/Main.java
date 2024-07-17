package EX_09;

public class Main {
    public static void main(String[] args) {

        Produto produto = new Produto("Caneta", 1.50);

        produto.comprar(5);

        produto.vender(2);

        System.out.println("Quantidade em stock: " + produto.getQuantidadeEmStock());

        produto.comprar(10);

        produto.vender(35);

        System.out.println("Quantidade em stock: " + produto.getQuantidadeEmStock());
    }
}
