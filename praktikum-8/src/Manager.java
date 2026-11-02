public class Manager extends Pegawai {
    private double tunjanganJabatan;

    public  Manager(String nama, String nip, double gajiPokok, double tunjanganJabatan) {
        super(nama, nip, gajiPokok); // panggil Construktor Pegawai
        this.tunjanganJabatan = tunjanganJabatan;
    }
}
