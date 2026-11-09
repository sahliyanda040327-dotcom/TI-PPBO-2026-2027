public class HewanDemo {
    public static void main(String[] args) {

        System.out.println("UJI LATIHAN 1 ");
        Kucing kucing = new Kucing("Whisker");
        kucing.bersuara();

        // Buat object Anjing — konstruktor Hewan dipanggil via super()
        Anjing anjing = new Anjing("Rex");
        anjing.bersuara();

        Hewan h1 = new Kucing("Micco");  // Kucing IS-A Hewan
        Hewan h2 = new Anjing("Doggy"); // Anjing IS-A Hewan
        h1.bersuara();
        h2.bersuara();
    }
}
