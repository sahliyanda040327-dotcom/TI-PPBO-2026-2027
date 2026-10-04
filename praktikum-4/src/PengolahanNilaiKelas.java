import java.util.Scanner;

public class PengolahanNilaiKelas {

    // Menentukan nilai KKM
    static final double nilaiminimal = 70.0;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Memasukkan jumlah mahasiswa
        // Input akan diulang jika jumlahnya tidak lebih dari 0
        int n;
        do {
            System.out.print("Masukkan jumlah mahasiswa (N): ");

            // Memastikan input yang dimasukkan berupa bilangan bulat
            while (!input.hasNextInt()) {
                System.out.print("Input tidak valid. Masukkan bilangan bulat: ");
                input.next();
            }

            n = input.nextInt();

            // Jumlah mahasiswa tidak boleh 0 atau kurang
            if (n <= 0) {
                System.out.println("Jumlah mahasiswa harus lebih dari 0.");
            }

        } while (n <= 0);

        // Membuat array untuk menyimpan nilai setiap mahasiswa
        double[] nilai = new double[n];

        // Memasukkan nilai setiap mahasiswa
        for (int i = 0; i < n; i++) {
            double x;

            do {
                System.out.print("Nilai mahasiswa ke-" + (i + 1) + " (0-100): ");

                // Memastikan input berupa angka
                while (!input.hasNextDouble()) {
                    System.out.print("Input tidak valid. Masukkan angka: ");
                    input.next();
                }

                x = input.nextDouble();

                // Nilai hanya boleh berada antara 0 sampai 100
                if (x < 0 || x > 100) {
                    System.out.println("Nilai harus berada pada rentang 0 - 100.");
                }

            } while (x < 0 || x > 100);

            // Menyimpan nilai ke dalam array
            nilai[i] = x;
        }

        // Menghitung total, nilai tertinggi, nilai terendah,
        // serta jumlah mahasiswa yang lulus dan tidak lulus
        double total = 0;
        double tertinggi = nilai[0];
        double terendah = nilai[0];
        int jumlahLulus = 0;
        int jumlahTidakLulus = 0;

        // Mengecek semua nilai yang ada di dalam array
        for (int i = 0; i < n; i++) {

            // Menjumlahkan semua nilai
            total += nilai[i];

            // Mengecek apakah ada nilai yang lebih tinggi
            if (nilai[i] > tertinggi) {
                tertinggi = nilai[i];
            }

            // Mengecek apakah ada nilai yang lebih rendah
            if (nilai[i] < terendah) {
                terendah = nilai[i];
            }

            // Mengecek kelulusan berdasarkan nilai KKM
            if (nilai[i] >= nilaiminimal) {
                jumlahLulus++;
            } else {
                jumlahTidakLulus++;
            }
        }

        // Menghitung nilai rata-rata kelas
        double rataRata = total / n;

        // Menyimpan salinan nilai sebelum diurutkan
        double[] nilaiAsli = new double[n];

        for (int i = 0; i < n; i++) {
            nilaiAsli[i] = nilai[i];
        }

        // Mengurutkan nilai dari yang terkecil ke terbesar
        // menggunakan Selection Sort
        for (int i = 0; i < n - 1; i++) {

            // Menganggap nilai pada posisi i sebagai nilai terkecil sementara
            int indeksMin = i;

            // Mencari nilai yang lebih kecil dari posisi i
            for (int j = i + 1; j < n; j++) {
                if (nilai[j] < nilai[indeksMin]) {
                    indeksMin = j;
                }
            }

            // Menukar dua nilai dengan bantuan variabel sementara
            double temp = nilai[indeksMin];
            nilai[indeksMin] = nilai[i];
            nilai[i] = temp;
        }

        // Membuat garis untuk mempercantik tampilan laporan
        String garis = "=".repeat(48);
        String garisTipis = "-".repeat(48);

        // Menampilkan laporan nilai
        System.out.println();
        System.out.println(garis);
        System.out.println("          LAPORAN NILAI UJIAN KELAS");
        System.out.println(garis);

        // Menampilkan jumlah mahasiswa dan nilai KKM
        System.out.printf("%-28s: %d%n", "Jumlah mahasiswa", n);
        System.out.printf("%-28s: %.2f%n", "KKM", nilaiminimal);
        System.out.println(garisTipis);

        // Menampilkan hasil perhitungan nilai
        System.out.println("STATISTIK NILAI");
        System.out.printf("%-28s: %.2f%n", "Nilai rata-rata kelas", rataRata);
        System.out.printf("%-28s: %.2f%n", "Nilai tertinggi", tertinggi);
        System.out.printf("%-28s: %.2f%n", "Nilai terendah", terendah);
        System.out.println(garisTipis);

        // Menampilkan jumlah mahasiswa yang lulus dan tidak lulus
        System.out.println("KELULUSAN");

        System.out.printf("%-28s: %d mahasiswa (%.1f%%)%n",
                "Lulus (nilai >= nilaiMinimal)",
                jumlahLulus,
                jumlahLulus * 100.0 / n);

        System.out.printf("%-28s: %d mahasiswa (%.1f%%)%n",
                "Tidak lulus (nilai < nilaiMinimal)",
                jumlahTidakLulus,
                jumlahTidakLulus * 100.0 / n);

        System.out.println(garisTipis);

        // Menampilkan nilai sebelum dan sesudah diurutkan
        System.out.println("DATA NILAI");

        System.out.println("Sebelum diurutkan:");

        // Menampilkan nilai asli sebelum proses sorting
        for (int i = 0; i < n; i++) {
            System.out.print(nilaiAsli[i] + " ");
        }

        System.out.println();

        // Menampilkan nilai setelah diurutkan dari kecil ke besar
        System.out.println("Sesudah diurutkan (ascending):");

        for (int i = 0; i < n; i++) {
            System.out.print(nilai[i] + " ");
        }

        System.out.println();
        System.out.println(garis);

        // Menutup Scanner setelah selesai digunakan
        input.close();
    }
}
