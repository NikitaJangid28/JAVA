// StudentManager.java
import java.util.*;

public class StudentManager {
    private List<Student> students = new ArrayList<>();

    public void addStudent(int rollNumber, String name, int[] marks) {
        students.add(new Student(rollNumber, name, marks));
        System.out.println("✅ Student added successfully!");
    }

    public void viewStudents() {
        if (students.isEmpty()) {
            System.out.println("❌ No students found.");
            return;
        }
        for (Student student : students) {
            student.displayStudent();
        }
    }

    public void searchStudent(int rollNumber) {
        for (Student student : students) {
            if (student.getRollNumber() == rollNumber) {
                student.displayStudent();
                return;
            }
        }
        System.out.println("❌ Student not found!");
    }

    public void sortByName() {
        students.sort(Comparator.comparing(Student::getName));
        System.out.println("✅ Students sorted by name.");
    }

    public void sortByMarks() {
        students.sort(Comparator.comparingInt(Student::getTotalMarks).reversed());
        System.out.println("✅ Students sorted by marks.");
    }

    public void deleteStudent(int rollNumber) {
        students.removeIf(student -> student.getRollNumber() == rollNumber);
        System.out.println("✅ Student deleted successfully.");
    }
}

