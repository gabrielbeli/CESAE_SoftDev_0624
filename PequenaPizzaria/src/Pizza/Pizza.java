package Pizza;

import Ingrediente.Base;
import Ingrediente.Topping;
import Pizzaria.Enum.TamanhoPizza;
import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private static final int MAX_INGREDIENTS = 5;
    private String code;
    private String nome;
    private String descricao;
    private double preco;
    private TamanhoPizza tamanhoPizza;
    private Base base;
    private ArrayList<IngredientePizza> ingredientesPizza;
    private double caloriasTotais;

    public Pizza(String code, String nome, String descricao, double preco, TamanhoPizza tamanhoPizza) {
        this.code = code;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.tamanhoPizza = tamanhoPizza;
        this.ingredientesPizza = new ArrayList<>();
        this.caloriasTotais = 0;
    }

    public void setBase(Base base) {
        this.base = base;
        atualizarCalorias();
    }

    public void addIngredientePizza(IngredientePizza ingredientePizza) {
        if (ingredientesPizza.size() < MAX_INGREDIENTS) {
            ingredientesPizza.add(ingredientePizza);
            atualizarCalorias();
        } else {
            System.out.println("Número máximo de ingredientes atingido!");
        }
    }

    public void removeIngredientePizza(int code) {
        List<IngredientePizza> toRemove = new ArrayList<>();

        for (IngredientePizza ingredientePizza : ingredientesPizza) {
            if (ingredientePizza.getIngrediente().getCode() == code) {
                toRemove.add(ingredientePizza);
            }
        }

        ingredientesPizza.removeAll(toRemove);
        atualizarCalorias();
    }

    private void atualizarCalorias() {
        caloriasTotais = 0;
        if (base != null) {
            caloriasTotais += base.getCaloriasPorUnidade();
        }
        for (IngredientePizza ingredientePizza : ingredientesPizza) {
            caloriasTotais += ingredientePizza.getIngrediente().getCaloriasPorUnidade() * ingredientePizza.getQuantidade();
        }
    }

    public double calcularCalorias() {
        return caloriasTotais;
    }

    public void exibirDetalhes() {
        System.out.println("\n********* PIZZA ********** \n");
        System.out.println("Código: " + this.code + " || Nome: " + this.nome + " || Preço: " + this.preco);
        System.out.println("Descrição: " + this.descricao);
        System.out.println("Tamanho: " + this.tamanhoPizza);
        if (base != null) {
            System.out.println("Base: " + base.getBaseTipo());
        }
        System.out.println("\nIngredientes:\n");
        for (IngredientePizza ingredientePizza : ingredientesPizza) {
            System.out.println(ingredientePizza.getIngrediente().getNome() + " || Quantidade: " + ingredientePizza.getQuantidade() + " || Origem: " + (ingredientePizza.getIngrediente() instanceof Topping ? ((Topping)ingredientePizza.getIngrediente()).getOrigem() : "N/A"));
        }
    }
}
