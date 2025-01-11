public class Main {
    public static void main(String[] args) {
        // Create instances of Product
        Product product1 = new Product("Apple", 10, 1);
        Product product2 = new Product("Orange", 5, 2);
        Product product3 = new Product("Banana", 7, 21);
        //product1.printProducts();
        //product2.printProducts();
        //product3.printProducts();
// Create a shopping cart and add products to it
        ShoppingCart cart = new ShoppingCart();
        cart.addProduct(product1);
        //cart.addProduct(product2);
        //cart.addProduct(product3);
        //cart.display();
        cart.getTotalPrice();
        //cart.removeProduct(product1);
        //cart.display();
        //cart.getTotalPrice();

// Create instances of DigitalProduct and PhysicalProduct

        DigitalProduct digitalProduct1 = new DigitalProduct("Apple", 10, 1);
        //PhysicalProduct physicalProduct1 = new PhysicalProduct("Orange", 5,2);

        digitalProduct1.getDownloadLink();
        //physicalProduct1.getPrice();
        digitalProduct1.printProducts();
        //physicalProduct1.printProducts();
        cart.getTotalWeight();


    }
}