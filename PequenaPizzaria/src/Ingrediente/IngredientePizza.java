package Ingrediente;

public class IngredientePizza {

    private Ingrediente ingrediente;
    private double quantidade;

    public IngredientePizza(){
        this.ingrediente = ingrediente;
        this.quantidade = quantidade;
    }

    public Ingrediente getIngrediente() {
        return ingrediente;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void exibirDetalhes(){
        System.out.println(this.ingrediente + " || " + this.quantidade);
    }
}
