package EX_02;

public class Cao {

    private String nome;
    private String raca;
    private String latido = "au au au";

    public Cao(String nome, String raca) {
        this.nome = nome;
        this.raca = raca;
    }

    public void ladrar() {
        System.out.println(this.latido);
    }

    public void setLatido(String latido) {
       System.out.println(this.latido = latido);
    }
}
