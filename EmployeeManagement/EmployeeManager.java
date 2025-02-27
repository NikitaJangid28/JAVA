// EmployeeManager.java
import java.util.*;

public class EmployeeManager {
    private List<Employee> employees = new ArrayList<>();

    // Add Employee
    public void addEmployee(int empId, String name, double salary, String department) {
        employees.add(new Employee(empId, name, salary, department));
        System.out.println("✅ Employee added successfully!");
    }

    // Get All Employees
    public List<Employee> getAllEmployees() {
        return employees;
    }

    // Get Employee by ID
    public Employee getEmployeeById(int empId) {
        for (Employee emp : employees) {
            if (emp.getEmpId() == empId) {
                return emp;
            }
        }
        return null;
    }

    // Update Employee Salary
    public void updateSalary(int empId, double newSalary) {
        Employee emp = getEmployeeById(empId);
        if (emp != null) {
            emp.setSalary(newSalary);
            System.out.println(" Salary updated!");
        } else {
            System.out.println(" Employee not found!");
        }
    }

    // Update Employee Department
    public void updateDepartment(int empId, String newDepartment) {
        Employee emp = getEmployeeById(empId);
        if (emp != null) {
            emp.setDepartment(newDepartment);
            System.out.println(" Department updated!");
        } else {
            System.out.println(" Employee not found!");
        }
    }

    // Delete Employee
    public void deleteEmployee(int empId) {
        Employee emp = getEmployeeById(empId);
        if (emp != null) {
            employees.remove(emp);
            System.out.println(" Employee deleted!");
        } else {
            System.out.println(" Employee not found!");
        }
    }

    // Sort by Salary
    public void sortBySalary() {
        employees.sort(Comparator.comparingDouble(Employee::getSalary).reversed());
        System.out.println(" Sorted by salary (high to low).");
    }

    // Sort by Name
    public void sortByName() {
        employees.sort(Comparator.comparing(Employee::getName));
        System.out.println(" Sorted by name (A-Z).");
    }
}
