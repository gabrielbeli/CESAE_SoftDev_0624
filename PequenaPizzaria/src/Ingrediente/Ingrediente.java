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

    public int getCode() {
        return code;
    }

    public String getNome() {
        return nome;
    }

    public UnidadeMedida getUnidadeMedida() {
        return unidadeMedida;
    }

    public int getCaloriasPorUnidade() {
        return caloriasPorUnidade;
    }
}
