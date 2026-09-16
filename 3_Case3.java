import java.util.ArrayList;

public class EmployeeSalary {
    public static void main(String[] args) {

        ArrayList<Integer> salaries = new ArrayList<>();

        salaries.add(30000);
        salaries.add(45000);
        salaries.add(50000);
        salaries.add(35000);
        salaries.add(60000);

        System.out.println("Employee Salaries:");

        for (int salary : salaries) {
            System.out.println(salary);
        }

        int highest = salaries.get(0);
        int total = 0;

        for (int salary : salaries) {

            if (salary > highest) {
                highest = salary;
            }

            total = total + salary;
        }

        double average = (double) total / salaries.size();

        System.out.println("Highest Salary: " + highest);
        System.out.println("Total Salary: " + total);
        System.out.println("Average Salary: " + average);
    }
}
