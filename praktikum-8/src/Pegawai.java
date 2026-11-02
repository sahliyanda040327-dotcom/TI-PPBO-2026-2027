public class Pegawai {
    protected String nama;
    protected String nip;
    protected double gajiPokok;

    public  Pegawai(String nama, String nip, double gajiPokok) {
        this.nama = nama;
        this.nip = nip;
        this.gajiPokok = gajiPokok;
    }

    public void tampilkanData() {
        System.out.println("Nama: " + nama);
        System.out.println("Nip: " + nip);
        System.out.println("gaji Pokok: " + gajiPokok);
    }
}
