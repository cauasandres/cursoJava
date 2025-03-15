package POO;
import java.util.Locale;
import POO.rectangleEntities.Rectangle;

import java.util.Scanner;

public class rectangleMain {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        Rectangle rectangle = new Rectangle();

        System.out.println("Enter the height and width of the rectangle:");
        rectangle.height = input.nextDouble();
        rectangle.widith = input.nextDouble();

        System.out.println(rectangle);
    }
}
