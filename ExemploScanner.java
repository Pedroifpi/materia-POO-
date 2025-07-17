import java.util.Scanner;

public class ExemploScanner {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu nome:");
        String nome = scanner.nextLine();// Lê uma linha inteira
        System.out.println("Digite sua idade:");
        int idade = scanner.nextInt(); // Lê um número inteiro
        System.out.println("Olá " + nome + ", você tem " + idade + " anos.");
        scanner.close(); // Fecha o scanner para evitar vazamento de recursos
        
    }
}
