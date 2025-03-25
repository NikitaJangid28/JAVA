import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Learnset {
    public static void main (String args[]) {
        Set<Integer> s = new HashSet<>();
        Set<Integer> t = new TreeSet<>();
        Set <Integer> l = new LinkedHashSet<>();
        s.add(20);
        s.add(30);
        s.add(20);
        s.add(50);
        s.add(60);

        // Set doesn't allow for duplicate values and print random serialization
        System.out.println(s);
        s.add(80);
        System.out.println(s);

        System.out.println(s.isEmpty());
        System.out.println(s.size());


        Set<String> student = new HashSet<>();
        student.add("nikita" , 2);

    }
}