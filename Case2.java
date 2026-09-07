import java.util.Scanner;

class BankAccount{ 
    int accountnumber;
    String accountholder;
    double balance;

    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Amount deposited: " + amount);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Amount withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    void displayBalance() {
        System.out.println("\nAccount Number: " + accountnumber);
        System.out.println("Account Holder: " + accountholder);
        System.out.println("Balance: " + balance);
    }
}

public class case2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount b = new BankAccount();

        System.out.print("Enter account number: ");
        b.accountnumber = sc.nextInt();
        sc.nextLine(); 

        System.out.print("Enter account holder name: ");
        b.accountholder = sc.nextLine();

        System.out.print("Enter initial balance: ");
        b.balance = sc.nextDouble();
        b.displayBalance();

        System.out.print("\nEnter amount to deposit: ");
        double depositAmount = sc.nextDouble();
        b.deposit(depositAmount);

        System.out.print("Enter amount to withdraw: ");
        double withdrawAmount = sc.nextDouble();
        b.withdraw(withdrawAmount);

        b.displayBalance();
        sc.close();
    }
    
}
