class Student {

    String[] courses = new String[5];
    int courseCount = 0;

    void registerCourse(String courseName) {

        if (courseCount < 5) {

            courses[courseCount] = courseName;
            courseCount++;

            System.out.println(courseName + " registered successfully.");
        }
        else {

            System.out.println("You cannot register for more than 5 courses.");
        }
    }

    void displayCourses() {

        System.out.println("Registered Courses:");

        for (int i = 0; i < courseCount; i++) {

            System.out.println(courses[i]);
        }
    }
}

public class Main {

    public static void main(String[] args) {

        Student student = new Student();

        student.registerCourse("Java");
        student.registerCourse("Python");
        student.registerCourse("Data Structures");
        student.registerCourse("Database");
        student.registerCourse("Web Development");

        student.registerCourse("Computer Networks");

        System.out.println();

        student.displayCourses();
    }
}
