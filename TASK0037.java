class Employee37 {
    private int pwd;
    protected int salary;
    public int empid;

    // Constructor
    public Employee37() {
        System.out.println("Employee constructor called");
    }

    // Getters and setters for private variables
    public int getPwd() {
        return pwd;
    }

    public void setPwd(int pwd) {
        this.pwd = pwd;
    }
}

class Hr extends Employee37 {
    public Hr() {
        super(); // Calling the superclass constructor
        setPwd(1254); // Accessing private variable through setter
        super.salary = 50000; // Accessing protected variable
        super.empid = 10001; // Accessing public variable
    }
}

public class TASK0037 {
    public static void main(String[] args) {
        Hr hr = new Hr();
        // Accessing variables
        // hr.pwd = 1254; // Error: pwd is private
        hr.setPwd(1254); // Accessing private variable through setter
        hr.salary = 50000; // Accessing protected variable
        hr.empid = 10001; // Accessing public variable

        System.out.println("Password: " + hr.getPwd());
        System.out.println("Salary: " + hr.salary);
        System.out.println("Employee ID: " + hr.empid);
    }
}
