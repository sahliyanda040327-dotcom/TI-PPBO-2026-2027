import java.util.Arrays;
import java.util.Scanner;

public class TotaldanRataRata {
 // Menjumlahkan seluruh elemen array
    static int hitungTotal(int[] data) {
        int total = 0;                  // variabel untuk hasil penjumlahan
        for (int nilai : data) {
            total += nilai;             // tambahkan elemen ke total
        }
        return total;                   // kembalikan hasil akhir
    }

    // Mengembalikan array dengan elemen nilainya di atas rata-rata
    static int[] filterDiAtasRataRata(int[] data) {
        // (double) agar pembagian tidak dibulatkan ke bilangan bulat
        double rataRata = (double) hitungTotal(data) / data.length;

        int[] hasil = new int[data.length];   // sementara ukuran array asli
        int jumlah = 0;                       // hitung elemen yang di atas rata-rata

        for (int nilai : data) {
            if (nilai > rataRata) {           // ambil yang di atas rata-rata
                hasil[jumlah++] = nilai;      // simpan di variabel 'jumlah', true naik 1
            }
        }

        // Potong array sesuai jumlah elemen yang terisi
        return Arrays.copyOf(hasil, jumlah);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);   // untuk membaca input

        System.out.print("Masukkan jumlah nilai ujian: ");
        int n = input.nextInt();                  // banyak nilai yang diinput

        int[] nilai = new int[n];                 // array untuk menyimpan nilai ujian
        for (int i = 0; i < n; i++) {
            System.out.print("Nilai ke-" + (i + 1) + ": ");
            nilai[i] = input.nextInt();           // baca nilai trus simpan ke array
        }

        System.out.println("Total nilai       : " + hitungTotal(nilai));
        // Arrays.toString() mengubah array menjadi teks agar bisa dicetak, misal [85, 90, 95]
        System.out.println("Di atas rata-rata : " + Arrays.toString(filterDiAtasRataRata(nilai)));

        input.close();
    }
}