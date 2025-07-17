
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExemploScannerArquivo {
    public static void main(String[] args) {
        try {
            File arquivo = new File("dados.txt");
            Scanner scannerArquivo = new Scanner(arquivo);
            while (scannerArquivo.hasNextLine()) {
                String linha = scannerArquivo.nextLine();
                System.out.println(linha);
            }
            scannerArquivo.close(); // Fecha o scanner para evitar vazamento de recursos
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado.");
            e.printStackTrace(); // Corrigido para mostrar a stack trace corretamente
        }
    }
}

