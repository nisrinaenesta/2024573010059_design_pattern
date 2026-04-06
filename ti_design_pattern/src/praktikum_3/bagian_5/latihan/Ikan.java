package praktikum_3.bagian_5.latihan;

class Ikan extends HewanAir implements Berenang {

    Ikan(String nama) {
        super(nama);
    }

    @Override
    void makan() {
        System.out.println(nama + " sedang makan.");
    }

    @Override
    public void berenang() {
        System.out.println(nama + " sedang berenang.");
    }
}
