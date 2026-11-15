public class Direktur extends Manager {
    private double tunjanganSaham;

    public Direktur(String nama, String id, double gajiPokok, double tunjanganJabatan, double tunjanganSaham) {
        super(nama, id, gajiPokok, tunjanganJabatan);
        this.tunjanganSaham = tunjanganSaham;
    }

    @Override
    public double hitungGaji() {
        return super.hitungGaji() + tunjanganSaham; // memanggil versi Manager, lalu tambah saham
    }
}
