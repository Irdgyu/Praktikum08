import java.util.Scanner;

public class Porseni06 {
    public static void main(String[] args) {
        Scanner input6 = new Scanner(System.in);

        System.out.print("Masukkan jumlah Politeknik yang mendaftar: ");
        int jumlahPoliteknik = input6.nextInt();
        input6.nextLine(); 
        String data = "\n=== Porseni se-Politeknik Indonesia Tahun 2024 ===\n";

        for (int j = 1; j <= jumlahPoliteknik; j++) {
            System.out.print("\nMasukkan nama Politeknik " + j + ": ");
            String namaPoliteknik = input6.nextLine();
            data += "\nPoliteknik: " + namaPoliteknik + "\n";

            data += "Cabang Olahraga: Badminton\n";
            System.out.println("\nMasukkan nama untuk cabang Badminton:");
            for (int i = 1; i <= 5; i++) {
                System.out.print("Nama atlet " + i + ": ");
                String namaAtlet = input6.nextLine();
                data += "- Atlet " + i + ": " + namaAtlet + "\n";
            }
            data += "Cabang Olahraga: Tenis Meja\n";
            System.out.println("\nMasukkan nama untuk cabang Tenis Meja:");
            for (int i = 1; i <= 5; i++) {
                System.out.print("Nama atlet " + i + ": ");
                String namaAtlet = input6.nextLine();
                data += "- Atlet " + i + ": " + namaAtlet + "\n";
            }
            data += "Cabang Olahraga: Basket\n";
            System.out.println("\nMasukkan nama untuk cabang Basket:");
            for (int i = 1; i <= 5; i++) {
                System.out.print("Nama atlet " + i + ": ");
                String namaAtlet = input6.nextLine();
                data += "- Atlet " + i + ": " + namaAtlet + "\n";
            }
            data += "Cabang Olahraga: Bola Voli\n";
            System.out.println("\nMasukkan nama untuk cabang Bola Voli:");
            for (int i = 1; i <= 5; i++) {
                System.out.print("Nama atlet " + i + ": ");
                String namaAtlet = input6.nextLine();
                data += "- Atlet " + i + ": " + namaAtlet + "\n";
            }
        }
        System.out.println(data);
        
        input6.close();
    }
}