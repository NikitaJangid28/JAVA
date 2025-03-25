import java.util.ArrayDeque;
public class LArrayDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> Num= new ArrayDeque<>();
        Num.offer(10);
        Num.offer(20);
        Num.offer(30);
        Num.offer(40);
        Num.offer(50);
        Num.offer(60);
        System.out.println(Num);
        System.out.println(Num.remove());
        System.out.println(Num.removeLast());
        System.out.println(Num.contains(30));
        System.out.println(Num);
        System.out.println(Num.getFirst());
        System.out.println(Num.getLast());

    }
}
