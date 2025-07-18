public class Principal {
    public static void main(String[] args) {
        Conta conta = new Conta("12345");
        conta.depositar(100.0);
        System.out.println("Saldo após depósito: " + conta.getSaldo());
        
        boolean saqueRealizado = conta.sacar(50.0);
        System.out.println("Saque realizado: " + saqueRealizado);
        System.out.println("Saldo após saque: " + conta.getSaldo());
        
        saqueRealizado = conta.sacar(60.0);
        System.out.println("Saque realizado: " + saqueRealizado);
        System.out.println("Saldo final: " + conta.getSaldo());
    }
}
