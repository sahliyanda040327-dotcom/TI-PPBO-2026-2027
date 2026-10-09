public class LuasPersegiPanjangdanLingkaran {

        // Menghitung luas persegi panjang
        static double luasPersegiPanjang(double p, double l) {
            return p * l;
        }

        // Menghitung luas lingkaran
        static double luasLingkaran(double r) {
            return Math.PI * r * r;
        }

        public static void main(String[] args) {
            System.out.println("Luas persegi panjang 2 x 3    = " + luasPersegiPanjang(2, 3));
            System.out.println("Luas persegi panjang 4 x 2.5 = " + luasPersegiPanjang(4, 2.5));

            System.out.println("Luas lingkaran r=7  = " + luasLingkaran(7));
            System.out.println("Luas lingkaran r=2.5 = " + luasLingkaran(2.5));
        }
    }
