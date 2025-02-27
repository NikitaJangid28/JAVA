
public class CopyConstr {
    String Name;
    int age ;

    //constructor
    CopyConstr( String n, int a) {
        this.Name = n;
        this.age = a;
    }
    // copy constructor
    CopyConstr( CopyConstr c) {
        this.Name = c.Name;
        this.age = c.age;
    }
    void  display(){
        System.out.println("Name: " +Name+ ",Age : " +age);
    }
    public static void main(String[] args) {
        CopyConstr C1 = new CopyConstr("Ishaan", 23);
        CopyConstr C2 = new CopyConstr(C1);

        C1.display();
        C2.display();
    }
}
