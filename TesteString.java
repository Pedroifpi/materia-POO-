public class TesteString {
    private static void aumentaLetras() throws Exception {
        String frase = null;
        String novaFrase = null;
        try {
            novaFrase = frase.toUpperCase();
        } catch (NullPointerException e) {
            throw new Exception(e);
        }

        System.out.println("Frase Antiga: " + frase);
        System.out.println("Frase Nova: " + novaFrase);
    }

    public static void main(String[] args) {
        try {
            aumentaLetras();
        } catch (Exception e) {
            System.out.println("Ocorreu um erro ao executar o método aumentaLetras: " +e);
        }
    }
}
