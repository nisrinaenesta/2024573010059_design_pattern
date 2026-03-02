package modul_1;

import org.w3c.dom.ls.LSOutput;

public class Factorial {
    public static void main(String [] args) {

        int n = 5;
        int hasil = 1;
        for (int i = 1; i <= n; i++) {
            hasil *= i;
        }
        System.out.println("Faktorial dari " +  n  + "adalah" + hasil);
    }

}
