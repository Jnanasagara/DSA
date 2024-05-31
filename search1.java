import java.util.*;

public class search1 {
    public static void main(String[] args) {
        int a[] = { 1, 2456, 74, 2446, 5756, 221, 467, 4, 67, 90, 2 };

        Arrays.sort(a);
        System.out.println("min - " + a[0] + "  max - " + a[a.length - 1]);
    }
}
