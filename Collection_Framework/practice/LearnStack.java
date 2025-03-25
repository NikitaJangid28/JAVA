import java.util.Stack;

public class LearnStack {
    public static void main(String[] args) {
        Stack<String> name = new Stack();
        name.push("pradeep");
        name.push("nisha");
        name.push("mohit");
        name.push("naman");
        System.out.println(name);

        System.out.println(name.peek());
        System.out.println(name.pop());
        System.out.println(name);
        
    }
}
