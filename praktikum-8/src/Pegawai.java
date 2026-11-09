public class Pegawai {

    protected String nama;
    protected String nip;
    protected double gajiPokok;

    // Constructor dengan VALIDASI gajiPokok (Tugas poin a)
    public Pegawai(String nama, String nip, double gajiPokok) {
        this.nama = nama;
        this.nip  = nip;

        // Validasi: gajiPokok tidak boleh negatif
        if (gajiPokok < 0) {
            System.out.println("PERINGATAN: gajiPokok tidak boleh negatif! Diset ke 0.");
            this.gajiPokok = 0; // set ke 0 jika negatif
        } else {
            this.gajiPokok = gajiPokok;
        }
    }

    // Method warisan — bisa dipanggil si Manager, Staff, dan Direktur
    public void tampilkanData() {
        System.out.println("Nama      : " + nama);
        System.out.println("NIP       : " + nip);
        System.out.println("Gaji Pokok: " + (long) gajiPokok);
    }
}