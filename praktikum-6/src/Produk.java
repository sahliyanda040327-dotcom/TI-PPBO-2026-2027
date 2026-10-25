public class Produk {

    // atribut
    String namaProduk;
    double harga;

    // constructor berparameter
    public Produk(String namaProduk, double harga) {
        this.namaProduk = namaProduk;
        this.harga      = harga;
    }

    // instance metod
    // mengecek apakah harga melebihi batas harga
    public boolean isMahal(double batasHarga) {
        return harga > batasHarga;
    }
}