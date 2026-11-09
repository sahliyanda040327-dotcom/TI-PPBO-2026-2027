public class Direktur extends Manager {

    // Atribut KHUSUS Direktur
    private double tunjanganSaham;

    public Direktur(String nama, String nip, double gajiPokok,
                    double tunjanganJabatan, double tunjanganSaham) {

        // Panggil constructor Manager
        // Manager.super() akan sekalian memanggil Pegawai
        super(nama, nip, gajiPokok, tunjanganJabatan);

        // Inisialisasi atribut Direktur sendiri
        this.tunjanganSaham = tunjanganSaham;
    }

    // Getter untuk tunjanganSaham (private)
    public double getTunjanganSaham() {
        return tunjanganSaham;
    }
}
