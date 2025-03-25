//The super keyword is used to refer to the parent class members (variables, methods, or constructors).
//It helps in calling the superclass's constructor and methods.


class Animal {
    String name = "Animal";
    
    void sound() {
        System.out.println("Animals make sounds");
    }
}

class Dog extends Animal {
    String name = "Dog";
    
    void display() {
        System.out.println("Child name: " + name);
        System.out.println("Parent name using super: " + super.name);
        super.sound();  // Calling parent class method
    }
    
    public static void main(String[] args) {
        Dog d = new Dog();
        d.display();
    }
}
