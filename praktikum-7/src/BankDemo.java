public class BankDemo {
    public static void main(String[] args) {

        RekeningBank rek = new RekeningBank("001", "Budi", 100000);

        rek.setor(50000);   // valid
        rek.tarik(30000);   // valid
        rek.tarik(500000);  // ditolak, saldo tidak cukup
        rek.setor(-1000);   // ditolak, jumlah tidak valid

        System.out.println("Saldo akhir: " + rek.getSaldo());
    }
}