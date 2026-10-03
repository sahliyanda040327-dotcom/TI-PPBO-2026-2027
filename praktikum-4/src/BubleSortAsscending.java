import java.util.Scanner;

public class BubleSortAsscending {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Meminta pengguna memasukkan jumlah elemen array
        System.out.print("Masukkan jumlah elemen array: ");
        int n = input.nextInt();

        // Membuat array sesuai dengan jumlah yang diinput
        int[] angka = new int[n];

        // Meminta pengguna memasukkan nilai elemen array
        System.out.println("Masukkan elemen array:");

        for (int i = 0; i < n; i++) {
            System.out.print("Elemen ke-" + (i + 1) + ": ");
            angka[i] = input.nextInt();
        }

        // Menampilkan array sebelum diurutkan
        System.out.println("\nArray sebelum diurutkan:");

        for (int i = 0; i < n; i++) {
            System.out.print(angka[i] + " ");
        }

        // Proses pengurutan menggunakan Bubble Sort
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (angka[j] > angka[j + 1]) {
                    int sementara = angka[j];
                    angka[j] = angka[j + 1];
                    angka[j + 1] = sementara;
                }
            }
        }

        // Menampilkan array setelah diurutkan
        System.out.println("\n\nArray setelah diurutkan:");

        for (int i = 0; i < n; i++) {
            System.out.print(angka[i] + " ");
        }
    }
}