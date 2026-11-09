public class Mobil extends Kendaraan {
    private int jumlahPintu;

    // Constructor memanggil super() (Latihan 3)
    public Mobil(String merek, double kecepatanMaks, int jumlahPintu) {
        super(merek, kecepatanMaks);
        this.jumlahPintu = jumlahPintu;
    }

    // Method mengakses langsung atribut protected dari superclass (Latihan 4)
    public void tampilkanInfo() {
        System.out.println("Merek: " + merek);
        System.out.println("Kecepatan Maks: " + kecepatanMaks + " km/jam");
        System.out.println("Jumlah Pintu: " + jumlahPintu);
    }
}
