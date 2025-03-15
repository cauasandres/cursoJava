package POO;
import java.util.Scanner;
import java.util.Locale;
import POO.converterEntities.CurrencyConverter;

public class converterMain {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("What's the dollar price? ");
        double dollar = input.nextDouble();
        System.out.print("How manny dollars will be bought");
        double money = input.nextDouble();

        double amount = CurrencyConverter.calculator(dollar, money);
        System.out.printf("Amount to be paid in reais: %.2f", amount);

        input.close();
    }
}
