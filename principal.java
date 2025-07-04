public class principal {
    public static void main(String args[]) {
        contabancaria conta = new contabancaria();
        conta.setnumero.numero = "12345";
        conta.setTitular("joao");
        conta.setSaldo(1000.00);
        

        System.out.println"numero da conta:"+conta.getNumero();
        System.out.println"titular da conta:"+conta.getTitular();
        System.out.println"saldo da conta:"+conta.getSaldo();


    }
    public static void main(String[] args) {
        conta c = new conta();
        c.setNumero("12345");
        c.setTitular("João");
        c.setSaldo(1000.00);

        System.out.println("Número da conta: " + c.getNumero());
        System.out.println("Titular da conta: " + c.getTitular());
        System.out.println("Saldo da conta: " + c.getSaldo());
    }