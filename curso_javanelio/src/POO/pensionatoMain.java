package POO;
import java.util.Scanner;
import POO.PensionatoEntities.Entities;

public class pensionatoMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String name, email;
        int room, n;
        Entities [] vect = new Entities[9];

        System.out.print("How many rooms will be rented? ");
        n = input.nextInt();
        System.out.println();

        int i2 = 0;
        for (int i = 0; i < n; i++) {
            i2++;
            input.nextLine();
            System.out.printf("Rent #%d\n", i2);
            System.out.print("Name: ");
            name = input.nextLine();
            System.out.print("Email: ");
            email = input.nextLine();
            System.out.print("Room: ");
            room = input.nextInt();
            System.out.println();

            vect[room] = new Entities(name, email, room);
        }

        System.out.println("Busy rooms: ");
        for (int i = 0; i < vect.length; i++) {
            if (vect[i] != null){
                System.out.println(vect[i]);
            }
        }
    }
}
