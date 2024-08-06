package Ingrediente;

import Pizzaria.Enum.OrigemIngrediente;
import Pizzaria.Enum.TipoVegetal;
import Pizzaria.Enum.UnidadeMedida;

public class Vegetal extends Topping {
    private TipoVegetal tipoVegetal;

    public Vegetal(int code, String nome, UnidadeMedida unidadeMedida, int caloriasPorUnidade, OrigemIngrediente origem, TipoVegetal tipoVegetal) {
        super(code, nome, unidadeMedida, caloriasPorUnidade, origem);
        this.tipoVegetal = tipoVegetal;
    }

    public TipoVegetal getTipoVegetal() {
        return tipoVegetal;
    }
}
