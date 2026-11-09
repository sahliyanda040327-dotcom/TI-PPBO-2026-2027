public class Akun {

    // Protected → subclass bisa akses langsung
    protected String username;
    protected double saldo;

    // Constructor untuk menginisialisasi akun
    public Akun(String username, double saldo) {
        this.username = username;
        this.saldo    = saldo;
    }
}
