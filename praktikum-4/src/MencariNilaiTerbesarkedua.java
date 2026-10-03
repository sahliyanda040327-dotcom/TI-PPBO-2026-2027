import java.util.Scanner;

public class MencariNilaiTerbesarkedua {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Meminta pengguna memasukkan jumlah array
        System.out.print("Masukkan jumlah elemen array: ");
        int n = input.nextInt();

        // Membuat array ukurannya sesuai inputan
        int[] angka = new int[n];

        // Meminta pengguna memasukkan nilai setiap elemen array
        System.out.println("Masukkan elemen array:");

        for (int i = 0; i < n; i++) {
            System.out.print("Elemen ke-" + (i + 1) + ": ");
            angka[i] = input.nextInt();
        }

        // Menentukan nilai terbesar dan terbesar kedua
        int terbesar = angka[0];

        // Nilai awal terbesar kedua dibuat sangat kecil
        int terbesarKedua = Integer.MIN_VALUE;

        // Membandingkan elemen array mulai dari elemen kedua
        for (int i = 1; i < n; i++) {

            // Jika nilai sekarang lebih dari nilai terbesar
            if (angka[i] > terbesar) {

                // Nilai terbesar sebelumnya menjadi terbesar kedua
                terbesarKedua = terbesar;

                // Nilai sekarang menjadi nilai terbesar
                terbesar = angka[i];

                // Jika nilai sekarang tidak lebih besar dari terbesar,
            } else if (angka[i] > terbesarKedua && angka[i] != terbesar) {

                // Nilai sekarang menjadi terbesar kedua
                terbesarKedua = angka[i];
            }
        }

        // Menampilkan nilai terbesar
        System.out.println("\nNilai terbesar = " + terbesar);

        // Menampilkan nilai terbesar kedua
        System.out.println("Nilai terbesar kedua = " + terbesarKedua);
    }
}
