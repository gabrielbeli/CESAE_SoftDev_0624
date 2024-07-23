package Ingrediente;

import Pizzaria.Enum.UnidadeMedida;

public class Ingrediente {
    private int code;
    private String nome;
    private UnidadeMedida unidadeMedida;
    private int caloriasPorUnidade;

    public Ingrediente(int code, String nome, UnidadeMedida unidadeMedida, int caloriasPorUnidade) {
        this.code = code;
        this.nome = nome;
        this.unidadeMedida = unidadeMedida;
        this.caloriasPorUnidade = caloriasPorUnidade;
    }

    public UnidadeMedida getUnidadeMedida() {
        return unidadeMedida;
    }
}
