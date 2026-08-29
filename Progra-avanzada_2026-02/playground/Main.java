
//Lee cuántos productos hay (Scanner), luego con un for pide nombre y precio de cada uno y guárdalos en dos arrays paralelos (o un ArrayList si quieres practicar colecciones). Con un foreach muestra el producto más caro y el más barato.
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] precios = new int[n];
        String[] nombres = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el precio del producto: ");
            int precio = sc.nextInt();
            System.out.println("");
            System.out.print("Ingrese el nombre del producto: ");
            String nombre = sc.next();
            System.out.println("");

            precios[i] = precio;
            nombres[i] = nombre;
        }

        for (int i = 0; i < n; i++) {
            System.out.println(nombres[i]);
        }
    }
}