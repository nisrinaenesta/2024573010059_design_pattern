package praktikum_2.latihan.latihan_2;

public class Main {
    public static void main(String[] args) {
        // Membuat object
        Lingkaran lingkaran1 = new Lingkaran(7);

        // Memanggil method hitungLuas()
        double luas = lingkaran1.hitungLuas();

        // Menampilkan hasil
        System.out.println("Luas Lingkaran: " + luas);
    }
}
