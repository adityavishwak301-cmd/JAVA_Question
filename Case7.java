import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int correctPin = 1234;
        int attempts = 0;
        int enteredPin;

        double balance = 5000;
        boolean pinCorrect = false;

        while (attempts < 3) {

            System.out.print("Enter PIN: ");
            enteredPin = sc.nextInt();

            if (enteredPin == correctPin) {
                pinCorrect = true;
                break;
            }
            else {
                attempts++;
                System.out.println("Incorrect PIN.");

                if (attempts == 3) {
                    System.out.println("Maximum incorrect attempts reached.");
                }
            }
        }

        if (pinCorrect == true) {

            System.out.println("PIN verified successfully.");

            System.out.println("1. Withdraw");
            System.out.println("2. Deposit");
            System.out.println("3. Display Balance");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            if (choice == 1) {

                System.out.print("Enter withdrawal amount: ");
                double amount = sc.nextDouble();

                if (amount <= balance) {
                    balance = balance - amount;
                    System.out.println("Withdrawal successful.");
                    System.out.println("Remaining Balance: " + balance);
                }
                else {
                    System.out.println("Insufficient balance.");
                }
            }

            else if (choice == 2) {

                System.out.print("Enter deposit amount: ");
                double amount = sc.nextDouble();

                balance = balance + amount;

                System.out.println("Deposit successful.");
                System.out.println("Updated Balance: " + balance);
            }

            else if (choice == 3) {

                System.out.println("Current Balance: " + balance);
            }

            else {

                System.out.println("Invalid choice.");
            }
        }

        sc.close();
    }
}
