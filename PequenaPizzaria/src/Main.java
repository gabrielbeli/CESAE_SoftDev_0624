import Ingrediente.Ingrediente;
import Pizza.Pizza;
import Pizzaria.Enum.TamanhoPizza;
import Pizzaria.Enum.UnidadeMedida;

public class Main {

    public static void main(String[] args) {

        Pizza pizza01 = new Pizza("150593", "Romana", "Pizza classica romana com presunto",
                19.95, TamanhoPizza.GRANDE);
        Pizza pizza02 = new Pizza("104305", "Calabresa", "Pizza de calabresa com cebola na brasa",
                16.50, TamanhoPizza.GRANDE);
        Pizza pizza03 = new Pizza("183651", "Caipira", "Pizza com gostinho caipira de frango com milho na manteiga",
                16.45, TamanhoPizza.GRANDE);

        Ingrediente ingrediente01 = new Ingrediente(150, "Queijo azul", UnidadeMedida.GRAMAS, 25);
        Ingrediente ingrediente02 = new Ingrediente(150, "Presunto", UnidadeMedida.GRAMAS, 25);
        Ingrediente ingrediente03 = new Ingrediente(150, "Frango", UnidadeMedida.GRAMAS, 25);

        //pizza01.addIngrediente();

        pizza01.exibirDetalhes();




    }
}
