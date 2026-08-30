import java.util.Scanner;

public class primero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("ingrese n: ");
        int n = input.nextInt();

        int contador = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                contador++;
            }
        }

        System.out.println("La cantidad de pares es: " + contador);
    }

}
