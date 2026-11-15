public class KebunBinatangDemo {
    public static void main(String[] args) {

        Hewan[] daftarHewan = {
                new Kucing("Milo"),
                new Anjing("Rex"),
                new Kucing("Oyen"),
                new Bebek("Donald")
        };

        for (Hewan h : daftarHewan) {
            h.bersuara();
        }
    }
}
