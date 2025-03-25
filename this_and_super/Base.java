
class Parent {
    //instance variable
    int a= 10;
    // static variable
    static int b =20;

}

public class Base  extends Parent{
    void rr(){
        super.a=700;
        System.out.println(super.a);
        Parent.b=100;
        System.out.println(Parent.b);
    }
    public static void main(String[] args) {
        //super.a=700;
        //super.b=100;
        new Base().rr();
    }
}
