//untu membaca input dari pengguna
import java.util.Scanner;

// Mmenunjukkan lokasi file dengan nama KonversiSuhu
public class KonversiSuhu {

    // Method utama yang pertama kali jalan
    public static void main(String[] args) {

        //objek Scanner untuk menerima input dari pengguna
        Scanner input = new Scanner(System.in);

        //intruksi untuk pengguna memasukkan suhu Celsius
        System.out.print("Masukkan suhu Celsius: ");
        double celsius = input.nextDouble();

        // Mengonversi suhu Celsius ke Fahrenheit
        double fahrenheit = celsius * 9 / 5 + 32;

        //menampilkan hasil konversi
        System.out.println("Suhu Fahrenheit: " + fahrenheit);

    }
}
