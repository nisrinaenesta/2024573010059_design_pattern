package praktikum_2.bagian_2.latihan_2;

public class Motor {
    // Atribut (dienkapsulasi)
    private String merk;
    private int tahun;

    // Constructor
    public Motor(String merk, int tahun) {
        this.merk = merk;
        this.tahun = tahun;
    }

    // Getter untuk merk
    public String getMerk() {
        return merk;
    }

    // Setter untuk merk
    public void setMerk(String merk) {
        this.merk = merk;
    }

    // Getter untuk tahun
    public int getTahun() {
        return tahun;
    }

    // Setter untuk tahun
    public void setTahun(int tahun) {
        this.tahun = tahun;
    }
}
