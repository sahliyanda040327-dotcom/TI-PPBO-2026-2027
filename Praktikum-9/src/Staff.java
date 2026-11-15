public class Staff extends Pegawai {
    private double tunjanganKinerja;

    public Staff(String nama, String id, double gajiPokok, double tunjanganKinerja) {
        super(nama, id, gajiPokok);
        this.tunjanganKinerja = tunjanganKinerja;
    }

    @Override
    public void tampilkanData() {
        super.tampilkanData();
        System.out.println("Tunjangan Kinerja: " + tunjanganKinerja);
    }

    // LANGKAH 7 — Override hitungGaji()
    @Override
    public double hitungGaji() {
        return gajiPokok + tunjanganKinerja;
    }
}