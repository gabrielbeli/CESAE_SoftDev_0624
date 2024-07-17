package EX_11;

public class Conta {

    private int numeroDaConta;
    private double saldo;
    private String titularDaConta;

    public Conta(int numeroDaConta, String titularDaConta) {
        this.numeroDaConta = numeroDaConta;
        this.titularDaConta = titularDaConta;
        this.saldo = 0.0;
    }

    public void transferencia(double valor, Conta contaDestino) {
        if (valor > 0 && this.saldo >= valor) {
            this.saldo -= valor;
            contaDestino.depositar(valor);
            System.out.println("Transferência de " + valor + " EUR para a conta " + contaDestino.numeroDaConta + " realizada com sucesso.");
        } else {
            System.out.println("Transferência não realizada. Saldo insuficiente ou valor inválido.");
        }
    }

    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("Depositados " + valor + " EUR na conta " + this.numeroDaConta + ".");
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    public void levantar(double valor) {
        if (valor > 0 && this.saldo >= valor) {
            this.saldo -= valor;
            System.out.println("Levantados " + valor + " EUR da conta " + this.numeroDaConta + ".");
        } else {
            System.out.println("Levantamento não realizado. Saldo insuficiente ou valor inválido.");
        }
    }

    public void mostrarSaldo() {
        System.out.println("Saldo da conta " + this.numeroDaConta + ": " + this.saldo + " EUR");
    }
}
