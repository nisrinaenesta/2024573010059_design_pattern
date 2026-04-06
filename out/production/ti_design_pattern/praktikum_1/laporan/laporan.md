# Laporan 1 Review Dasar Pemrograman Java
**Mata Kuliah:** Praktikum Design Pattern  
**Nama:** Nisrina Nadhifah Enesta  
**NIM:** 2024573010059  
**Kelas:** TI 2A

---

## BAB I - PENDAHULUAN

## 1.1 Latar Belakang
Perkembangan teknologi informasi saat ini sangat berkaitan dengan kemampuan dalam bidang pemrograman. Salah satu bahasa pemrograman yang banyak digunakan dalam pengembangan perangkat lunak adalah Java. Java dikenal sebagai bahasa pemrograman yang bersifat multiplatform, sehingga program yang dibuat dapat dijalankan pada berbagai sistem operasi selama terdapat Java Virtual Machine (JVM).

Dalam mempelajari pemrograman, pemahaman terhadap konsep dasar sangat penting. Konsep dasar tersebut meliputi sintaks dasar pemrograman, penggunaan variabel dan tipe data, operator, percabangan, serta perulangan. Konsep-konsep ini merupakan dasar dalam membuat suatu program agar dapat berjalan sesuai dengan logika yang diinginkan.

Oleh karena itu, praktikum ini dilakukan untuk membantu mahasiswa memahami dasar-dasar pemrograman Java secara langsung melalui latihan pembuatan program sederhana. Dengan melakukan praktikum ini, diharapkan mahasiswa dapat memahami bagaimana cara menuliskan program Java dan menerapkan konsep dasar pemrograman dalam menyelesaikan permasalahan sederhana.

## 1.2 Tujuan Praktikum
Tujuan dari praktikum ini adalah:
1. Memahami sintaks dasar pemrograman Java.
2. Mampu membuat program sederhana menggunakan Java.
3. Memahami konsep variabel, tipe data, operator, percabangan, dan perulangan.
4. Mampu menyelesaikan masalah sederhana dengan menerapkan konsep dasar pemrograman Java.

## 1.3 Dasar Teori

### 1. Pengenalan Java dan Lingkungan Pengembangan
Java merupakan bahasa pemrograman berorientasi objek yang dikembangkan oleh Sun Microsystems dan sekarang dimiliki oleh Oracle. Java dirancang agar dapat dijalankan di berbagai platform dengan prinsip *Write Once, Run Anywhere*. Untuk menjalankan program Java diperlukan Java Development Kit (JDK) yang berisi compiler dan Java Runtime Environment (JRE).

### 2. Variabel dan Tipe Data
Variabel merupakan tempat untuk menyimpan data di dalam program. Setiap variabel memiliki tipe data tertentu yang menentukan jenis nilai yang dapat disimpan. Beberapa tipe data dasar dalam Java antara lain `int`, `double`, `char`, `boolean`, dan `String`. Penggunaan tipe data yang tepat sangat penting agar program dapat berjalan dengan benar.

### 3. Operator dan Ekspresi
Operator adalah simbol yang digunakan untuk melakukan operasi terhadap suatu nilai atau variabel. Dalam Java terdapat beberapa jenis operator seperti operator aritmatika (`+`, `-`, `*`, `/`), operator perbandingan (`==`, `!=`, `>`, `<`), serta operator logika (`&&`, `||`, `!`). Operator digunakan dalam ekspresi untuk menghasilkan suatu nilai tertentu.

### 4. Percabangan (If-Else dan Switch-Case)
Percabangan digunakan untuk mengambil keputusan dalam program berdasarkan kondisi tertentu. Struktur percabangan yang sering digunakan dalam Java adalah `if`, `if-else`, dan `switch-case`. Dengan percabangan, program dapat menentukan tindakan yang berbeda sesuai dengan kondisi yang diberikan.

