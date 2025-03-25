import java.util.Stack;

public class LearnStack {
    public static void main(String[] args) {
        // Stack is Last in First out (LIFO)
        Stack<String> animals= new Stack();

        animals.push("lion");
        animals.push("Dog");
        animals.push("Cat");
        animals.push("Monkey");

        System.out.println("Stack" +animals);

        System.out.println(animals.peek()); // to check the last element in the stack

        animals.pop(); // remove or delete the last element from the satck
        System.out.println("Stack :" +animals);

        System.out.println(animals.peek());

    }
}
