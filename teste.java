public class teste {
    public static void main(String[] args) {
        calculadora c= new calculadora();
        System.out.println( c.soma(2, 3));
        System.out.println( c.soma(2.5, 3.5));

    }
    
}
class calculadora {
    public int soma(int a, int b) {
        return a + b;
    }

    public double soma(double a, double b) {
        return a + b;
    }
}