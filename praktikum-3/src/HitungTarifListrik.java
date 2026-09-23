import java.util.Scanner;

public class HitungTarifListrik {
    public static void main(String[] args) {

        // Membuat Scanner untuk membaca input dari pengguna
        Scanner input = new Scanner(System.in);

        // Konstanta tarif listrik per kWh untuk setiap golongan daya
        final double TARIF_450 = 500;
        final double TARIF_900 = 750;
        final double TARIF_1300 = 1200;
        final double TARIF_2200 = 1500;
        final double TARIF_DI_ATAS_2200 = 1800;

        // Menampilkan judul program
        System.out.println("=== HITUNG TARIF LISTRIK ===");

        // Menampilkan pilihan golongan daya
        System.out.println("Pilihan golongan daya:");
        System.out.println("450 VA");
        System.out.println("900 VA");
        System.out.println("1300 VA");
        System.out.println("2200 VA");
        System.out.println("Di atas 2200 VA");

        // Meminta pengguna memasukkan golongan daya
        System.out.print("Masukkan golongan daya (VA): ");
        int daya = input.nextInt();

        // Meminta pengguna memasukkan jumlah pemakaian listrik
        System.out.print("Masukkan jumlah pemakaian (kWh): ");
        double kwh = input.nextDouble();

        // Variabel untuk menyimpan tarif dan nama golongan
        double tarif = 0;
        String golongan = "";

        // Mengecek apakah jumlah pemakaian valid
        // Jika kWh kurang dari atau sama dengan 0, program menampilkan error
        if (kwh <= 0) {
            System.out.println("Error: Jumlah pemakaian kWh harus lebih dari 0.");
        } else {

            // Menentukan tarif berdasarkan golongan daya
            switch (daya) {

                // Jika daya 450 VA
                case 450:
                    golongan = "450 VA";
                    tarif = TARIF_450;
                    break;

                // Jika daya 900 VA
                case 900:
                    golongan = "900 VA";
                    tarif = TARIF_900;
                    break;

                // Jika daya 1300 VA
                case 1300:
                    golongan = "1300 VA";
                    tarif = TARIF_1300;
                    break;

                // Jika daya 2200 VA
                case 2200:
                    golongan = "2200 VA";
                    tarif = TARIF_2200;
                    break;

                // Jika tidak sesuai dengan pilihan di atas
                default:

                    // Mengecek apakah daya lebih dari 2200 VA
                    if (daya > 2200) {
                        golongan = "Di atas 2200 VA";
                        tarif = TARIF_DI_ATAS_2200;
                    } else {
                        // Jika daya tidak valid
                        System.out.println("Error: Golongan daya tidak valid.");

                        // Menghentikan program
                        input.close();
                        return;
                    }
            }

            // Menghitung total tagihan listrik
            // Rumus: jumlah pemakaian x tarif per kWh
            double total = kwh * tarif;

            // Menampilkan hasil perhitungan
            System.out.println();
            System.out.println("===== HASIL PERHITUNGAN =====");
            System.out.println("Golongan Daya   : " + golongan);
            System.out.println("Pemakaian       : " + kwh + " kWh");
            System.out.println("Tarif per kWh   : Rp" + tarif);
            System.out.println("Total Tagihan   : Rp" + total);
        }

        // Menutup Scanner setelah selesai digunakan
        input.close();
    }
}
