import java.util.Scanner;

public class TabelPerkalian  {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //tabel perkalian
        System.out.print("masukan bilangan: ");
        int bilangan = input.nextInt();

        System.out.println("\nTabel Perkalian " + bilangan);

        for (int i = 1; i <= 10; i++) {
            System.out.println(bilangan + " x " + i + " = " + (bilangan * i));
        }

        input.close();
    }
}

