import java.util.Scanner;

public class PolaSegitigaDanPersegi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // pola segitiga terbalik dan persegi
        System.out.print("masukkan ukuran pola: ");
        int ukuran = input.nextInt();

        // segitiga yang terbalik
        System.out.println("\nSegitiga Terbalik: ");

        for (int i = ukuran; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // persegi
        System.out.println("\nPersegi: ");

        for (int i = 1; i <= ukuran; i++) {
            for (int j = 1; j <= ukuran; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
