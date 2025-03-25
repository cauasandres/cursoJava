package POO;
import java.util.Scanner;
import java.util.Locale;
import POO.ArraysProductsEntities.ArraysProductsEntities;

public class arraysProducts {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        ArraysProductsEntities[] product = new ArraysProductsEntities[n];

        for (int i = 0; i < product.length; i++) {
            sc.nextLine();
            String name = sc.nextLine();
            double price = sc.nextDouble();
            product[i] = new ArraysProductsEntities(name, price);
        }

        double sum = 0;
        for (int i = 0; i < product.length; i++) {
            sum += product[i].getPrice();
        }

        double avg = sum / n;

        System.out.printf("Average price: %.2f", avg);

        sc.close();
    }
}
