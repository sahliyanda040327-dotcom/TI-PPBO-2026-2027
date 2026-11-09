public class PerusahaanDemo {
    public static void main(String[] args) {

        // UJI OBJECT MANAGER (extends Pegawai — 2 tingkat)
        System.out.println("========== DATA MANAGER ==========");
        Manager mgr = new Manager("Budi", "M001", 8000000, 2000000);
        mgr.tampilkanData(); // method warisan dari Pegawai
        System.out.println("Tunjangan Jabatan: " + mgr.getTunjanganJabatan());

        // UJI OBJECT STAFF (extends Pegawai — 2 tingkat)
        System.out.println("\n========== DATA STAFF ==========");
        Staff stf = new Staff("Ani", "S001", 5000000, 500000);
        stf.tampilkanData(); // method warisan dari Pegawai
        System.out.println("Tunjangan Kinerja: " + stf.getTunjanganKinerja());

        // UJI OBJECT DIREKTUR (Pegawai → Manager → Direktur)
        // tampilkanData() diwarisi melewati 3 tingkat!
        System.out.println("\n========== DATA DIREKTUR ==========");
        Direktur dir = new Direktur("Citra", "D001", 15000000, 5000000, 3000000);
        dir.tampilkanData(); // warisan dari Pegawai, melewati Manager dan Direktur
        System.out.println("Tunjangan Jabatan: " + dir.getTunjanganJabatan());
        System.out.println("Tunjangan Saham  : " + dir.getTunjanganSaham());

        // UJI VALIDASI — gajiPokok negatif (Tugas poin a)
        System.out.println("\n========== UJI VALIDASI GAJI NEGATIF ==========");
        Manager mgrNegatif = new Manager("Doni", "M002", -1000000, 500000);
        mgrNegatif.tampilkanData(); // gajiPokok harusnya 0
    }
}
