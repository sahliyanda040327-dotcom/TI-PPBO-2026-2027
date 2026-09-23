import java.util.Scanner;

public class GanjilGenap {
    public static void main(String[] args) {

        // Membuat objek Scanner untuk menerima input dari pengguna
        Scanner input = new Scanner(System.in);

        // Meminta pengguna memasukkan bilangan bulat
        System.out.print("Masukkan sebuah bilangan bulat: ");
        int angka = input.nextInt();

        // Memeriksa apakah bilangan habis dibagi 2
        if (angka % 2 == 0) {
            // Jika sisa bagi 0, bilangan tersebut genap
            System.out.println("Bilangan " + angka + " adalah genap.");
        } else {
            // Jika sisa bagi bukan 0, bilangan tersebut ganjil
            System.out.println("Bilangan " + angka + " adalah ganjil.");
        }

        // Menutup Scanner
        input.close();
    }
}