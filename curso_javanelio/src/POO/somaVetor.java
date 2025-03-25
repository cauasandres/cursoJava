package POO;
import java.util.Scanner;
import java.util.Locale;
import POO.SomaVetorEntities.Entities;

public class somaVetor {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        Entities[] vect = new Entities[n];

        for (int i = 0; i < vect.length; i++) {
            double number = input.nextDouble();
            vect[i] = new Entities(number);
        }

        double sum = 0;
        for (int i = 0; i < vect.length; i++) {
            sum += vect[i].sum(vect[i].getNumber());

        }

        double avg = 0;
        for (int i = 0; i < vect.length; i++) {
            avg += vect[i].average(vect.length);
        }

        System.out.println("=================================================");

        System.out.print("VALORES: ");
        for (int i = 0; i < n; i++) {
            System.out.print(vect[i].getNumber() + "  ");
        }

        System.out.println();
        System.out.println("SOMA: " + sum + "\n" +
                           "Media: " + avg);

        input.close();
    }
}
