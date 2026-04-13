package praktikum_2.latihan.latihan_3;

public class Main {
    public static void main(String[] args) {
        AkunBank akun = new AkunBank(1000000);

        // Memanggil method
        akun.tampilkanSaldo();

        // Akses lewat getter (benar)
        System.out.println("Saldo: " + akun.getSaldo());
    }
}