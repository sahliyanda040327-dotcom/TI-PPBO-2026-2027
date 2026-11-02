public class Mahasiswa {
    // Atribut (fields)
    private String nama;
    private String nim;
    private double ipk;

    // Constructor
    public Mahasiswa(String nama, String nim, double ipk) {
        this.nama = nama;
        this.nim  = nim;
        this.ipk  = ipk;
    }

    // Getter untuk setiap atribut
    public String getNama() {
        return nama;
    }

    public String getNim() {
        return nim;
    }

    public double getIpk() {
        return ipk;
    }
}