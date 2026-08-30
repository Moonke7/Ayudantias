class Rectangulo {
    private int largo;
    private int ancho;

    Rectangulo(int largo, int ancho) {
        this.ancho = ancho;
        this.largo = largo;
    }

    public int Area() {
        return largo * ancho;
    }

    public int Perimetro() {
        return largo * 2 + ancho * 2;
    }
}

public class tercero {
    public static void main(String[] args) {
        Rectangulo rec = new Rectangulo(3, 4);

        System.out.println(rec.Area());
        System.out.println(rec.Perimetro());
    }
}
