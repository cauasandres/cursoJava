package introducao;
import java.util.Scanner;

public class function {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Escreva três números:");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        int higher = max(a, b, c);
        showResulte(higher);

    }

    public static int max(int a, int b, int c){
        int aux;
        if (a > b && a > c){
            aux = a;
        } else if (b > c){
            aux = b;
        } else{
            aux = c;
        }
        return aux;
    }

    public static void showResulte(int value){
        System.out.println("Higher = " + value);
    }

}
