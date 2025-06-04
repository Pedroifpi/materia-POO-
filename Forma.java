interface Forma {
    void desenhar();
}

class Circulo implements Forma {
    public void desenhar() {
        System.out.println("Desenha círculo");
    }
}

class Quadrado implements Forma {
    public void desenhar() {
        System.out.println("Desenha quadrado");
    }
}
