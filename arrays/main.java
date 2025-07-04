package arrays;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("João");
        ContaCorrente conta1 = new ContaCorrente(cliente, "123", 1000.0);
        ContaCorrente conta2 = new ContaCorrente(cliente, "456", 2500.0);

        cliente.adicionarConta(conta1);
        cliente.adicionarConta(conta2);

        System.out.println("Contas do cliente " + cliente.getNome() + ":");
        for (ContaCorrente conta : cliente.getContas()) {
            System.out.println(conta);
        }
    }
}