import java.util.*;

public class hashtableSTR {
    public static void main(String[] args) {
        Hashtable<String, String> table = new Hashtable<>(10);
        table.put("100", "Chad");
        table.put("123", "Gabby");
        table.put("135", "KSI");
        table.put("121", "Simon");
        table.put("874", "Harry");
        table.put("888", "Josh");
        table.put("977", "Tobi");

        System.out.println("Index" + "\t" + "Key" + "\t" + "Object");
        for (String key : table.keySet()) {
            System.out.println(key.hashCode() % 10 + "\t" + key + "\t" + table.get(key));
        }
    }
}
