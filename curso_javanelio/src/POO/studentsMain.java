package POO;

import java.util.Scanner;
import java.util.Locale;

import POO.studentsEntities.Students;

public class studentsMain {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        Students student = new Students();

        System.out.print("Name: ");
        student.name = input.nextLine();
        System.out.print("Enter the grades:");
        student.grade1 = input.nextDouble();
        student.grade2 = input.nextDouble();
        student.grade3 = input.nextDouble();

        if (student.finalGrade() > 60) {
            System.out.println("PASS");
        } else {
            System.out.println("FAILED");
            System.out.printf("Missing points: %.2f", student.missingPoints());
        }
    }
}
