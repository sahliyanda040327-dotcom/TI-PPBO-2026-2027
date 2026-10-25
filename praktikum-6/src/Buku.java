public class Buku {

    // atribut dari buku
    String judul;
    String pengarang;
    int tahunTerbit;

    // construktor yang ada parameter
    public Buku(String judul, String pengarang, int tahunTerbit) {
        this.judul       = judul;
        this.pengarang   = pengarang;
        this.tahunTerbit = tahunTerbit;
    }

    // instance mehod
    public void tampilkanData() {
        System.out.println("Judul     : " + judul);
        System.out.println("Pengarang : " + pengarang);
        System.out.println("Tahun     : " + tahunTerbit);
    }
}