### 5. Perulangan (For, While, Do-While)
Perulangan digunakan untuk menjalankan suatu perintah secara berulang-ulang selama kondisi tertentu terpenuhi. Java menyediakan beberapa jenis perulangan seperti `for`, `while`, dan `do-while`. Struktur ini sangat membantu ketika program perlu melakukan proses yang sama berkali-kali.


## BAB II - PRAKTIKUM
### 2.1 Praktikum 1 - Pengenalan Java dan Lingkungan Pengembangan

* Pastikan JDK dan Intellij IDE Community Edition sudah terinstal. Jika belum, kunjungi url berikut untuk mengunduh JDK Amazon Correto dan Intellij
* Buka IDE dan buat sebuah project baru dengan ketentuan seperti berikut:
``` declarative
*       Name: ti_design_pattern
*       Location: disesuaikan
*       Build system: Intellij
*       JDK: Amazon Correto
*       Hilangkan centang pada bagian add sample code
```
* Buat sebuah package baru di dalam folder src dengan cara klik kanan pada folder src kemudian pilih New -> Package. Beri nama modul_1.
* Buat Sebuah class didalam package modul_1 dengan cara klik kanan dan pilih New -> Java Class. Beri nama HelloWorld
* Isikan kode dibawah ini.

          package praktikum_1;
  
          public class HelloWorld {
          public static void main(String[] args) {
          System.out.println("Hello, World!");}
          }
* Jalankan program dengan menekan tombol segitiga hijau seperti ditunjukkan pada lingkaran biru pada gambar dibawah ini.
* Hasilnya :

![gambar1](./gambar/gambar1.png)


### 2.2 Praktikum 2 - Variabel dan Tipe Data
* Buat sebuah class baru di dalam package modul_1 dan beri nama Variable
* Tuliskan kode berikut:
        
            package praktikum_1;
            
            public class Variable {
            public static void main(String[] args){
            int umur = 20;
            double tinggi = 1.75;
            boolean isMahasiswa = true;
            char jenisKelamin = 'L';
            String nama = "Budi";
    
            System.out.println("Nama :"+ nama);
            System.out.println("Umur :"+ umur);
            System.out.println("Tinggi :"+ tinggi);
            System.out.println("Mahasiswa :"+ isMahasiswa);
            System.out.println("Jenis Kelamin :"+ jenisKelamin);
    
                }
            }

* Jalankan program nya untuk melihat hasil.
* Hasilnya :

  ![gambar2](./gambar/gambar2.png)


* **2.2.1 Latihan**

Buatlah program untuk menampilkan data diri anda yang lengkap dengan attribut seperti berikut:
```declarative
Nama Lengkap, Tempat Lahir, Tanggal Lahir, Golongan Darah, Umur,
Tinggi Badan, Jenis Kelamin, Agama, Pekerjaan.
```
Gunakan tipe data yang tepat untuk setiap variabel.

Penyelesaian : 
* Buatkan sebuah package baru di dalam package praktikum_1 dan beri nama latihan. 
* Kemudian, buat sebuah class dengan nama DataDiri. 
* Isikan kode berikut :
```declarative
package praktikum_1.latihan;

public class DataDiri {
    public static void main(String[] args) {

        String namaLengkap = "Nisrina Nadhifah Enesta";
        String tempatLahir = "Lhoksukon";
        String tanggalLahir = "14 Agustus 2005";
        char golonganDarah = 'O';
        int umur = 20;
        double tinggiBadan = 165;
        String jenisKelamin = "Perempuan";
        String agama = "Islam";
        String pekerjaan = "Mahasiswa";

        System.out.println("===== DATA DIRI =====");
        System.out.println("Nama Lengkap   : " + namaLengkap);
        System.out.println("Tempat Lahir   : " + tempatLahir);
        System.out.println("Tanggal Lahir  : " + tanggalLahir);
        System.out.println("Golongan Darah : " + golonganDarah);
        System.out.println("Umur           : " + umur + " tahun");
        System.out.println("Tinggi Badan   : " + tinggiBadan + " cm");
        System.out.println("Jenis Kelamin  : " + jenisKelamin);
        System.out.println("Agama          : " + agama);
        System.out.println("Pekerjaan      : " + pekerjaan);
    }
}
```
* Jalankan program untuk melihat hasilnya.


