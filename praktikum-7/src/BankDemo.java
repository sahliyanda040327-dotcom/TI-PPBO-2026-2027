public class BankDemo {
    public static void main(String[] args) {

        // Membuat 2 object RekeningBank
        RekeningBank rek1 = new RekeningBank("001", "Budi", 100000, "Tabungan");
        RekeningBank rek2 = new RekeningBank("002", "Ani", 50000, "Giro");

        // Setor dan tarik pada masing-masing rekening
        rek1.setor(50000);
        rek1.tarik(30000);
        rek2.setor(20000);
        rek2.tarik(10000);

        // Transfer yang BERHASIL
        rek1.transferKe(rek2, 50000);

        // Transfer yang GAGAL (saldo tidak cukup)
        rek1.transferKe(rek2, 500000);

        // Transfer yang GAGAL (jumlah tidak valid)
        rek1.transferKe(rek2, -1000);

        // Cetak mutasi akhir kedua rekening
        rek1.cetakMutasi();
        rek2.cetakMutasi();
    }
}