public class ProdukTugas {

    // atribut
    String kodeProduk;
    String namaProduk;
    double harga;
    int stok;

    // constructor berparameter
    public ProdukTugas(String kodeProduk, String namaProduk, double harga, int stok) {
        this.kodeProduk = kodeProduk;
        this.namaProduk = namaProduk;
        this.harga      = harga;
        this.stok       = stok;
    }

    // menghitung total harga berdasarkan jumlah beli
    public double hitungTotalHarga(int jumlahBeli) {
        return harga * jumlahBeli;
    }

    // mengurangi stok kalau mencukupi
    public void kurangiStok(int jumlah) {
        if (jumlah <= stok) {
            stok -= jumlah;
            System.out.println("Pembelian berhasil! Sisa stok "
                    + ": " + stok);
        } else {
            System.out.println("Stok tidak mencukupi! Stok "
                    + " tersisa: " + stok);
        }
    }

    // menampilkan seluruh informasi produk
    public void tampilkanData() {
        System.out.println("Kode Produk : " + kodeProduk);
        System.out.println("Nama Produk : " + namaProduk);
        System.out.println("Harga       : Rp " + (long) harga); // ← fix di sini
        System.out.println("Stok        : " + stok + " unit");
    }
}