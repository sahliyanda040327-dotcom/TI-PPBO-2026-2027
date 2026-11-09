public class Hewan {
    protected String nama;
    // CONSTRUCTOR — inisialisasi nama hewan
    public Hewan(String nama) {
        this.nama = nama;
    }

    // METHOD bersuara() — akan diwarisi oleh Kucing dan Anjing
    public void bersuara() {
        System.out.println(nama + " bersuara: ...");
    }
}
