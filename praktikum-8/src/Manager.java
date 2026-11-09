public class Manager extends Pegawai {
    protected double tunjanganJabatan;

    public Manager(String nama, String id, double gajiPokok, double tunjanganJabatan) {
        super(nama, id, gajiPokok);
        this.tunjanganJabatan = tunjanganJabatan;
    }

    public double getTunjanganJabatan() {
        return tunjanganJabatan;
    }
}
