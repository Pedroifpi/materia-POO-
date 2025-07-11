public class aumentaFrase {
    public static void main(String[] args) {
        String frase = null;
        String novaFrase = null;

        try {
            novaFrase = frase.toUpperCase();
        } catch (NullPointerException e) {
            System.out.println("a frase inicial esta nula, para solucional tal o problema, foi atribuido um valor default");
            frase = "Frase vazia";
        } finally {
            // Garantimos que novaFrase seja inicializada corretamente após o tratamento
            novaFrase = frase.toUpperCase();
        }

        System.out.println("Frase Antiga: " + frase);
        System.out.println("Frase Nova: " + novaFrase);
    }
}
