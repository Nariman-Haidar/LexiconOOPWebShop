public class Product {
    private String name;
    private double price;
    private int stockQuantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.stockQuantity = quantity;
    }

    // Getter method
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        if (price < 0) {
            this.price = price;
        } else {
            System.out.println("You don't have enough price to add this item");
        }
    }

    public void setStockQuantity(int stockQuantity) {
        if (stockQuantity < 0) {
            this.stockQuantity = stockQuantity;
        } else {
            System.out.println("You don't have enough quantity to add this item");
        }
    }
    // Method to print product details
    public void printProducts() {
        System.out.println("Name of product: " + name + "\n" + "Price:" + price + "\n" + "Quantity: " + stockQuantity);
    }
    // Method to reduce stock quantity
    public void reduceStockQuantity(int quantity) {
        if (quantity < stockQuantity) {
            stockQuantity -= quantity;
        } else {
            System.out.println("You don't have enough quantity to remove this item");
        }
    }

}
