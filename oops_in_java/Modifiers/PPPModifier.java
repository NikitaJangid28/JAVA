
class Parent{

    public String fname="john"; // public is accessible to anywhere
    private String fnameprivate="yash"; // private is accessible only in this class
    protected String fnameprotected="deepak"; // protected is accessible in this class and its subclasses
    String defaultvar="Default variable"; // default is accessible in this class and its subclasses

    public void myPublicMethod(){ // public is accessible to anywhere
        System.out.println("I am a public method");
    }

    private void myPrivateMethod(){
        System.out.println("I am a private method");
    }

    protected  void myProtectedMethod(){
        System.out.println("I am a protected method");
    }

    void mydefaultmethod(){
        System.out.println("I am a default method");
    }
}

public class PPPModifier {
    public static void main(String[] args) {
        Parent obj = new Parent();
        obj.myPublicMethod();
       // obj.myPrivateMethod();
       obj.myProtectedMethod();
       obj.mydefaultmethod();
    }
}
