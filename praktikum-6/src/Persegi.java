public class Persegi {

    // atribut
    double sisi;

    // constructor berparameter
    public Persegi(double sisi) {
        this.sisi = sisi;
    }

    // instance method
    public double hitungLuas() {
        return sisi * sisi;
    }

    public double hitungKeliling() {
        return 4 * sisi;
    }

    //menampilkan data
    public void tampilkanData() {
        System.out.println("Sisi     : " + sisi);
        System.out.println("Luas     : " + hitungLuas());
        System.out.println("Keliling : " + hitungKeliling());
    }
}
