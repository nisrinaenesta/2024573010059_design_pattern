package praktikum_2.latihan.latihan_2;

public class Lingkaran {
    double jariJari;

    // Constructor
    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }

    // Method untuk menghitung luas
    public double hitungLuas() {
        return Math.PI * jariJari * jariJari;
    }
}
