package introducao;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class listas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        List<String> list = new ArrayList<>();

        int x = input.nextInt();
        input.nextLine();

        String name;
        for (int i = 0; i < x; i++) {

            name = input.nextLine();

            list.add(name);
        }

        System.out.println("===============================");

        for(String x2 : list){
            System.out.println(x2);
        }

        System.out.println("===============================");

        char af;

        do {

            System.out.println("Deseja add mais? ");
            af = Character.toUpperCase(input.next().charAt(0));

            input.nextLine();

            switch (af) {
                case 'S':
                    System.out.println("Quantos? ");
                    x = input.nextInt();

                    input.nextLine();
                    for (int i = 0; i < x; i++) {
                        name = input.nextLine();
                        list.add(name);
                    }
                    break;

                case 'N':
                    System.out.println("Ok");
                    break;

            }

            if(af != 'N' && af != 'S'){
                System.out.println("Resposta invalida, digite 'SIM' ou 'NAO': ");
            }
        } while(af != 'N');

        System.out.println("=====================");
        System.out.println("Lista final:");
        for(String x2 : list){
            System.out.println(x2);
        }

        input.close();
    }
}
