public class LatihanBuku {
    public static void main(String[] args) {

        // 2 object berbeda dari class Buku
        Buku b1 = new Buku("Clean Code", "Robert C. Martin", 2008);
        Buku b2 = new Buku("Atomic Habits", "James Clear", 2018);

        // menampilkan data dari masing-masing object
        b1.tampilkanData();
        System.out.println("---");
        b2.tampilkanData();
    }
}