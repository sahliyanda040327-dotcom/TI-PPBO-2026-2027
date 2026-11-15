public class BangunDatarDemo {
    public static void main(String[] args) {
        // Array minimal 5 object, campuran 3 subclass (poin d)
        BangunDatar[] daftarBangun = {
                new Lingkaran(7),
                new Persegi(5),
                new PersegiPanjang(8, 4),
                new Lingkaran(3),
                new PersegiPanjang(6, 2),
        };

        double totalLuas = 0;
        BangunDatar terbesar = daftarBangun[0];

        // Tampilkan info SETIAP bangun dengan tampilkanInfo() — satu perulangan (poin c & d)
        for (BangunDatar bd : daftarBangun) {
            bd.tampilkanInfo();
            totalLuas += bd.hitungLuas();

            // Cari bangun dengan luas terbesar
            if (bd.hitungLuas() > terbesar.hitungLuas()) {
                terbesar = bd;
            }
        }

        System.out.println("Total luas seluruh bangun: " + totalLuas);
        System.out.println("Bangun terbesar: " + terbesar.namaBangun + " dengan luas " + terbesar.hitungLuas());
    }
}