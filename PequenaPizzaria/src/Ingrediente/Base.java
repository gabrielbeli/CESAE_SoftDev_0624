package Ingrediente;

import Pizzaria.Enum.BaseTipo;
import Pizzaria.Enum.UnidadeMedida;

public class Base extends Ingrediente {
    private BaseTipo baseTipo;

    public Base(int code, String nome, UnidadeMedida unidadeMedida, int caloriasPorUnidade, BaseTipo baseTipo) {
        super(code, nome, unidadeMedida, caloriasPorUnidade);
        this.baseTipo = baseTipo;
    }

    public BaseTipo getBaseTipo() {
        return baseTipo;
    }
}