package EX_04;

public class Circulo {

    private Double raio;

    public Circulo(double raio){
        this.raio = raio;
    }

    public double perimetro() {
        return 2 * 3.14 * this.raio;
    }

    public double area() {
        return 3.14 * (this.raio * this.raio) ;
    }
}
