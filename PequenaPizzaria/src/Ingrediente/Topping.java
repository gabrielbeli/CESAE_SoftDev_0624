package Ingrediente;

import Pizzaria.Enum.OrigemIngrediente;
import Pizzaria.Enum.UnidadeMedida;

public class Topping extends Ingrediente {
    private OrigemIngrediente origem;

    public Topping(int code, String nome, UnidadeMedida unidadeMedida, int caloriasPorUnidade, OrigemIngrediente origem) {
        super(code, nome, unidadeMedida, caloriasPorUnidade);
        this.origem = origem;
    }

    public OrigemIngrediente getOrigem() {
        return origem;
    }
}
