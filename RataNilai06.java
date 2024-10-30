import java.util.Scanner;

public class RataNilai06 {
    public static void main(String[] args) {
        Scanner input6 = new Scanner(System.in);

        int i, j;
        float nilai, totalNilai, rataNilai;

        i = 1;
        while (i <= 5) {
            totalNilai = 0;
            System.out.println("Input Nilai Mahasasiswa ke " + i);
            for (j = 1; j <= 5; j++) {
                System.out.print("Nilai ke-" + j + " = ");
                nilai = input6.nextInt();
                totalNilai += nilai;
            }
            rataNilai = totalNilai/5;
            System.out.println("Rata-rata Nilai Mahasiswa ke " + i + " adalah " + rataNilai);
            i++;
        }
    }
}