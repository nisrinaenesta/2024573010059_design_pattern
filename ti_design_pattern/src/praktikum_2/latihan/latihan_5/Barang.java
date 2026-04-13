package praktikum_2.latihan.latihan_5;

public class Barang {
    private String namaBarang;
    private double harga;

    // 2. Default Constructor
    public Barang() {
        this.namaBarang = "Barang Baru";
        this.harga = 0.0;
    }

    // 2. Parameterized Constructor
    public Barang(String namaBarang, double harga) {
        this.namaBarang = namaBarang;
        this.harga = harga;
    }

    // Method untuk menampilkan info barang
    public void tampilkanInfo() {
        System.out.println("Nama Barang : " + namaBarang);
        System.out.println("Harga       : Rp" + harga);
        System.out.println("---------------------------");
    }
}