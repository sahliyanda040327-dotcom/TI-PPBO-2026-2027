public class AkunPremium extends Akun {

    // Atribut KHUSUS AkunPremium — private (tidak perlu diakses subclass lain)
    private double batasKredit;

    // Constructor — memanggil super() untuk inisialisasi Akun
    public AkunPremium(String username, double saldo, double batasKredit) {
        // Panggil constructor Akun (superclass)
        super(username, saldo);
        // Inisialisasi atribut AkunPremium sendiri
        this.batasKredit = batasKredit;
    }

    public void cekLimit() {
        System.out.println("Username    : " + username);              // dari Akun (protected)
        System.out.println("Saldo       : " + saldo);                // dari Akun (protected)
        System.out.println("Batas Kredit: " + batasKredit);          // milik sendiri (private)
        System.out.println("Sisa Limit  : " + (batasKredit - saldo));
    }
}
