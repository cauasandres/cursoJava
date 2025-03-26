package POO;
import java.util.Scanner;
import POO.NumerosParesEntities.Entities;

public class numerosPares {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Quantos numeros serao digitados? ");
        int n = input.nextInt();
        Entities[] vect = new Entities[n];

        int number;
        for (int i = 0; i < vect.length; i++) {
            number = input.nextInt();
            vect[i] = new Entities(number);
        }

        System.out.println();
        System.out.println("Numeros pares: ");

        int i2 = 0;
        for (int i = 0; i < vect.length; i++) {
            if (vect[i].CalculoPar(vect[i].getNumber()) == 0){
                System.out.println(vect[i].getNumber());
                i2++;
            }
        }

        System.out.println("Quantidade de pares: " + i2);

        input.close();
    }
}
