import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n📌 Student Management System");
            System.out.println("1️⃣ Add Student");
            System.out.println("2️⃣ View All Students");
            System.out.println("3️⃣ Search Student by Roll Number");
            System.out.println("4️⃣ Sort Students by Name");
            System.out.println("5️⃣ Sort Students by Marks");
            System.out.println("6️⃣ Delete Student");
            System.out.println("7️⃣ Exit");
            System.out.print("👉 Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Roll Number: ");
                    int rollNumber = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter number of subjects: ");
                    int numSubjects = scanner.nextInt();
                    int[] marks = new int[numSubjects];
                    for (int i = 0; i < numSubjects; i++) {
                        System.out.print("Enter marks for subject " + (i + 1) + ": ");
                        marks[i] = scanner.nextInt();
                    }
                    manager.addStudent(rollNumber, name, marks);
                    break;
                case 2:
                    manager.viewStudents();
                    break;
                case 3:
                    System.out.print("Enter Roll Number to Search: ");
                    int searchRoll = scanner.nextInt();
                    manager.searchStudent(searchRoll);
                    break;
                case 4:
                    manager.sortByName();
                    manager.viewStudents();
                    break;
                case 5:
                    manager.sortByMarks();
                    manager.viewStudents();
                    break;
                case 6:
                    System.out.print("Enter Roll Number to Delete: ");
                    int deleteRoll = scanner.nextInt();
                    manager.deleteStudent(deleteRoll);
                    break;
                case 7:
                    System.out.println("🚀 Exiting Program...");
                    scanner.close();
                    return;
                default:
                    System.out.println("❌ Invalid Choice! Try again.");
            }
        }
    }
}
