//Constructor : Member Function. it create memory block for the variable automatically.

class Demo {
    int a=10;
    Demo(){
        System.out.println("Value of a " +a);
    }
}
public class Constr {
    public static void main(String[] args) {
        Demo d1 = new Demo();
    }
}

// Constructor are of 2 Types
// 1. default Constructor - no parameter 
// 2. Parameterized Constructor - it has multiple parameters

