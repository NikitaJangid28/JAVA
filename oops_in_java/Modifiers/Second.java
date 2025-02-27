// Main class
abstract  class Abstractm {
    public String fname="john";
    public int age = 24;
    public abstract void study(); // Abstract Method
}
//Subclass
class Student extends Abstractm{
    public int gradYear =2019;
    public void study(){
        System.out.println("Studying all day long");
    }
}

class Second{
    public static void main(String[] args) {
        Student s =new Student();
        System.out.println("Name: " +s.fname);
        System.out.println("Age : "+s.age);
        System.out.println("Graduation Year : " +s.gradYear);
        s.study();// call abstract method
    }
}

