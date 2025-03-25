// Class with private fields and public getter & setter methods
class Student {
    private String name;  // Private variable (data hiding)
    private int age;

    // Getter method for name
    public String getName() {
        return name;
    }

    // Setter method for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter method for age
    public int getAge() {
        return age;
    }

    // Setter method for age (Validating data)
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Age must be positive.");
        }
    }
}

public class Studentage {
    public static void main(String[] args) {
        Student student = new Student();

        // Setting values using setter methods
        student.setName("Nikita");
        student.setAge(25);

        // Getting values using getter methods
        System.out.println("Student Name: " + student.getName());
        System.out.println("Student Age: " + student.getAge());

        // Trying to set an invalid age
        student.setAge(-5); // Will print "Age must be positive."
    }
}
