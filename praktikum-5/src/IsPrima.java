public class IsPrima {
    // mengenmbalikan true jika nilai n adalah nilai prima
    static  boolean isPrima(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println("Bilangan prima dari 1 sampai 50:");
        for (int i = 1; i <= 50; i++) {
            if (isPrima(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
