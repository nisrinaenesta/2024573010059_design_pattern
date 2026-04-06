package praktikum_2.bagian_2.latihan_2;

public class Main {
    public static void main(String[] args) {
        Motor motor1 = new Motor("Honda", 2022);

        System.out.println("Merk: " + motor1.getMerk());
        System.out.println("Tahun: " + motor1.getTahun());

        // Mengubah nilai menggunakan setter
        motor1.setMerk("Yamaha");
        motor1.setTahun(2024);

        System.out.println("Merk baru: " + motor1.getMerk());
        System.out.println("Tahun baru: " + motor1.getTahun());
    }
}