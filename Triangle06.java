import java.util.Scanner;
public class Triangle06 {
    public static void main(String[] args) {
        Scanner input6 = new Scanner(System.in);
        System.out.print("Masukkan nilai N = ");
        int N = input6.nextInt();
        int i = 1;
        while (i <= N ) {
            int j = 0;
            while (j < i) {
                System.out.print("*");
                j++;
            }
            i++;
            System.out.println();
        }
        input6.close();
    }
}