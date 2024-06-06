public class selectionSort {
    public static void main(String[] args) {
        int array[] = { 9, 1, 2, 6, 5, 3, 7, 4, 8 };
        SelectionSort(array);
        for (int i : array) {
            System.out.println(i);
        }
    }

    private static void SelectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[min] > array[j]) {
                    min = j;
                }
            }
            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }
    }
}
