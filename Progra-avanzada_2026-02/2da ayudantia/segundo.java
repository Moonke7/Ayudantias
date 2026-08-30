class Perro {
    private int edad;
    private String nombre;
    private String raza;

    Perro(int edad, String nombre, String raza) {
        this.edad = edad;
        this.nombre = nombre;
        this.raza = raza;
    }

    public String Tipo() {
        if (edad < 3) {
            return "Cachorro";
        } else if (edad > 3 && edad < 12) {
            return "Adolescente";
        } else {
            return "Adulto";
        }
    }
}

public class segundo {
    public static void main(String[] args) {
        Perro jorge = new Perro(5, "jorge", "bulldog");

        System.out.println(jorge.Tipo());
    }
}