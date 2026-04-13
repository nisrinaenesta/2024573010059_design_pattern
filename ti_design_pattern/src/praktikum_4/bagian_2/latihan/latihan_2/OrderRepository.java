package praktikum_4.bagian_2.latihan.latihan_2;

import java.io.FileWriter;
import java.io.IOException;

public class OrderRepository {
    public void saveToFile(Order order) {
        try (FileWriter writer = new FileWriter("orders.txt", true)) {
            writer.write(order.getProduct() + " - " + order.getQuantity() +
                    " - Rp" + order.calculateTotal() + "\n");
            System.out.println("Pesanan telah disimpan!");
        } catch (IOException e) {
            System.out.println("Gagal menyimpan pesanan: " + e.getMessage());
        }
    }
}