class BankAccount {

    int balance = 10000;

    synchronized void withdraw(int amount) {

        System.out.println(Thread.currentThread().getName() + " is trying to withdraw ₹" + amount);

        if (amount <= balance) {

            System.out.println(Thread.currentThread().getName() + " is withdrawing ₹" + amount);

            balance = balance - amount;

            System.out.println(Thread.currentThread().getName() + " completed withdrawal.");
            System.out.println("Remaining Balance: ₹" + balance);
        }
        else {

            System.out.println(Thread.currentThread().getName() + " cannot withdraw. Insufficient balance.");
        }
    }
}

class Customer extends Thread {

    BankAccount account;
    int amount;

    Customer(BankAccount account, int amount, String name) {

        this.account = account;
        this.amount = amount;
        setName(name);
    }

    public void run() {

        account.withdraw(amount);
    }
}

public class Main {

    public static void main(String[] args) {

        BankAccount account = new BankAccount();

        Customer customer1 = new Customer(account, 6000, "Customer 1");
        Customer customer2 = new Customer(account, 5000, "Customer 2");

        customer1.start();
        customer2.start();
    }
}
