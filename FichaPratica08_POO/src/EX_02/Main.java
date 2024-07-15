package EX_02;

public class Main {
    public static void main(String[] args) {

        Cao rex = new Cao("Rex", "bull");
        Cao max = new Cao("Max", "pastor alemão");

        rex.ladrar();
        max.ladrar();

        System.out.println("_____________________________");

        rex.setLatido("auuuuuuuuuuuuuuuuuuuuuuu");

        rex.ladrar();
        max.ladrar();

    }
}
