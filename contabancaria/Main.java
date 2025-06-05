public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("João Silva");
        
        ContaCorrente cc = new ContaCorrente(1001, cliente1, 500);
        ContaPoupanca cp = new ContaPoupanca(1002, cliente1, 0.05);

        cc.depositar(1000);
        cc.consultarSaldo();
        cc.sacar(1200); // Testando o limite do cheque especial

        cp.depositar(2000);
        cp.consultarSaldo();
        cp.aplicarRendimento();
        cp.consultarSaldo();
    }
}