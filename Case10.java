interface Payment {

    void pay();
}

class CreditCard implements Payment {

    public void pay() {
        System.out.println("Payment made using Credit Card.");
    }
}

class UPI implements Payment {

    public void pay() {
        System.out.println("Payment made using UPI.");
    }
}

class NetBanking implements Payment {

    public void pay() {
        System.out.println("Payment made using Net Banking.");
    }
}

public class Main {

    public static void main(String[] args) {

        Payment payment1 = new CreditCard();
        Payment payment2 = new UPI();
        Payment payment3 = new NetBanking();

        payment1.pay();
        payment2.pay();
        payment3.pay();
    }
}
