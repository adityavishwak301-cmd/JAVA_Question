class Theatre {

    int availableSeats = 5;

    synchronized void bookSeats(int seats) {

        System.out.println(Thread.currentThread().getName() + " is trying to book " + seats + " seats.");

        if (seats <= availableSeats) {

            System.out.println(Thread.currentThread().getName() + " is booking " + seats + " seats.");

            availableSeats = availableSeats - seats;

            System.out.println(Thread.currentThread().getName() + " booked successfully.");
            System.out.println("Available seats: " + availableSeats);
        }
        else {

            System.out.println(Thread.currentThread().getName() + " cannot book seats.");
            System.out.println("Not enough seats available.");
        }
    }
}

class Customer extends Thread {

    Theatre theatre;
    int seats;

    Customer(Theatre theatre, int seats, String name) {

        this.theatre = theatre;
        this.seats = seats;
        setName(name);
    }

    public void run() {

        theatre.bookSeats(seats);
    }
}

public class Main {

    public static void main(String[] args) {

        Theatre theatre = new Theatre();

        Customer customer1 = new Customer(theatre, 2, "Customer 1");
        Customer customer2 = new Customer(theatre, 2, "Customer 2");
        Customer customer3 = new Customer(theatre, 2, "Customer 3");

        customer1.start();
        customer2.start();
        customer3.start();
    }
}
