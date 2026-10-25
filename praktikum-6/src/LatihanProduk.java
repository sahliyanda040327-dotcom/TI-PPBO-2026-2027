public class LatihanProduk {
    public static void main(String[] args) {

        // object dari Produk
        Produk p1 = new Produk("Laptop Gaming", 15000000);
        Produk p2 = new Produk("Mouse Wireless", 250000);
        Produk p3 = new Produk("Keyboard Mechanical", 800000);

        //batas harga
        double batasHarga = 500000;
        System.out.println("Batas harga: Rp " + batasHarga);
        System.out.println("---");

        // mengecek setiap produk
        System.out.println(p1.namaProduk + " mahal? " + p1.isMahal(batasHarga));
        System.out.println(p2.namaProduk + " mahal? " + p2.isMahal(batasHarga));
        System.out.println(p3.namaProduk + " mahal? " + p3.isMahal(batasHarga));
    }
}
