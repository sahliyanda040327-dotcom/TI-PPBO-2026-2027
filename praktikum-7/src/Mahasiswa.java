public class Mahasiswa {
    private String nama;
    private String nim;
    private double ipk;

    // Constructor
    public Mahasiswa(String nama, String nim, double ipk) {
        this.nama = nama;
        this.nim  = nim;
        this.ipk  = ipk;
    }

    // Getter
    public String getNama() { return nama; }
    public String getNim()  { return nim;  }
    public double getIpk()  { return ipk;  }

    // Setter dengan validasi (nim read-only, tidak ada setNim)
    public void setIpk(double ipk) {
        if (ipk >= 0.0 && ipk <= 4.0) {
            this.ipk = ipk;
        } else {
            System.out.println("IPK tidak valid, harus 0.0 - 4.0");
        }
    }
}