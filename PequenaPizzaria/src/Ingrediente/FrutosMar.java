package Ingrediente;

import Pizzaria.Enum.OrigemIngrediente;
import Pizzaria.Enum.TipoFrutosMar;
import Pizzaria.Enum.UnidadeMedida;

public class FrutosMar extends Topping {
    private TipoFrutosMar tipoFrutosMar;

    public FrutosMar(int code, String nome, UnidadeMedida unidadeMedida, int caloriasPorUnidade, OrigemIngrediente origem, TipoFrutosMar tipoFrutosMar) {
        super(code, nome, unidadeMedida, caloriasPorUnidade, origem);
        this.tipoFrutosMar = tipoFrutosMar;
    }

    public TipoFrutosMar getTipoFrutosMar() {
        return tipoFrutosMar;
    }
}
