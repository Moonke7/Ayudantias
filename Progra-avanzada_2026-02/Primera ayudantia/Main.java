
class Test {

    public int sumaMaxima(int[] arreglo) {
        int sumaMayor = 0;

        for (int i = 0; i < arreglo.length - 1; i++) {
            int base = arreglo[i];
            int suma = base + arreglo[i + 1];

            if (suma > sumaMayor) {
                sumaMayor = suma;
            }
        }

        return sumaMayor;
    }
};

public class Main {
    public static void main(String[] args) {
        Test clase = new Test();

        int[] arr = { 1, 2, 3, 4 };

        int n = clase.sumaMaxima(arr);
        System.out.println(n);
    }
}