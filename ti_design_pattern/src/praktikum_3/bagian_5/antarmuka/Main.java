package praktikum_2.bagian_5.antarmuka;

public class Main {
    public static void main(String[] args) {

        Bergerak mobil = new Mobil();
        mobil.bergerak();   // Method dari interface
        mobil.berhenti();   // Method default dari interface

        Bergerak pesawat = new Pesawat();
        pesawat.bergerak();
        pesawat.berhenti();

        Bergerak.info();    // Method static dari interface
    }
}