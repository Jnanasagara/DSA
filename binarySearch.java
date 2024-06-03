public class binarySearch {
    public static void main(String[] args) {
        int array[] = new int[100];
        int target = 2;

        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }

        int index = binarySearch(array, target);
        if (index == -1) {
            System.out.println(target + " not found");
        } else {
            System.out.println("Element found");
        }
    }

    private static int binarySearch(int[] array, int target) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int middle = low + (high - low) / 2;
            int value = array[middle];

            if (value < target) {
                low = middle + 1;
            } else if (value > target) {
                high = middle - 1;
            } else {
                return middle;
            }
        }
        return -1;
    }
}