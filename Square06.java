import java.util.Scanner;
public class Square06 {
    public static void main(String[] args) {
        Scanner input6 = new Scanner(System.in);
        System.out.print("Masukkan nilai N = ");
        int N = input6.nextInt();

        for (int iOuter = 1; iOuter <= N; iOuter++){
            for (int i = 1; i <= N; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
        input6.close();    
    }
}