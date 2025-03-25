package introducao;
import java.util.Scanner;
import java.util.Locale;

public class listaNumerosNegativos {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de numeros que serao digitados: ");
        int n = sc.nextInt();

        double[] vect = new double[n];

        for (int i = 0; i < vect.length; i++) {
            vect[i] = sc.nextDouble();
        }

        System.out.println("Numeros negativos:");
        for (int i = 0; i < vect.length; i++) {
            if (vect[i] < 0){
                System.out.println(vect[i]);
            }
        }

        sc.close();
    }
}
