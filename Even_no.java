# JAVA_Question
import java.util.ArrayList;

public class EvenNumbers{
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(15);
        numbers.add(22);
        numbers.add(7);
        numbers.add(8);
        numbers.add(13);
        numbers.add(30);

        System.out.println("Even numbers:");

        for (int num : numbers) {
            if (num % 2 == 0) {
                System.out.println(num);
            }
        }
    }
}
