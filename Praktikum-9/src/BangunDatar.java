public class BangunDatar {
    protected String namaBangun;

    public BangunDatar(String namaBangun) {
        this.namaBangun = namaBangun;
    }

    public double hitungLuas() {
        return 0;
    }

    public double hitungKeliling() {
        return 0;
    }

    // TIDAK di-override — memanfaatkan dynamic binding
    public void tampilkanInfo() {
        System.out.println("Bangun  : " + namaBangun);
        System.out.println("Luas    : " + hitungLuas());
        System.out.println("Keliling: " + hitungKeliling());
        System.out.println("---");
    }
}
