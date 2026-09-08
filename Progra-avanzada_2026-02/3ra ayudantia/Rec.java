public class Rec {
    public int division(int n) {
        if (n <= 1) {
            return 1;
        }

        int num = n / 2;
        System.err.println(num);

        return division(num);
    }

    public void revertir(int[] arr, int inicio, int fin) {
        if (inicio >= fin) {
            return;
        }

        int aux = arr[inicio];
        arr[inicio] = arr[fin];
        arr[fin] = aux;

        revertir(arr, inicio + 1, fin - 1);
    }

    public int factorial(int n) {
        if (n <= 1) {
            return 1;
        }

        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Rec r = new Rec();

        System.out.print(r.division(48));

        int[] arr = { 2, 4, 12, 6 };

        r.revertir(arr, 0, arr.length - 1);

        for (int ele : arr) {
            System.err.print(ele + " ");
        }

        System.err.println();

        System.err.println("factorial de 3: " + r.factorial(3));

    }
}
