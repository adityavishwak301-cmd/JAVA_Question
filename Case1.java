import java.util.Scanner;

class Student {
    String name;
    int marks1,marks2,marks3,marks4,marks5;

    int total(){
        return marks1+marks2+marks3+marks4+marks5;
    }
    
    double percentage(){
        return total()/5.0;
    }

    String grade(){
        double p=percentage();
        
        if(p>=90){
            return "A+";
        }
        else if(p>=80){
            return "A";
        }
        else if(p>=70){
            return "B";
        }
        else if(p>=60){
            return "C";
        }
        else if(p>=50){
            return "D";
        }
        else{
            return "F";
        }
    }

    void result(){
        if (percentage() >= 50) {
            System.out.println("Result: PASS");
        } else {
            System.out.println("Result:FAIL");
        }

    }
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Grade: " + grade());
        result();
    }
}

public class case1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s = new Student();

        System.out.print("Enter student name: ");
        s.name = sc.nextLine();

        System.out.print("Enter 5 subject marks :");
        s.marks1 = sc.nextInt();
        s.marks2 = sc.nextInt();
        s.marks3 = sc.nextInt();
        s.marks4 = sc.nextInt();
        s.marks5 = sc.nextInt();

        s.display();
        sc.close();
    }
}
