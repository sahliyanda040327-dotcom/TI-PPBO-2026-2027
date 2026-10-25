public class LatihanClass {
    public static void main (String[] args) {
        Mahasiswa m1 = new Mahasiswa(); // contructor default
        Mahasiswa m2 = new Mahasiswa("Siti", "67890",3.90); //berparameter
        m2.tampilkanData();
        System.out.print( "Cumlaude?" + m2.isCumlaude());
    }
}
