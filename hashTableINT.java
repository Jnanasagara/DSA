import java.util.*;

public class hashTableINT {
    public static void main(String[] args) {
        Hashtable<Integer, String> table = new Hashtable<>(10); // key as integer.
        table.put(100, "Spongebob");
        table.put(123, "Patrick");
        table.put(321, "Sandy");
        table.put(555, "Squidward");
        table.put(777, "Gary");

        System.out.println("Index" + "\t" + "Key" + "\t" + "Object");
        for (Integer key : table.keySet()) {
            System.out.println(key.hashCode() % 10 + "\t" + key + "\t" + table.get(key)); // key.hashCode() % 10 gives
                                                                                          // the index of the key.
        }
    }
}