### 2.3 Praktikum 3 -  Operator dan Expressi
* Buat sebuah class baru di dalam package modul_1 dan beri nama Operator
* Tuliskan kode berikut:

        package praktikum_1;
        
        public class Operator {
        public static void main (String[] args){
        int a = 10;
        int b = 5;

        System.out.println("a + b  =" + (a + b));
        System.out.println("a > b? =" + (a > b));
        System.out.println("a == b =" + (a == b));
            }
        }

* Jalankan program nya untuk melihat hasil.
* Hasinya :

![gambar3](./gambar/gambar3.png)

* **2.3.1 Latihan**

Buat program untuk menghitung luas persegi panjang (panjang * lebar)

 Penyelesaian :
* Buat sebuah class baru di dalam package latihan dan beri nama LuasPersegiPanjang 
* Tuliskan kode berikut:
```declarative
package praktikum_1.latihan;

public class LuasPersegiPanjang {
public static void main(String[] args) {
double panjang = 20;
double lebar = 5;

double luas = panjang * lebar;

System.out.println("Luas persegi panjang adalah: " + luas);
}
}

```
* Jalankan program nya untuk melihat hasil.

### 2.4 Praktikum 4 -  Percabangan (If-Else dan Switch-Case)
* Buat sebuah class baru di dalam package modul_1 dan beri nama Percabangan
* Tuliskan kode berikut:

        package praktikum_1;
        
        public class Percabangan {
        public static void main(String[]args){
        int nilai = 85;

        if (nilai >= 75) {
            System.out.println("Anda lulus!");
        } else {
            System.out.println("Anda tidak lulus.");
        }
        }
    }

* Jalankan program nya untuk melihat hasil.
* Hasilnya :

  ![gambar4](gambar/gambar4.png)


* **2.4.1 Latihan**

Buat program untuk menentukan apakah suatu bilangan genap atau ganjil.

Penyelesaian :

* Buat sebuah class baru di dalam package latihan dan beri nama CekGenapGanjil
* Tuliskan kode berikut:
```declarative

        package praktikum_1.latihan;
        
        import java.util.Scanner;
        
        public class CekGenapGanjil {
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan sebuah bilangan: ");
        int angka = input.nextInt();

        if (angka % 2 == 0) {
            System.out.println("Bilangan tersebut adalah GENAP");
        } else {
            System.out.println("Bilangan tersebut adalah GANJIL");
        }

        input.close();
            }
        }
```
* Jalankan program nya untuk melihat hasil.

### 2.5 Praktikum 5 - Perulangan (For, While, Do-While)
* Buat sebuah class baru di dalam package modul_1 dan beri nama Perulangan
* Tuliskan kode berikut:
    
    package praktikum_1;
    
    public class Perulangan {
    public static void main(String [] args){
    for(int i = 1;i<= 5; i++) {
    System.out.println("Iterasi ke-" + i);
    }
    }
    }

* Jalankan program nya untuk melihat hasil.
* Hasilnya :
![gambar5](./gambar/gambar5.png)


* **2.5.1 Latihan**
Buat program untuk mencetak bilangan ganjil dari 1 hingga 20. Buat 3 program dengan menggunakan for, while, do-while.

Penyelesaian :

1. Program For
* Buat sebuah class baru di dalam package latihan dan beri nama GanjilFor
* Tuliskan kode berikut:
```declarative
package praktikum_1.latihan;

public class GanjilFor {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}
```
* Jalankan program nya untuk melihat hasil.

