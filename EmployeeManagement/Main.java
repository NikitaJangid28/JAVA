// Main.java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        EmployeeManager manager = new EmployeeManager();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== Employee Management System ===");
            System.out.println("1. Add Employee");
            System.out.println("2. View Employees");
            System.out.println("3. Search Employee by ID");
            System.out.println("4. Update Salary");
            System.out.println("5. Update Department");
            System.out.println("6. Delete Employee");
            System.out.println("7. Sort by Salary");
            System.out.println("8. Sort by Name");
            System.out.println("9. Exit");
            System.out.print("Choose an option: ");

            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter Emp ID: ");
                    int empId = sc.nextInt();
                    sc.nextLine(); // Consume newline
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Salary: ");
                    double salary = sc.nextDouble();
                    sc.nextLine(); // Consume newline
                    System.out.print("Enter Department: ");
                    String department = sc.nextLine();
                    manager.addEmployee(empId, name, salary, department);
                    break;

                case 2:
                    System.out.println("\n--- Employee List ---");
                    for (Employee emp : manager.getAllEmployees()) {
                        System.out.println(emp);
                    }
                    break;

                case 3:
                    System.out.print("Enter Emp ID to search: ");
                    int searchId = sc.nextInt();
                    Employee emp = manager.getEmployeeById(searchId);
                    if (emp != null) {
                        System.out.println("Found: " + emp);
                    } else {
                        System.out.println(" Employee not found!");
                    }
                    break;

                case 4:
                    System.out.print("Enter Emp ID to update salary: ");
                    int updateId = sc.nextInt();
                    System.out.print("Enter new Salary: ");
                    double newSalary = sc.nextDouble();
                    manager.updateSalary(updateId, newSalary);
                    break;

                case 5:
                    System.out.print("Enter Emp ID to update department: ");
                    int updateDeptId = sc.nextInt();
                    sc.nextLine(); // Consume newline
                    System.out.print("Enter new Department: ");
                    String newDepartment = sc.nextLine();
                    manager.updateDepartment(updateDeptId, newDepartment);
                    break;

                case 6:
                    System.out.print("Enter Emp ID to delete: ");
                    int deleteId = sc.nextInt();
                    manager.deleteEmployee(deleteId);
                    break;

                case 7:
                    manager.sortBySalary();
                    break;

                case 8:
                    manager.sortByName();
                    break;

                case 9:
                    System.out.println("Exiting... 🚀");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println(" Invalid choice! Try again.");
            }
        }
    }
}
