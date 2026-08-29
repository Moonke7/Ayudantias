class Perro {
    private int peso;
    private String nombre;

    Perro(int peso) {
        this.peso = peso;
        this.nombre = "jorge";
    }

    public void changeName(String nombre) {
        this.nombre = nombre;
    }
}

public class Hola {
    public static void main(String[] args) {
        Perro jorge = new Perro(30);

        jorge.changeName("juan");
    }
}
