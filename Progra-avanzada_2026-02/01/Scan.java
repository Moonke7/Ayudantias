import java.util.Scanner;

public class Scan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese cuantos alumnos son: ");
        int n = sc.nextInt();

        float suma = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese su nota: ");
            float nota = sc.nextFloat();
            suma += nota;
        }

        float promedio = suma / n;
        System.out.println("El promedio es: " + promedio);

        sc.close();
    }
}