// throw keyword is udes to throw an exception or error

public class Example3 {
    public static void chechAge(int age){
        if(age <18){
            throw new IllegalArgumentException("Age must be 18 or above");
        }
        System.out.println("Access granted");
    }
    public static void main(String[] args) {
       chechAge(12);
    }
}
