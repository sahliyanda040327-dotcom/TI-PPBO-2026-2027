public class Manager extends Pegawai {
    private double tunjanganJabatan;

    public Manager(String nama, String id, double gajiPokok, double tunjanganJabatan) {
        super(nama, id, gajiPokok);
        this.tunjanganJabatan = tunjanganJabatan;
    }

    @Override
    public void tampilkanData() {
        super.tampilkanData();
        System.out.println("Tunjangan Jabatan: " + tunjanganJabatan);
    }

    // LANGKAH 7 — Override hitungGaji()
    @Override
    public double hitungGaji() {
        return gajiPokok + tunjanganJabatan;
    }
}
