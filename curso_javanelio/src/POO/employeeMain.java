package POO;
import java.util.Scanner;
import java.util.Locale;
import POO.emploeyeeEntities.Emploeyee;

public class employeeMain {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        Emploeyee emploeyee = new Emploeyee();

        System.out.print("Name: ");
        emploeyee.name = input.nextLine();
        System.out.print("Gross Salary: ");
        emploeyee.grossSalary = input.nextDouble();
        System.out.print("Tax: ");
        emploeyee.tax = input.nextDouble();

        System.out.println(emploeyee);

        System.out.print("Which percentage to increase salary? ");
        double increaseSalary = input.nextDouble();
        emploeyee.increaseSalary(increaseSalary);

        System.out.println("Updated data: " + emploeyee);


        input.close();
    }
}
