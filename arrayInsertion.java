public class arrayInsertion {
    static int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13 };

    static void insertElement(int arr[], int n, int x, int pos) {
        for (int i = n - 1; i >= pos; i--) {
            arr[i + 1] = arr[i];
        }
        arr[pos] = x;
    }

    static void printArray(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int n = arr.length;
        int x = 4;
        int pos = 2;

        insertElement(arr, n, x, pos);
        printArray(arr, n);
    }
}
