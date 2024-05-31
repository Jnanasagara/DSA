import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class newPriorityQueue {
    public static void main(String[] args) {

        // FIFO data structure

        /*
         * Queue<Double> queue1 = new LinkedList<Double>();
         * queue1.offer(3.5);
         * queue1.offer(2.5);
         * queue1.offer(3.6);
         * queue1.offer(3.1);
         * queue1.offer(4.6);
         * 
         * while (!queue1.isEmpty()) {
         * System.out.println(queue1.poll());
         * }
         */

        Queue<Double> queue1 = new PriorityQueue<Double>();
        queue1.offer(3.5);
        queue1.offer(2.5);
        queue1.offer(3.6);
        queue1.offer(3.1);
        queue1.offer(4.6);

        while (!queue1.isEmpty()) {
            System.out.println(queue1.poll());
        }

        Queue<Double> queue2 = new PriorityQueue<>(Collections.reverseOrder());
        queue2.offer(3.5);
        queue2.offer(2.5);
        queue2.offer(3.6);
        queue2.offer(3.1);
        queue2.offer(4.6);

        while (!queue2.isEmpty()) {
            System.out.println(queue2.poll());
        }

        Queue<String> queue3 = new PriorityQueue<>();
        queue3.offer("A");
        queue3.offer("D");
        queue3.offer("E");
        queue3.offer("F");
        queue3.offer("C");

        while (!queue3.isEmpty()) {
            System.out.println(queue3.poll());
        }
    }
}
