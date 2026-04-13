package praktikum_2.latihan.latihan_5;

public class Main {
    public static void main(String[] args) {
        // 3. Membuat object dengan Default Constructor
        Barang barang1 = new Barang();

        // 3. Membuat object dengan Parameterized Constructor
        Barang barang2 = new Barang("Laptop Gaming", 15000000);

        // Menampilkan hasil
        System.out.println("Info Barang 1 (Default):");
        barang1.tampilkanInfo();

        System.out.println("Info Barang 2 (Parameter):");
        barang2.tampilkanInfo();
    }
}
