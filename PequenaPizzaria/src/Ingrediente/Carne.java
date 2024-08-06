package Ingrediente;

import Pizzaria.Enum.OrigemIngrediente;
import Pizzaria.Enum.TipoCarne;
import Pizzaria.Enum.UnidadeMedida;

public class Carne extends Topping {
    private TipoCarne tipoCarne;

    public Carne(int code, String nome, UnidadeMedida unidadeMedida, int caloriasPorUnidade, OrigemIngrediente origem, TipoCarne tipoCarne) {
        super(code, nome, unidadeMedida, caloriasPorUnidade, origem);
        this.tipoCarne = tipoCarne;
    }

    public TipoCarne getTipoCarne() {
        return tipoCarne;
    }
}
