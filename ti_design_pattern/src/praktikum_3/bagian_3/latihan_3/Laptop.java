package praktikum_3.bagian_3.latihan_3;

class Laptop {
    private Processor processor;
    private RAM ram;

    // Constructor (composition)
    Laptop() {
        processor = new Processor();
        ram = new RAM();
    }

    void nyalakanLaptop() {
        System.out.println("Laptop dinyalakan...");
        processor.jalankan();
        ram.baca();
        ram.tulis();
    }
}