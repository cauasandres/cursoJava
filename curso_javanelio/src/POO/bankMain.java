package POO;

import java.util.Scanner;
import java.util.Locale;

import POO.bankEntities.Bank;

public class bankMain {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        Bank config = new Bank();

        System.out.println("""
                Welcome to Sandres Bank!
                 \
                Let's register in our bank.
                Enter your name:\s""");

        config.name = input.nextLine(); // Custumer enter the name
        String firstName = config.name.split(" ")[0];
        String formattedName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1).toLowerCase(); // Program takes only the first name

        System.out.println();
        System.out.printf("Nice to meet you, %s!\n", formattedName);

        System.out.println();
        System.out.print("Register your password (just numbers): ");
        config.password = input.nextInt(); // CUSTOMER REGISTRATION PASSWORD

        System.out.print("What value do you want to deposit: ");
        config.bankBalance = input.nextDouble(); // Customer deposits a value

        System.out.println("Digite a senha");
        int password = input.nextInt();

        for(int i = 2; password != config.password && i != 0; i--){  // password test
            System.out.printf("Senha incorreta, restam %d tentativas: ", i);
            password = input.nextInt();


        }

        System.out.println();
        if (config.password == password){
            System.out.printf("Available balance: %.2f\n", config.bankBalance);
        }


        input.close();
    }
}
