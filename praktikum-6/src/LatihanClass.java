public class LatihanClass {
    public static void main (String[] args) {
        Mahasiswa m1 = new Mahasiswa(); // contructor default
        Mahasiswa m2 = new Mahasiswa("Siti", "67890",3.90); //berparameter

        System.out.println(m1.nama + " - " + m1.ipk);
        System.out.println(m2.nama + " - " + m2.ipk);
    }
}
