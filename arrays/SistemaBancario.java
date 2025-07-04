public class SistemaBancario {
    public void executar() {
        Scanner scanner = new Scanner(System.in);
        Map<String, Cliente> clientes = new HashMap<>();

        while (true) {
            System.out.println("\n1 - Adicionar conta");
            System.out.println("2 - Mostrar contas de um cliente");
            System.out.println("3 - Sair");
            System.out.print("Escolha: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1 -> {
                    System.out.print("Nome do cliente: ");
                    String nome = scanner.nextLine();
                    Cliente cliente = clientes.getOrDefault(nome, new Cliente(nome));

                    System.out.print("Número da conta: ");
                    String numero = scanner.nextLine();
                    System.out.print("Saldo da conta: ");
                    double saldo = scanner.nextDouble();
                    scanner.nextLine(); // consumir quebra de linha

                    cliente.adicionarConta(new Conta(numero, saldo));
                    clientes.put(nome, cliente);
                    System.out.println("Conta adicionada com sucesso!");
                }
                case 2 -> {
                    System.out.print("Nome do cliente: ");
                    String nome = scanner.nextLine();
                    Cliente cliente = clientes.get(nome);

                    if (cliente != null) {
                        cliente.imprimirContas();
                    } else {
                        System.out.println("Cliente não encontrado.");
                    }
                }
                case 3 -> {
                    System.out.println("Encerrando o programa.");
                    scanner.close();
                    return;
                }
                default -> System.out.println("Opção inválida.");
            }
        }
    }
}
