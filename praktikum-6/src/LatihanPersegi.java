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
    }
}
