
import java.util.*;;

public class newArrayLinked {
    public static void main(String[] args) {

        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        long startTime;
        long endTime;
        long elapsedTime;

        for (int i = 0; i < 1000000; i++) {
            linkedList.add(i);
            arrayList.add(i);
        }

        startTime = System.nanoTime();

        linkedList.get(500000);
        endTime = System.nanoTime();

        elapsedTime = endTime - startTime;

        System.out.println("arrayList: \t" + elapsedTime + "ns");
    }
}

/*
 * import java.util.*;;
 * 
 * public class newArrayLinked {
 * public static void main(String[] args) {
 * 
 * LinkedList<Integer> linkedList = new LinkedList<Integer>();
 * ArrayList<Integer> arrayList = new ArrayList<Integer>();
 * 
 * long startTime;
 * long endTime;
 * long elapsedTime;
 * 
 * for (int i = 0; i < 1000000; i++) {
 * linkedList.add(i);
 * arrayList.add(i);
 * }
 * 
 * startTime = System.nanoTime();
 * 
 * arrayList.get(500000);
 * endTime = System.nanoTime();
 * 
 * elapsedTime = endTime - startTime;
 * 
 * System.out.println("ArrayList: \t" + elapsedTime + "ns");
 * }
 * }
 */