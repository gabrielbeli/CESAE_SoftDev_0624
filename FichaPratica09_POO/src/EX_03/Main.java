package EX_03;

public class Main {
    public static void main(String[] args) {

        String[] alimentacaoLeao = {"carne", "frango", "peixe"};
        Animal leao = new Animal("Scar", "Leão", "África", 190.0, alimentacaoLeao);

        leao.comer("carne", 500);
        System.out.println("Peso do animal após comer carne: " + leao.getPeso() + " kg");

        leao.comer("vegetais", 300);
        System.out.println("Peso do animal após tentar comer vegetais: " + leao.getPeso() + " kg");
    }
}
