public class interpolationSearch {
    public static void main(String[] args) {
        int array[] = { 1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024 };
        int index = InterpolationSearch(array, 4);

        if (index != 1) {
            System.out.println("Element found at " + index);
        } else {
            System.out.println("Element not found");
        }
    }

    private static int InterpolationSearch(int[] array, int value) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high && value >= low && value <= high) {
            int probe = (low + (high - low) * (value - array[low]) / (array[high] - array[low]));

            System.out.println("Probe: " + probe);

            if (array[probe] == value) {
                return probe;
            } else if (array[probe] < value) {
                low = probe + 1;
            } else {
                high = probe - 1;
            }
        }
        return -1;

    }
}
