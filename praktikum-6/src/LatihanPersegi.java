public class LatihanPersegi {
    public static void main(String[] args) {

        // 3 object dengan ukuran sisi berbeda
        Persegi p1 = new Persegi(5);
        Persegi p2 = new Persegi(7);
        Persegi p3 = new Persegi(12);

        // menampilkan hasil perhitungan tiap object
        System.out.println("Persegi 1:");
        p1.tampilkanData();
        System.out.println("---");
        System.out.println("Persegi 2:");
        p2.tampilkanData();
        System.out.println("---");
        System.out.println("Persegi 3:");
        p3.tampilkanData();

        // membuat array yang berisi 4 object persegi berbeda
        Persegi[] daftarPersegi = new Persegi[4];
        daftarPersegi[0] = new Persegi(3);
        daftarPersegi[1] = new Persegi(8);
        daftarPersegi[2] = new Persegi(5);
        daftarPersegi[3] = new Persegi(12);

        //set index 0 sebagai yang terbesar
        Persegi terBesar = daftarPersegi[0];

        // Bandingkan luas tiap persegi
        for (Persegi p : daftarPersegi) {
            if (p.hitungLuas() > terBesar.hitungLuas()) {
                terBesar = p; // ubah jika ada yang lebih besar
            }
        }

        // menampilkan persegi luas terbesar
        System.out.println("\nPersegi luas terbesar:");
        terBesar.tampilkanData();
    }
}
