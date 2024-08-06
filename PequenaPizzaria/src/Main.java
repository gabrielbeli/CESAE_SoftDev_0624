import Ingrediente.Base;
import Ingrediente.Queijo;
import Ingrediente.Carne;
import Ingrediente.Vegetal;
import Ingrediente.FrutosMar;
import Pizzaria.Enum.BaseTipo;
import Pizzaria.Enum.TipoQueijo;
import Pizzaria.Enum.TipoCarne;
import Pizzaria.Enum.TipoVegetal;
import Pizzaria.Enum.TipoFrutosMar;
import Pizzaria.Enum.TamanhoPizza;
import Pizzaria.Enum.UnidadeMedida;
import Pizzaria.Enum.OrigemIngrediente;
import Pizza.Pizza;
import Pizza.IngredientePizza;

public class Main {

    public static void main(String[] args) {

        Base massaFina = new Base(1, "Massa Fina", UnidadeMedida.GRAMAS, 200, BaseTipo.MASSA_FINA);

        Queijo queijoMozarela = new Queijo(2, "Mozarela", UnidadeMedida.GRAMAS, 3, OrigemIngrediente.NACIONAL, TipoQueijo.MOZARELLA);
        Carne carneFrango = new Carne(3, "Frango", UnidadeMedida.GRAMAS, 3, OrigemIngrediente.NACIONAL, TipoCarne.FRANGO);
        Vegetal pimento = new Vegetal(4, "Pimento", UnidadeMedida.GRAMAS, 2, OrigemIngrediente.NACIONAL, TipoVegetal.PIMENTO);
        FrutosMar camarão = new FrutosMar(5, "Camarão", UnidadeMedida.GRAMAS, 3, OrigemIngrediente.IMPORTADO, TipoFrutosMar.CAMARÃO);
        Queijo queijoSerra = new Queijo(6, "Serra", UnidadeMedida.GRAMAS, 4, OrigemIngrediente.NACIONAL, TipoQueijo.SERRA);
        Carne carnePorco = new Carne(7, "Porco", UnidadeMedida.GRAMAS, 4, OrigemIngrediente.NACIONAL, TipoCarne.PORCO);

        Pizza pizza = new Pizza("1505", "Mistureba", "Essa delicia traz uma mistura inesperada feita por um caipira pescador", 19.95, TamanhoPizza.GRANDE);
        pizza.setBase(massaFina);
        pizza.addIngredientePizza(new IngredientePizza(queijoMozarela, 100));
        pizza.addIngredientePizza(new IngredientePizza(carneFrango, 200));
        pizza.addIngredientePizza(new IngredientePizza(pimento, 50));
        pizza.addIngredientePizza(new IngredientePizza(camarão, 75));
        //pizza.addIngredientePizza(new IngredientePizza(queijoSerra, 75);

        pizza.exibirDetalhes();
        System.out.println("Total de calorias: " + pizza.calcularCalorias());

        pizza.removeIngredientePizza(3);
        pizza.exibirDetalhes();
        System.out.println("Total de calorias após remoção: " + pizza.calcularCalorias());
    }
}
