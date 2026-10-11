import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class KalkulatorMethod {

    // tambah() versi 1: menjumlahkan dua angka
    static double tambah(double a, double b) {
        return a + b;
    }

    // tambah() versi 2: menjumlahkan tiga angka
    static double tambah(double a, double b, double c) {
        return a + b + c;
    }

    // Pengurangan: a dikurangi b
    static double kurang(double a, double b) {
        return a - b;
    }

    // Perkalian: a dikali b
    static double kali(double a, double b) {
        return a * b;
    }

    // Pembagian: a dibagi b (b == 0 di cek nanti di main sebelum method ini dipanggil)
    static double bagi(double a, double b) {
        return a / b;
    }

    // Pangkat: basis dipangkatkan eksponen, memakai Math.pow
    static double pangkat(double basis, double eksponen) {
        return Math.pow(basis, eksponen);
    }

    // Akar kuadrat: memakai Math.sqrt (nanti pengecekan angka negatif dilakukan di main)
    static double akarKuadrat(double x) {
        return Math.sqrt(x);
    }

    // Mencari hasil nilai terbesar dari array riwayat
    static double riwayatKeMaksimum(double[] riwayatHasil) {
        double max = riwayatHasil[0];                // anggap elemen pertama terbesar

        for (int i = 1; i < riwayatHasil.length; i++) {
            if (riwayatHasil[i] > max) {             // jika ada elemen lebih besar,
                max = riwayatHasil[i];               // jadikan elemen itu nilai terbesar baru
            }
        }
        return max;                                  // kembalikan nilai terbesar
    }

    // Method bantu: membaca angka dengan aman.
    // Jika pengguna mengetik huruf, program tidak error, tetapi meminta input ulang.

    static double bacaAngka(Scanner input, String pesan) {
        System.out.print(pesan);
        while (!input.hasNextDouble()) {
            System.out.println("  Input tidak valid, masukkan angka!");
            input.next();                            // buang input yang salah
            System.out.print(pesan);                 // minta input lagi
        }
        return input.nextDouble();                   // input valid
    }

    // Method  menampilkan menu
    static void tampilkanMenu() {
        System.out.println("\n===== KALKULATOR METHOD =====");
        System.out.println("1. Tambah (2 angka)");
        System.out.println("2. Tambah (3 angka)");
        System.out.println("3. Kurang");
        System.out.println("4. Kali");
        System.out.println("5. Bagi");
        System.out.println("6. Pangkat");
        System.out.println("7. Akar kuadrat");
        System.out.println("0. Keluar");
        System.out.print("Pilih menu: ");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);      // objek untuk membaca input keyboard
        input.useLocale(Locale.US);                  // agar desimal memakai titik (2.5), bukan koma

        double[] riwayat = new double[10];           // penyimpanan hasil perhitungan
        int jumlah = 0;                              // banyaknya hasil yang sudah tersimpan
        String pilihan;                              // menyimpan pilihan menu pengguna

        // (Menu tampil berulang sampai pengguna memilih keluar (0)
        do {
            tampilkanMenu();
            pilihan = input.next();                  // baca pilihan menu

            double hasil = 0;                        // variabel untuk hasil perhitungan
            boolean berhasil = true;                 // false jika perhitungan gagal / tidak valid

            // switch-case memanggil method yang sesuai dengan pilihan pengguna
            switch (pilihan) {
                case "1": {                          // tambah 2 angka
                    double a = bacaAngka(input, "Angka pertama : ");
                    double b = bacaAngka(input, "Angka kedua   : ");
                    hasil = tambah(a, b);            // memanggil tambah versi 2 parameter
                    break;
                }
                case "2": {                          // tambah 3 angka
                    double a = bacaAngka(input, "Angka pertama : ");
                    double b = bacaAngka(input, "Angka kedua   : ");
                    double c = bacaAngka(input, "Angka ketiga  : ");
                    hasil = tambah(a, b, c);         // memanggil tambah versi 3 parameter
                    break;
                }
                case "3": {                          // kurang
                    double a = bacaAngka(input, "Angka pertama : ");
                    double b = bacaAngka(input, "Angka kedua   : ");
                    hasil = kurang(a, b);
                    break;
                }
                case "4": {                          // kali
                    double a = bacaAngka(input, "Angka pertama : ");
                    double b = bacaAngka(input, "Angka kedua   : ");
                    hasil = kali(a, b);
                    break;
                }
                case "5": {                          // bagi
                    double a = bacaAngka(input, "Angka pertama : ");
                    double b = bacaAngka(input, "Angka kedua   : ");
                    if (b == 0) {                    // pembagian dengan nol tidak bisa
                        System.out.println("Error: tidak bisa membagi dengan nol!");
                        berhasil = false;            // hasil tidak disimpan ke riwayat
                    } else {
                        hasil = bagi(a, b);
                    }
                    break;
                }
                case "6": {                          // pangkat
                    double a = bacaAngka(input, "Basis    : ");
                    double b = bacaAngka(input, "Eksponen : ");
                    hasil = pangkat(a, b);
                    break;
                }
                case "7": {                          // akar kuadrat
                    double a = bacaAngka(input, "Angka : ");
                    if (a < 0) {                     // akar bilangan negatif
                        System.out.println("Error: tidak bisa menghitung akar bilangan negatif!");
                        berhasil = false;            // hasil tidak disimpan ke riwayat
                    } else {
                        hasil = akarKuadrat(a);
                    }
                    break;
                }
                case "0":                            // keluar dari program
                    berhasil = false;                // tidak ada hasil yang disimpan
                    break;
                default:                             // pilihan di luar menu
                    System.out.println("Pilihan tidak valid, coba lagi.");
                    berhasil = false;
            }

            // Jika perhitungan berhasil: tampilkan dan simpan ke riwayat
            if (berhasil) {
                System.out.println("Hasil: " + hasil);

                if (jumlah == riwayat.length) {      // jika array penuh, perbesar 2x lipat
                    riwayat = Arrays.copyOf(riwayat, riwayat.length * 2);
                }
                riwayat[jumlah] = hasil;             // simpan hasil di posisi berikutnya
                jumlah++;                            // tambah penghitung riwayat
            }

        } while (!pilihan.equals("0"));              // ulangi selama pilihan bukan 0

        // Saat keluar: tampilkan nilai maksimum dari riwayat
        System.out.println("\n===== PROGRAM SELESAI =====");
        if (jumlah == 0) {
            System.out.println("Belum ada perhitungan yang dilakukan.");
        } else {
            // copyOf dipakai agar hanya elemen yang terisi (0 sampai jumlah-1) yang dikirim
            double[] riwayatTerisi = Arrays.copyOf(riwayat, jumlah);
            System.out.println("Jumlah perhitungan   : " + jumlah);
            System.out.println("Riwayat hasil        : " + Arrays.toString(riwayatTerisi));
            System.out.println("Hasil terbesar       : " + riwayatKeMaksimum(riwayatTerisi));
        }

        input.close();
    }
}