package Pizza;


import Ingrediente.Ingrediente;
import Ingrediente.IngredientePizza;
import Pizzaria.Enum.TamanhoPizza;

import java.util.ArrayList;

public class Pizza {
    private final int MAX_INGREDIENTS = 5;
    private String code;
    private String nome;
    private String descricao;
    private double preco;
    private TamanhoPizza tamanhoPizza;
    private ArrayList<IngredientePizza> ingredientePizza;

    public Pizza(String code, String nome, String descricao, double preco, TamanhoPizza tamanhoPizza) {
        this.code = code;
        this.nome = nome;
        this.descricao = descricao;
        this.tamanhoPizza = tamanhoPizza;
        this.preco = preco;
        this.ingredientePizza = new ArrayList<IngredientePizza>();
    }

    public void addIngrediente(IngredientePizza ingredienteNovo) {
        ingredientePizza.add(ingredienteNovo);
    }

    public void removeIngrediente(String code) {

        ingredientePizza.remove(code);
    }

    public double calcularPesoIngrediente() {
        double pesoTotal = 0;

        for (IngredientePizza ingrediente : ingredientePizza) {
            pesoTotal += ingrediente.getQuantidade();
        }
        return pesoTotal;
    }

    public double calcularCaloria(double pesoTotal, int caloriaPorUnidade) {

        return pesoTotal * caloriaPorUnidade;

    }

    public void exibirDetalhes(){
        System.out.println("\n********* PIZZA ********** \n");
        System.out.println(this.code + "||" + this.nome + "||" + this.preco);
        System.out.println("Sobre: " + this.descricao);
        System.out.println("Tamanho: " +this.tamanhoPizza);
        this.exibirDetalhesIngredientes();
    }

    public void exibirDetalhesIngredientes(){
        System.out.println("\nLista de ingredientes: ");

        for (int X = 0; X < ingredientePizza.size(); X++) {
            System.out.println("Ingrediente " + (X + 1) + " - ");
            this.ingredientePizza.get(X).exibirDetalhes();
        }
    }


}


