import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    // List to store products
    private List<Product> products = new ArrayList<>();

    // Method to add a product to the cart
    public void addProduct(Product p) {
        products.add(p);
    }
    // Method to remove a product from the cart

    public void removeProduct(Product p) {
        products.remove(p);
    }

    // Method to display all products in the cart
    public void display() {
        for (Product p : products) {
            p.printProducts();
        }
    }

    // Method to calculate and display the total price of products in the cart
    public double getTotalPrice() {
        double total = 0;
        for (Product p : products) {
            total += p.getPrice();
        }
        System.out.println("The total price is: " + total);

        return total;
    }

    // Method to calculate and display the total weight of physical products in the cart
    public double getTotalWeight() {
        double totalWeight = 0;
        for (Product p : products) {
            if (p instanceof PhysicalProduct) {
                totalWeight += ((PhysicalProduct) p).getWeight();
            }
        }
        System.out.println("The total weight is: " + totalWeight + " kg");
        return totalWeight;
    }
}
