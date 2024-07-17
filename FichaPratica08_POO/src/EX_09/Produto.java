package EX_09;

public class Produto {

    private String nome;
    private double preco;
    private int quantidadeEmStock;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEmStock = 0;
    }

    public void comprar(int quantidade) {
        if (quantidade > 0) {
            this.quantidadeEmStock += quantidade;
            System.out.println("Compradas " + quantidade + " unidades de " + nome + ".");
        } else {
            System.out.println("Quantidade inválida para compra.");
        }
    }

    public void vender(int quantidade) {
        if (quantidade > 0) {
            if (this.quantidadeEmStock >= quantidade) {
                this.quantidadeEmStock -= quantidade;
                System.out.println("Vendidas " + quantidade + " unidades de " + nome + ".");
            } else {
                System.out.println("Não é possível vender " + quantidade + " unidades de " + nome + ". Stock insuficiente.");
            }
        } else {
            System.out.println("Quantidade inválida para venda.");
        }
    }

    public int getQuantidadeEmStock() {
        return this.quantidadeEmStock;
    }
}
