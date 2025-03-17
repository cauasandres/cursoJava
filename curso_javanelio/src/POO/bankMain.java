package POO;
import POO.bankEntities.Bank;
import java.util.Scanner;
import java.util.Locale;


public class bankMain {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account number: ");
        int account = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter account holder: ");
        String name = sc.nextLine();
        Bank config = new Bank(account, name);

        System.out.print("Is there na initial deposit (y/n)? ");
        String resp = sc.nextLine();

        double balance;
        if (resp.equals("y")){
            System.out.print("Enter initial deposit value: ");
            balance = sc.nextDouble();
            config.setBalanceDeposit(balance);
        }

        System.out.println();
        System.out.println("Account data:\n" + config);

        System.out.print("Enter a deposit value: ");
        balance = sc.nextDouble();
        config.setBalanceDeposit(balance);

        System.out.println();
        System.out.println("Updated data:\n" + config);

        System.out.print("Enter a withdraw value: ");
        balance = sc.nextDouble();
        config.setBalanceWithdraw(balance);

        System.out.println("Updated data\n" + config);
    }
}
