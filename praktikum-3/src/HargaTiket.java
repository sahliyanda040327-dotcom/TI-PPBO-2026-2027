import java.util.Scanner;

public class HargaTiket {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan umur: ");
        int umur = input.nextInt();

        System.out.print("Apakah mahasiswa? (true/false): ");
        boolean mahasiswa = input.nextBoolean();

        int harga;

        if (mahasiswa && umur < 25) {
            harga = 25000;
        } else if (umur < 12) {
            harga = 20000;
        } else {
            harga = 40000;
        }

        System.out.println("Harga tiket: Rp" + harga);

        input.close();
    }
}