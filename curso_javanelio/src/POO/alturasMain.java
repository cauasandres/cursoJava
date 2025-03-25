package POO;
import java.util.Locale;
import java.util.Scanner;
import POO.AlturasEntities.Entities;

public class alturasMain {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String name;
        double height, avgHeight = 0, minors = 0, percentMinors = 0;
        int age;

        System.out.print("Digite a quantidade de pessoas que vai inserir: ");
        int n = sc.nextInt();


        Entities[] vect = new Entities[n];

        int i2 = 0;
        for (int i = 0; i < vect.length; i++) {
            i2 += 1;
            sc.nextLine();
            System.out.printf("Dados da %da pessoa: \n", i2);
            System.out.print("Nome: ");
            name = sc.nextLine();
            System.out.print("Altura: ");
            height = sc.nextDouble();
            System.out.print("Age: ");
            age = sc.nextInt();

            vect[i] = new Entities(name, height, age);
        }

        for (int i = 0; i < vect.length; i++) {
            avgHeight += vect[i].Average(vect[i].getHeight(), n);
        }

        for (int i = 0; i < vect.length; i++) {
            if (vect[i].getAge() < 16){
                minors++;
            }
            percentMinors = vect[i].AverageMinors(minors, n);
        }

        System.out.println();
        System.out.printf("Altura media: %.2f\n", avgHeight);
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", percentMinors);

        for (int i = 0; i < vect.length; i++) {
            if (vect[i].getAge() < 16){
                System.out.println(vect[i].getName());
            }
        }

        sc.close();
    }
}
