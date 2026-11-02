public class RekeningBank {
    // Atribut private
    private String nomorRekening; // nomor unik rekening
    private String pemilik;       // nama pemilik rekening
    private double saldo;         // saldo rekening
    private String jenisRekening; // jenis rekening (read-only, tanpa setter)

    // Constructor - jenisRekening hanya bisa diisi lewat constructor
    public RekeningBank(String nomor, String pemilik, double saldoAwal, String jenisRekening) {
        this.nomorRekening = nomor;
        this.pemilik       = pemilik;
        this.saldo         = (saldoAwal >= 0) ? saldoAwal : 0; // saldo awal tidak boleh negatif
        this.jenisRekening = jenisRekening;
    }

    // Getter untuk mengakses atribut private dari luar class
    public String getNomorRekening() { return nomorRekening; }
    public String getPemilik()       { return pemilik; }
    public double getSaldo()         { return saldo; }
    public String getJenisRekening() { return jenisRekening; }

    // Method setor - validasi jumlah harus lebih dari 0
    public void setor(double jumlah) {
        if (jumlah <= 0) {
            System.out.println("Jumlah setor harus lebih dari 0");
            return;
        }
        saldo += jumlah;
        System.out.println("Setor berhasil. Saldo: " + saldo);
    }

    // Method tarik - validasi jumlah dan kecukupan saldo
    public void tarik(double jumlah) {
        if (jumlah <= 0) {
            System.out.println("Jumlah tarik harus lebih dari 0");
        } else if (jumlah > saldo) {
            System.out.println("Saldo tidak mencukupi");
        } else {
            saldo -= jumlah;
            System.out.println("Tarik berhasil. Saldo: " + saldo);
        }
    }

    // Method transferKe - validasi jumlah positif dan saldo mencukupi
    public void transferKe(RekeningBank tujuan, double jumlah) {
        if (jumlah <= 0) {
            System.out.println("Jumlah transfer harus lebih dari 0");
        } else if (jumlah > saldo) {
            System.out.println("Transfer gagal. Saldo tidak mencukupi");
        } else {
            saldo -= jumlah;
            tujuan.saldo += jumlah;
            System.out.println("Transfer berhasil sebesar " + jumlah +
                    " ke rekening " + tujuan.getNomorRekening() +
                    ". Saldo: " + saldo);
        }
    }

    // Method cetakMutasi - menampilkan informasi rekening dalam format laporan
    public void cetakMutasi() {
        System.out.println("================================");
        System.out.println("Nomor Rekening : " + nomorRekening);
        System.out.println("Pemilik        : " + pemilik);
        System.out.println("Jenis Rekening : " + jenisRekening);
        System.out.println("Saldo          : " + saldo);
        System.out.println("================================");
    }
}