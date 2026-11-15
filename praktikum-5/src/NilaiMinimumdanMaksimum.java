import java.util.Scanner;

public class NilaiMinimumdanMaksimum {

    static int cariNilaiMinimum(int[] data) {
        // set elemen pertama nilai minimum sementara
        int min = data[0];

        // perulangan, memeriksa di mulai dari indeks ke-1 sampai akhir array
        for (int i = 1; i < data.length; i++) {
            // Jika nilai lebih kecil dari 'min', ganti nilai 'min'
            if (data[i] < min) {
                min = data[i];
            }
        }
        // Mengembalikan nilai min
        return min;
    }

    static int cariNilaiMaksimum(int[] data) {
        // set elemen pertama nilai maksimum sementara
        int max = data[0];

        // perulangan, memeriksa di mulai dari indeks ke-1 sampai akhir array
        for (int i = 1; i < data.length; i++) {
            // Jika nilai lebih besar dari 'max', ganti nilai 'max'
            if (data[i] > max) {
                max = data[i];
            }
        }
        // Mengembalikan nilai max
        return max;
    }

    public static void main(String[] args) {
        // objek untuk membaca input keyboard
        Scanner input = new Scanner(System.in);

        // meminta user memasukkan data/nilai
        System.out.print("Masukkan jumlah nilai ujian: ");
        int n = input.nextInt();

        // array 'nilai' dengan ukuran sejumlah 'n'
        int[] nilai = new int[n];

        // Perulangan untuk mengisi array dengan nilai-nilai ujian dari user
        for (int i = 0; i < n; i++) {
            System.out.print("Nilai ke-" + (i + 1) + ": ");
            nilai[i] = input.nextInt();
        }

        // Memanggil fungsi pencari nilai min dan max
        System.out.println("Nilai minimum  : " + cariNilaiMinimum(nilai));
        System.out.println("Nilai maksimum : " + cariNilaiMaksimum(nilai));

        input.close();
    }
}