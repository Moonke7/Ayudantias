class Persona {
    private int edad;
    private String nombre;

    Persona(int edad, String nombre) {
        this.edad = edad;
        this.nombre = nombre;
    }

    public void saludar() {
        System.out.println("Hola, soy" + nombre + ", tengo " + edad + " años");

    }

    public String getNombre() {
        return nombre;
    }
}

public class Clases {
    public static void main(String[] args) {
        Persona p1 = new Persona(0, "Marcos");

        System.out.println(p1.getNombre());
    }
}
