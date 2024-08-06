package Ingrediente;

import Pizzaria.Enum.OrigemIngrediente;
import Pizzaria.Enum.TipoQueijo;
import Pizzaria.Enum.UnidadeMedida;

public class Queijo extends Topping {
    private TipoQueijo tipoQueijo;

    public Queijo(int code, String nome, UnidadeMedida unidadeMedida, int caloriasPorUnidade, OrigemIngrediente origem, TipoQueijo tipoQueijo) {
        super(code, nome, unidadeMedida, caloriasPorUnidade, origem);
        this.tipoQueijo = tipoQueijo;
    }

    public TipoQueijo getTipoQueijo() {
        return tipoQueijo;
    }
}
