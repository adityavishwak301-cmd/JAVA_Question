import java.util.ArrayList;
import java.util.Scanner;

public class StudentAttendance {
    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        students.add("Aditya");
        students.add("Rahul");
        students.add("Aman");
        students.add("Priya");

        System.out.println("Students Present:");
        for (String student : students) {
            System.out.println(student);
        }

        System.out.print("Enter student name to search: ");
        String name = sc.nextLine();

        if (students.contains(name)) {
            System.out.println(name + " is present.");
        } else {
            System.out.println(name + " is not present.");
        }

        System.out.print("Enter student name to remove: ");
        String removeName = sc.nextLine();

        if (students.remove(removeName)) {
            System.out.println(removeName + " removed.");
        } else {
            System.out.println(removeName + " was not found.");
        }

        System.out.println("Updated Student List:");
        for (String student : students) {
            System.out.println(student);
        }

        System.out.println("Number of students present: " + students.size());

        sc.close();
    }
}
