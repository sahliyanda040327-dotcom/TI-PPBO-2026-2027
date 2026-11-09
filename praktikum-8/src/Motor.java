public class Motor extends Kendaraan {
    private String jenisMotor; // Contoh: 'Matic'/'Manual'

    // Constructor memanggil super() (Latihan 3)
    public Motor(String merek, double kecepatanMaks, String jenisMotor) {
        super(merek, kecepatanMaks);
        this.jenisMotor = jenisMotor;
    }
}
