package praktikum_4.bagian_2.latihan.latihan_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nama produk: ");
        String product = scanner.nextLine();

        System.out.print("Masukkan jumlah: ");
        int quantity = scanner.nextInt();

        System.out.print("Masukkan harga satuan: ");
        double price = scanner.nextDouble();

        // Inisialisasi objek sesuai tanggung jawabnya
        Order order = new Order(product, quantity, price);
        OrderRepository repository = new OrderRepository();
        OrderPrinter printer = new OrderPrinter();

        // Eksekusi tugas
        repository.saveToFile(order);
        printer.printReceipt(order);
    }
}
