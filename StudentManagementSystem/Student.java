public class Student {
    private int rollNumber;
    private String name;
    private int[] marks;

    public Student(int rollNumber, String name, int[] marks) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.marks = marks;
    }

    public int getRollNumber() { return rollNumber; }
    public String getName() { return name; }
    public int[] getMarks() { return marks; }

    public int getTotalMarks() {
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        return sum;
    }

    public double getAverageMarks() {
        return (double) getTotalMarks() / marks.length;
    }

    public String getGrade() {
        double avg = getAverageMarks();
        if (avg >= 90) return "A+";
        else if (avg >= 80) return "A";
        else if (avg >= 70) return "B";
        else if (avg >= 60) return "C";
        else return "F";
    }

    public void displayStudent() {
        System.out.println("Roll No: " + rollNumber + ", Name: " + name +
                ", Total: " + getTotalMarks() + ", Average: " + getAverageMarks() +
                ", Grade: " + getGrade());
    }
}