2. Program While
* Buat sebuah class baru di dalam package latihan dan beri nama GanjiWhile
* Tuliskan kode berikut:
```declarative
package praktikum_1.latihan;

public class GanjilWhile {
public static void main(String[] args) {
int i = 1;
while (i <= 20) {
if (i % 2 != 0) {
System.out.print(i + " ");
}
i++;
}
}
}
```
* Jalankan program nya untuk melihat hasil.

3. Program Do While
   Buat sebuah class baru di dalam package latihan dan beri nama GanjilDoWhile
* Tuliskan kode berikut:
```declarative
package praktikum_1.latihan;

public class GanjilDoWhile {
    public static void main(String[] args) {
        int i = 1;
        do {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
            i++;
        } while (i <= 20);
    }
}
```
* Jalankan program nya untuk melihat hasil.

### 2.6 Praktikum 6 - Practice Problem dan Solusinya
   Practice Problem:
1. Buat program untuk menghitung faktorial dari suatu bilangan. 
2. Buat program untuk mengecek apakah suatu bilangan adalah bilangan prima.
3. Buat program untuk mencetak pola segitiga menggunakan *.

Solusi
1. Program Faktorial 

* Buat sebuah class baru di dalam package modul_1 
* Beri nama Factorial dan isikan kode berikut. 

        package praktikum_1;
        
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
* Jalankan program nya untuk melihat hasil.
  ![gambar6.1](./gambar/gambar6.1.png)

2. Program Prima

* Buat sebuah class baru di dalam package modul_1 
* Beri nama Prima dan isikan kode berikut. 

        public class Prima {
        public static void main(String[] args) {
        int n = 7;
        boolean isPrima = true;

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                isPrima = false;
                break;
            }
        }

        System.out.println(n + (isPrima ? " adalah bilangan prima." : " bukan bilangan prima."));
            }
        }
* Jalankan program nya untuk melihat hasil.
  ![gambar6.2](./gambar/gambar6.2.png)

3. Program Segitiga

* Buat sebuah class baru di dalam package modul_1.
* Beri nama Segitiga dan isikan kode berikut : 

        package praktikum_1;
        
        public class Segitiga {
        public static void main(String[] args) {
        int tinggi = 5;
        for (int i = 1; i <= tinggi; i++) {
        for (int j=1; j<= i; j++){
        System.out.println("* ");
        }
        System.out.println();
        }
        }
        }
* Jalankan program nya untuk melihat hasil.
  ![gambar6.3](./gambar/gambar6.3.png)


## BAB III - PENUTUP

### 3.1 Kesimpulan

Berdasarkan praktikum yang telah dilakukan, dapat disimpulkan bahwa bahasa pemrograman Java memiliki struktur dasar yang harus dipahami sebelum membuat program yang lebih kompleks. Dalam praktikum ini dipelajari beberapa konsep dasar seperti pengenalan Java, penggunaan variabel dan tipe data, operator, percabangan, serta perulangan.

Melalui praktikum ini, mahasiswa dapat memahami bagaimana cara membuat program sederhana menggunakan Java serta mengetahui bagaimana alur logika program bekerja. Variabel dan tipe data digunakan untuk menyimpan nilai, operator digunakan untuk melakukan operasi terhadap data, percabangan digunakan untuk pengambilan keputusan, dan perulangan digunakan untuk menjalankan proses secara berulang.

Dengan memahami konsep-konsep tersebut, mahasiswa diharapkan dapat mengembangkan kemampuan dasar dalam pemrograman serta mampu menerapkan logika pemrograman untuk menyelesaikan permasalahan sederhana menggunakan bahasa Java.

---

## BAB IV - REFERENSI
* Modul Praktikum 1 by Pak Muhammad Reza Zulman, S.ST., M.Sc.
https://hackmd.io/@mohdrzu/BkBn4sEcyl
* W3Schools. "Java Tutorial". 
https://www.w3schools.com/java/
* Petani Kode. "Belajar Java untuk Pemula". 
https://www.petanikode.com/java-untuk-pemula/
