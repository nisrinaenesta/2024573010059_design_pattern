package praktikum_4.bagian_2.latihan.latihan_2;

public class Order {
    private String product;
    private int quantity;
    private double price;

    public Order(String product, int quantity, double price) {
        this.product = product;
        this.quantity = quantity;
        this.price = price;
    }

    public double calculateTotal() {
        return quantity * price;
    }

    // Getter untuk digunakan oleh kelas lain
    public String getProduct() { return product; }
    public int getQuantity() { return quantity; }
    public double getPrice() { return price; }
}