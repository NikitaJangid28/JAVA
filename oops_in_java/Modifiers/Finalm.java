// Final Keyword is a non-access Modifier
public class Finalm {
    final int x= 10;
    final double pi=3.14;

    public static void main(String[] args) {
        Finalm f= new Finalm();
        f.x=5; // it will generate error because the variable is declared as final
        System.out.println("f.x");
    }
}
