public class Ejercicio {
    // i = inicio , j = final
    public void invertir(int[] arr, int i, int j) {
        if (i >= j) {
            return;
        }

        int aux = arr[i];
        arr[i] = arr[j];
        arr[j] = aux;

        invertir(arr, i + 1, j - 1);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };

        Ejercicio ej = new Ejercicio();
        ej.invertir(arr, 0, arr.length - 1);

        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }
}
