public class TokoDemo {
    public static void main(String[] args) {

        // membuat array yang berisi 5 object produk
        ProdukTugas[] daftarProduk = new ProdukTugas[5];
        daftarProduk[0] = new ProdukTugas("P01", "Laptop Gaming",       15000000, 5);
        daftarProduk[1] = new ProdukTugas("P02", "Mouse Wireless",         250000, 30);
        daftarProduk[2] = new ProdukTugas("P03", "Keyboard Mechanical",    800000, 20);
        daftarProduk[3] = new ProdukTugas("P04", "Monitor 27 inch",       3500000, 8);
        daftarProduk[4] = new ProdukTugas("P05", "Headset Bluetooth",      450000, 3);

        // menampilkan semua produk
        System.out.println("=== PRODUK TOKO REZEKI SAHLI ===");
        for (ProdukTugas p : daftarProduk) {
            p.tampilkanData();
            System.out.println("----------------------------");
        }
        // simulasi pembelian
        System.out.println("\n=== SIMULASI PEMBELIAN ===");

        // skenario stok MENCUKUPI (beli 2 Mouse Wireless, stok 30)
        int mouse = 2;
        System.out.println("Beli " + mouse + " unit " + daftarProduk[1].namaProduk);
        System.out.println("Stok tersedia: " + daftarProduk[1].stok);  // ← tambahan
        System.out.println("Total: Rp " + daftarProduk[1].hitungTotalHarga(mouse));
        daftarProduk[1].kurangiStok(mouse);

        System.out.println();

        // skenario stok TIDAK MENCUKUPI (beli 10 Headset, stok hanya 3)
        int headset = 10;
        System.out.println("Beli " + headset + " unit " + daftarProduk[4].namaProduk);
        System.out.println("Stok tersedia: " + daftarProduk[4].stok);  // ← tambahan
        System.out.println("Total: Rp " + (long) daftarProduk[4].hitungTotalHarga(headset));
        daftarProduk[4].kurangiStok(headset);

        // mencari produk termahal
        System.out.println("\n===PRODUK TERMAHAL ===");

        // set index 0 sebagai termahal dulu
        ProdukTugas termahal = daftarProduk[0];

        // bandingkan harga tiap produk
        for (ProdukTugas p : daftarProduk) {
            if (p.harga > termahal.harga) {
                termahal = p;
            }
        }

        // tampilkan produk termahal
        termahal.tampilkanData();
    }
}