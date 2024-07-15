package EX_06;

public class Main {
    public static void main(String[] args) {

        Calculadora meusNumeros = new Calculadora();

        System.out.println("A soma dos numeros é igual: " + meusNumeros.soma(5.5, 7.2));
        System.out.println("A subtração dos numeros é igual: " + meusNumeros.subtracao(3.7, 8.4));
        System.out.println("A multiplicação dos numeros é igual: " + meusNumeros.multiplicacao(6.9, 2.5));
        System.out.println("A divisão dos numeros é igual: " + meusNumeros.divisao(12.4, 3.2));
    }
}
