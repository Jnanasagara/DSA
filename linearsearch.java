public class linearsearch {
    public static void main(String[] args) {
        int[] array = { 9, 2, 1, 4, 5, 8, 3, 5, 0 };
        int index = linearSearch(array, 2);
        if (index != -1) {
            System.out.println("Element found at " + index);
        } else {
            System.out.println("Element does not exist");
        }
    }

    // Time Complexity of O(n)
    private static int linearSearch(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }
}
