// untuk membaca input dari pengguna
import java.util.Scanner;

// Mmenunjukkan lokasi file dengan namaOperasiBilangan
public class OperasiBilangan {
    // Method utama yang pertama kali dijalankan
    public static void main(String[] args) {

        //objek untuk menerima input
        Scanner input = new Scanner(System.in);

        //intruksi memasukkan bilangan pertama
        System.out.print("Masukkan bilangan pertama: ");

        // Menerima input bilangan pertama
        int angka1 = input.nextInt();

        // intruksi memasukkan bilangan kedua
        System.out.print("Masukkan bilangan kedua: ");

        // Menerima input bilangan kedua
        int angka2 = input.nextInt();

        // Menampilkan judul OP aritmatika
        System.out.println("\nHasil operator aritmatika:");

        // Menghitung dan menampilkan hasil penjumlahan
        System.out.println("Penjumlahan: " + (angka1 + angka2));

        // Menghitung dan menampilkan hasil pengurangan
        System.out.println("Pengurangan: " + (angka1 - angka2));

        // Menghitung dan menampilkan hasil perkalian
        System.out.println("Perkalian: " + (angka1 * angka2));

        // Memeriksa apakah bilangan kedua != nol
        if (angka2 != 0) {

            // Menghitung dan menampilkan hasil pembagian
            System.out.println("Pembagian: " + (angka1 / angka2));

            // Menghitung dan menampilkan sisa hasil bagi
            System.out.println("Sisa bagi: " + (angka1 % angka2));

        } else {

            // Menampilkan pesan jika pembagian dengan nol
            System.out.println("Pembagian tidak dapat dilakukan karena pembagi nol.");

            // Menampilkan pesan sisa bagi tidak dapat dihitung
            System.out.println("Sisa bagi tidak dapat dihitung karena pembagi nol.");
        }

        // Menampilkan judul hasil OP perbandingan
        System.out.println("\nHasil operator perbandingan:");

        // Membandingkan apakah angka pertama lebih besar
        System.out.println("Angka pertama > angka kedua: " + (angka1 > angka2));

        // Membandingkan apakah angka pertama lebih kecil
        System.out.println("Angka pertama < angka kedua: " + (angka1 < angka2));

        // Membandingkan kedua bilangan apa nilainya sama
        System.out.println("Angka pertama == angka kedua: " + (angka1 == angka2));

        // Menutup objek Scanner
        input.close();
    }
}
