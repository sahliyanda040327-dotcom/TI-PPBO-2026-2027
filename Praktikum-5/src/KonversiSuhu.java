public class KonversiSuhu {
    // Celsius -> Fahrenheit
    static double konversiSuhu(double celsius) {
        return celsius * 9 / 5 + 32;
    }

    // Celsius -> Kelvin atau Fahrenheit sesuai skalaTujuan
    static double konversiSuhu(double celsius, String skalaTujuan) {
        if (skalaTujuan.equalsIgnoreCase("Kelvin")) {
            return celsius + 273.15;
        } else if (skalaTujuan.equalsIgnoreCase("Fahrenheit")) {
            return konversiSuhu(celsius); // memanggil versi 1
        } else {
            throw new IllegalArgumentException("Skala tidak dikenal: " + skalaTujuan);
        }
    }

    //Method main
    public static void main(String[] args) {
        // Memanggil method versi 1: 100 Celsius ke Fahrenheit
        System.out.println("100 C ke Fahrenheit (versi 1)  = " + konversiSuhu(100));
        // Memanggil method versi 2: 37 Celsius ke Fahrenheit
        System.out.println("37 C ke Fahrenheit (versi 2)   = " + konversiSuhu(37, "Fahrenheit"));
        // Memanggil method versi 2: 100 Celsius ke Kelvin
        System.out.println("100 C ke Kelvin (versi 2)      = " + konversiSuhu(100, "Kelvin"));
        // Memanggil method versi 2: 0 Celsius ke Kelvin
        System.out.println("0 C ke Kelvin (versi 2)        = " + konversiSuhu(0, "kelvin"));
    }
}

