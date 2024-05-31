import java.util.*;

public class newQueue { // FIFO data structure
    public static void main(String[] args) {

        // enqueue to add item at tail, i.e adding to queue
        // dequeue to remove item from head

        // add = enqueue , offer()
        // remove = dequeue , poll()

        // Linear Data Structure

        Queue<String> queue = new LinkedList<String>(); // new Queue cannot be used as it is an interface, so use linked
                                                        // list

        queue.offer("Karen");
        queue.offer("Chad");
        queue.offer("Steve");
        queue.offer("Harold");

        System.out.println(queue);
        System.out.println(queue.size());

        queue.poll(); // will remove first item
        System.out.println(queue);

        System.out.println(queue.isEmpty());
        System.out.println(queue.size());
        System.out.println(queue.contains("Harold"));

        // Keyboard buffers
        // Printing queue ---- pg 1 , pg 2 , etc
        // Used in LinkedList , PriorityQueue, Breadth-first search
    }
}
