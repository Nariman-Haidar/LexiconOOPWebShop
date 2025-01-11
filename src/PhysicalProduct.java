public class PhysicalProduct extends Product {
    private double weight;

    public PhysicalProduct(String name, double price, int quantity) {
        super(name, price, quantity);
        this.weight = weight;
    }
    // Getter method for weight
    public double getWeight() {
        return weight;
    }
    // Override printProducts method to include weight
    @Override
    public void printProducts(){
        System.out.println("Weight : " + weight + "\n");
    }
}
