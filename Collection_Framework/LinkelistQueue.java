
import java.util.LinkedList;
import java.util.Queue;

public class LinkelistQueue {
    public static void main(String[] args) {
        Queue<Integer> n = new LinkedList();
        n.offer(20);
        n.offer(30);
        n.offer(80);
        n.offer(90);
        n.offer(60);
        n.offer(50);
        System.out.println(n);
        System.out.println(n.peek());
        System.out.println(n.poll());
        System.out.println(n);
        System.out.println(n.peek());
    }
}
