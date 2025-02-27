// Employee.java
public class Employee {
    private int empId;
    private String name;
    private double salary;
    private String department;

    public Employee(int empId, String name, double salary, String department) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    public int getEmpId() {
        return empId;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "ID: " + empId + " | Name: " + name + " | Salary: $" + salary + " | Dept: " + department;
    }
}
