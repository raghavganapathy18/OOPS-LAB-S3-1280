import java.util.Scanner;

class InvalidEmpidException extends Exception {
    public InvalidEmpidException(String message) {
        super(message);
    }
}

class InvalidNameException extends Exception {
    public InvalidNameException(String message) {
        super(message);
    }
}

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

class Employee {
    int empid;
    String name;
    int age;

    public Employee(int empid, String name, int age) {
        this.empid = empid;
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("Employee Created Successfully:");
        System.out.println("EmpID: " + empid);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class EmployeeMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter Employee ID: ");
            int empid = sc.nextInt();
            sc.nextLine();
            if (empid < 1000) {
                throw new InvalidEmpidException("Employee ID must be at least 4 digits.");
            }

            System.out.print("Enter Name: ");
            String name = sc.nextLine();
            if (name.matches("\\d+")) {
                throw new InvalidNameException("Name cannot be a number.");
            }

            System.out.print("Enter Age: ");
            int age = sc.nextInt();
            if (age > 50) {
                throw new InvalidAgeException("Age cannot be greater than 50.");
            }

            Employee emp = new Employee(empid, name, age);
            emp.display();

        } catch (InvalidEmpidException | InvalidNameException | InvalidAgeException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}


// Name: Raghav Ganapathy R V
// URK24CS1280
// Ex : 7
// Question 1