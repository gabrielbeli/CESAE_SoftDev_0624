package EX_11;

public class Main {
    public static void main(String[] args) {

        Conta conta1 = new Conta(12345, "João Silva");

        conta1.depositar(1000);
        conta1.mostrarSaldo();

        conta1.levantar(120);
        conta1.mostrarSaldo();

        Conta conta2 = new Conta(67890, "Maria Fernandes");
        Conta conta3 = new Conta(11223, "Pedro Santos");

        conta2.depositar(500);
        conta3.depositar(300);

        conta2.transferencia(200, conta3);

        conta1.mostrarSaldo();
        conta2.mostrarSaldo();
        conta3.mostrarSaldo();
    }
}
