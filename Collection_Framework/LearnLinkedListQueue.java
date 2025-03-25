import java.util.LinkedList;
import java.util.Queue;
//Queue : First in first out(FIFO). it has 2 end front and rear , from the rear end elements are added and from the front side the deletion of elements are done.
public class LearnLinkedListQueue {
    public static void main(String[] args) {

        Queue<Integer> queue=  new LinkedList<>();
        // offer adds elements in the queue
        queue.offer(12);
        queue.offer(24);
        queue.offer(36);

        System.out.println(queue);

        System.out.println(queue.poll()); // Deleting the element from the queue
        System.out.println(queue);

        System.out.println(queue.peek()); // check which elements is at the last - next please element

    } 
}
