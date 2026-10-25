public class Mahasiswa {
    String nama;
    String nim;
    double ipk;

    //Constructor default(tanpa parameter)
    public  Mahasiswa() {
        nama = "belum diisi";
        nim = "-";
        ipk = 0.0;
    }
    public void tampilkanData(){
        System.out.println("Nama:" + nama);
        System.out.println("Nim: " + nim);
        System.out.println("IPK:" + ipk);
    }

    public boolean isCumlaude() {
        return ipk >=3.5;
    }

    public Mahasiswa(String nama, String nim, double ipk) {
        this.nama = nama;
        this.nim = nim;
        this.ipk = ipk;
    }
}
