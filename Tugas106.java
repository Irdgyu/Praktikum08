import java.util.Scanner;

public class Tugas106 {
    public static void main(String[] args) {
        Scanner input6 = new Scanner(System.in);
        System.out.print("Masukkan nilai N = ");
        int N = input6.nextInt();

        for (int j = 1; j <= N; j++){
            for (int i = 1; i <= N; i++) {
                if (j == 1 || j == N) {
                    System.out.print(N + " ");
                }
                else {
                    if (i == 1 || i == N) {
                        System.out.print(N + " ");
                    }
                    else {
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();
        }
        input6.close();    
    }
}