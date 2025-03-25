//The this keyword in Java is used to refer to the current instance of the class. It helps to differentiate 
//between instance variables and method parameters when they have the same name.

class Thisk 
{
    String name;
    // Constructor
    Thisk(String name){
        this.name=name;
    }
    
    void display(){
        System.out.println("Student Name : " +this.name);
    }

    public static void main(String[] args) {
        Thisk s= new Thisk("Aashika");
        s.display();
    }
}