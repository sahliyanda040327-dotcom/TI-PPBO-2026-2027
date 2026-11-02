public class Produk {
    private String kodeProduk;
    private String namaProduk;
    private double harga;
    private int stok;

    public Produk(String kodeProduk, String namaProduk, double harga, int stok) {
        this.kodeProduk  = kodeProduk;
        this.namaProduk  = namaProduk;
        this.harga       = (harga >= 0) ? harga : 0;
        this.stok        = (stok >= 0) ? stok : 0;
    }

    // Getter
    public String getKodeProduk()  { return kodeProduk; }
    public String getNamaProduk()  { return namaProduk; }
    public double getHarga()       { return harga; }
    public int getStok()           { return stok; }

    // Setter dengan validasi
    public void setHarga(double harga) {
        if (harga >= 0) {
            this.harga = harga;
        } else {
            System.out.println("Harga tidak boleh negatif");
        }
    }

    // Method tambahStok
    public void tambahStok(int jumlah) {
        if (jumlah > 0) {
            stok += jumlah;
            System.out.println("Stok berhasil ditambah. Stok sekarang: " + stok);
        } else {
            System.out.println("Jumlah tambah stok harus positif");
        }
    }

    // Method kurangiStok
    public void kurangiStok(int jumlah) {
        if (jumlah <= 0) {
            System.out.println("Jumlah kurangi stok harus positif");
        } else if (jumlah > stok) {
            System.out.println("Stok tidak mencukupi");
        } else {
            stok -= jumlah;
            System.out.println("Stok berhasil dikurangi. Stok sekarang: " + stok);
        }
    }
}
