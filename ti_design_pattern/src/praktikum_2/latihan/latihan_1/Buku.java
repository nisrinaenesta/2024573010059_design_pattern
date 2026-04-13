package praktikum_2.latihan.latihan_1;

public class Buku {
    String judul;
    String pengarang;

    // Constructor
    public Buku(String judul, String pengarang) {
        this.judul = judul;
        this.pengarang = pengarang;
    }

    // Method untuk menampilkan data
    public void tampilkanInfo() {
        System.out.println("Judul Buku   : " + judul);
        System.out.println("Pengarang    : " + pengarang);
    }
}
