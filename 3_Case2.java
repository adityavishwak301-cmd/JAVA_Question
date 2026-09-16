import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingCart {
    public static void main(String[] args) {

        ArrayList<String> cart = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        cart.add("Laptop");
        cart.add("Mouse");
        cart.add("Keyboard");

        System.out.println("Products in Cart:");
        for (String product : cart) {
            System.out.println(product);
        }

        System.out.print("Enter product to add: ");
        String newProduct = sc.nextLine();
        cart.add(newProduct);

        System.out.println(newProduct + " added to cart.");

        System.out.print("Enter product to check: ");
        String searchProduct = sc.nextLine();

        if (cart.contains(searchProduct)) {
            System.out.println(searchProduct + " is in the cart.");
        } else {
            System.out.println(searchProduct + " is not in the cart.");
        }

        System.out.print("Enter product to remove: ");
        String removeProduct = sc.nextLine();

        if (cart.remove(removeProduct)) {
            System.out.println(removeProduct + " removed from cart.");
        } else {
            System.out.println(removeProduct + " was not found.");
        }

        System.out.println("Final Shopping Cart:");
        for (String product : cart) {
            System.out.println(product);
        }

        sc.close();
    }
}
