public class Lab {
    public static void main(String[] args) {
        Alumno al = new Alumno("juan");

        al.agregarNota(2.5);
        al.agregarNota(3.6);
        al.agregarNota(5.2);
        al.agregarNota(6.2);
        al.agregarNota(7.0);

        al.ordenar();

        al.imprimir();
    }
}

class Alumno {
    private String nombre;
    private double[] notas = new double[5];
    private int pos = -1;

    public Alumno(String nombre) {
        this.nombre = nombre;
    }

    public void agregarNota(double nota) {
        if (pos <= 5)
            notas[++pos] = nota;
    }

    public void ordenar() {
        for (int i = 0; i < 4; i++) {
            for (int j = i + 1; j < 5; j++) {
                if (notas[i] > notas[j]) {
                    double aux = notas[i];
                    notas[i] = notas[j];
                    notas[j] = aux;
                }
            }
        }
    }

    public void imprimir() {
        for (double n : notas)
            System.out.println(n);
    }
}

class Client {
    private String rut;
    private String nombre;
    private int telefono;
    private String plan;

    public Client(String r, String n, int t, String p) {
        rut = r;
        nombre = n;
        telefono = t;
        plan = p;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String n) {
        nombre = n;
    }

    public void mejorarPlan() {
        if (plan == "Basico") {
            System.err.println("Mejoraste a avanzado");
            plan = "Avanzado";
        } else if (plan == "Avanzado") {
            System.err.println("Mejoraste a premium");
            plan = "Premium";
        } else {
            System.err.println("Ya estas en el mejor plan");
        }
    }
}