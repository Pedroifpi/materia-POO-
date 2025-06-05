 public abstract class Conta {
    private int numero;
    protected double saldo;
    private Cliente titular;

    public Conta(int numero, Cliente titular) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = 0.0;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado na conta " + this.numero);
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    public void consultarSaldo() {
        System.out.println("Saldo da conta " + this.numero + ": R$" + this.saldo);
    }

    abstract void sacar(double valor);
}
