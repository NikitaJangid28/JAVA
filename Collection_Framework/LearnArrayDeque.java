
import java.util.ArrayDeque;

public class LearnArrayDeque {
    public static void main(String[] args) {

        ArrayDeque<Integer> adq = new ArrayDeque<>();

        adq.offer(12);
        adq.offer(45);
        adq.offer(10);
        adq.offer(26);

        System.out.println(adq);

        System.out.println(adq.peek());
        System.out.println(adq.peekFirst()); // return element which is present on head
        System.out.println(adq.peekLast()); // return element which is present on tail

        System.out.println(adq.poll());
        System.out.println("poll()" +adq);

        System.out.println(adq.pollFirst());// remove element which is present on head
        System.out.println("pollFirst()" +adq);

        System.out.println(adq.pollLast());// remove element which is present on tail
        System.out.println("pollLast()" +adq);

    }
}
