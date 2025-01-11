public class DigitalProduct extends Product {
    private String downloadLink;

    public DigitalProduct(String name, double price, int quantity) {
        super(name, price, quantity);
        this.downloadLink = downloadLink;
    }
    // Getter method for download link
    public String getDownloadLink() {
        return downloadLink;
    }
    // Override printProducts method to include download link
    @Override
    public void printProducts(){
        System.out.println("Download Link: " + downloadLink);
    }
}
