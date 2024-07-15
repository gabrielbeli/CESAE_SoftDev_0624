package EX_03;

public class Main {
    public static void main(String[] args) {

        Retangulo retangulo01 = new Retangulo(10, 20);
        Retangulo retangulo02 = new Retangulo(25, 50);

        System.out.println("Area do retangulo: " + retangulo01.area() + " metros quadrados");

        System.out.println("Perimetro do retangulo: " + retangulo02.perimetro() + " metros");

    }
}
