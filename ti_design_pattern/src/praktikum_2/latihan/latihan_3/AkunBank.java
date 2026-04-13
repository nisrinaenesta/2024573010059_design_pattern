package praktikum_2.latihan.latihan_3;

public class AkunBank {
    private double saldo;

    // Constructor
    public AkunBank(double saldo) {
        this.saldo = saldo;
    }

    // Method public untuk menampilkan saldo
    public void tampilkanSaldo() {
        System.out.println("Saldo: " + saldo);
    }

    // Getter
    public double getSaldo() {
        return saldo;
    }
}