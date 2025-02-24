package oops_in_java;


public class First {
    final int x = 5; // final keyword is used to finalize the variable value 
    String s = "Hello";
    double y=1.2; //instance variable
    public static void main(String[] args) {
        First obj = new First();
        First obj1 = new First();
        Second sobj= new Second();
        obj.y =5.4;
        obj.x = 10;
        System.out.println(obj.y);
        System.out.println(sobj.a);
        System.out.println(obj.x);
        System.out.println(obj1.s);
    }
}
