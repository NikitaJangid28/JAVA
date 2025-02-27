
public class Staticm {
    static void mystaticMethod(){
        System.out.println("Static Method");
    }
    public void mypublicMethod(){
        System.out.println("Public Method");
    }

    public static void main(String[] args) {
        mystaticMethod(); // This method is called directly because it is declared as static

        //mypublicMethod();  This will give the error because this is declared as public so we can not access this method directly

        Staticm s = new Staticm();
        s.mypublicMethod();
    }
}
