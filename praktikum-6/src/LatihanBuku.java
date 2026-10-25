public class LatihanBuku {
    public static void main(String[] args) {

        // 2 object berbeda dari class Buku
        Buku b1 = new Buku("Clean Code", "Robert C. Martin", 2008);
        Buku b2 = new Buku("Atomic Habits", "James Clear", 2018);

        // menampilkan data dari masing-masing object
        b1.tampilkanData();
        System.out.println("---");
        b2.tampilkanData();

        //array yang berisi object 4 buku
        Buku[] daftarBuku = new Buku[4];
        daftarBuku[0] = new Buku("Clean Code", "Robert C. Martin", 2008);
        daftarBuku[1] = new Buku("Atomic Habits", "James Clear", 2018);
        daftarBuku[2] = new Buku("The Pragmatic Programmer", "David Thomas", 2019);
        daftarBuku[3] = new Buku("Head First Java", "Kathy Sierra", 2005);

        //menampilkan judul buku yang terbit setelah 2015
        System.out.println("\nBuku yang terbit setelah 2015:");
        for (Buku b : daftarBuku) {
            if (b.tahunTerbit > 2015) {
                System.out.println("- " + b.judul + " (" + b.tahunTerbit + ")");
            }
        }
    }
}