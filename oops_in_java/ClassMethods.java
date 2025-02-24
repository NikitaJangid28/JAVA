package oops_in_java;

public class ClassMethods {
    // static method can be accessed without creating an object
    static void myMethod(){
        System.out.println("I am a static method");
    }
    //public method  - it can not be accessed without creating an object of a class
    public void myPublicMethod(){
        System.out.println("I am a public method");
    }
    public static void main(String[] args) {
        myMethod();
        //myPublicMethod(); can not be accessed directly
        ClassMethods obj = new ClassMethods();
        obj.myPublicMethod();
    }
}
