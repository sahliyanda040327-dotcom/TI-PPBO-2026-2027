public class Pegawai {
    protected String nama;
    protected String id;
    protected double gajiPokok;

    public Pegawai(String nama, String id, double gajiPokok) {
        this.nama = nama;
        this.id = id;
        this.gajiPokok = gajiPokok;
    }

    public void tampilkanData() {
        System.out.println("Nama: " + nama + ", ID: " + id + ", Gaji Pokok: " + gajiPokok);
    }

    public double hitungGaji() {
        return gajiPokok;
    }
}