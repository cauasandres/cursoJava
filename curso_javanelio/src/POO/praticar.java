package POO;
import java.util.ArrayList;
import java.util.Scanner;



public class praticar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        int[][] matriz = new int[n][n];
        int total=0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = input.nextInt();
                total += matriz[i][j];
            }
        }

        System.out.println(total);

        input.close();
    }
}
