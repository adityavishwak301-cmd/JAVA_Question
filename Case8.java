class Employee {

    String name;
    double salary;

    void displayEmployee() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

class Manager extends Employee {

    double bonus;

    void displayManager() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Bonus: " + bonus);
        System.out.println("Total Salary: " + (salary + bonus));
    }
}

public class Main {

    public static void main(String[] args) {

        Employee employee = new Employee();

        employee.name = "Rahul";
        employee.salary = 30000;

        System.out.println("Employee Details");
        employee.displayEmployee();

        System.out.println();

        Manager manager = new Manager();

        manager.name = "Aditya";
        manager.salary = 50000;
        manager.bonus = 10000;

        System.out.println("Manager Details");
        manager.displayManager();
    }
}
