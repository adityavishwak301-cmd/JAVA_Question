class Product {

    int productId;
    String productName;
    double price;
    int quantity;

    double calculateCost() {

        double cost = price * quantity;

        return cost;
    }

    void displayProduct() {

        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + productName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Product Cost: " + calculateCost());
    }
}


public class Main {

    public static void main(String[] args) {

        Product product1 = new Product();

        product1.productId = 101;
        product1.productName = "Laptop";
        product1.price = 4000;
        product1.quantity = 1;


        Product product2 = new Product();

        product2.productId = 102;
        product2.productName = "Mouse";
        product2.price = 500;
        product2.quantity = 2;

      
        Product product3 = new Product();

        product3.productId = 103;
        product3.productName = "Keyboard";
        product3.price = 1000;
        product3.quantity = 1;


        double cost1 = product1.calculateCost();
        double cost2 = product2.calculateCost();
        double cost3 = product3.calculateCost();


        double totalBill = cost1 + cost2 + cost3;


        double discount = 0;

        if (totalBill > 5000) {

            discount = totalBill * 10 / 100;
        }


        double finalBill = totalBill - discount;


        System.out.println("----- PRODUCT 1 -----");
        product1.displayProduct();

        System.out.println();

        System.out.println("----- PRODUCT 2 -----");
        product2.displayProduct();

        System.out.println();

        System.out.println("----- PRODUCT 3 -----");
        product3.displayProduct();


        System.out.println();
        System.out.println("----- BILL DETAILS -----");

        System.out.println("Total Bill: " + totalBill);
        System.out.println("Discount: " + discount);
        System.out.println("Final Bill: " + finalBill);
    }
}
