import java.util.LinkedList;

public class newLinkedList {
    public static void main(String[] args) { // linked list can be used as queue and stack

        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.offer("A");
        linkedList.offer("B");
        linkedList.offer("C");
        linkedList.offer("D");
        linkedList.offer("F");

        linkedList.add(4, "E");
        linkedList.remove(3);
        String n = linkedList.peekFirst();
        System.out.println(n);

        System.out.println(linkedList);
    }
}
