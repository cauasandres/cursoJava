package POO;
import java.util.Scanner;
import POO.triangleEntities.Triangle;

public class triangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Triangle x, y;
        x = new Triangle();
        y = new Triangle();

        System.out.println("Write the sides of the triangle A:");
        x.a = input.nextDouble();
        x.b = input.nextDouble();
        x.c = input.nextDouble();

        System.out.println("Write the sides of the triangle B:");
        y.a = input.nextDouble();
        y.b = input.nextDouble();
        y.c = input.nextDouble();

        double areaX = x.area();
        double areaY = y.area();

        System.out.printf("Triangle X area: %.2f%n", areaX);
        System.out.printf("Triangle Y area: %.2f%n", areaY);

        if (areaX > areaY){
            System.out.println("Larger area: X");
        } else {
            System.out.println("Larger area: Y");
        }
    }
}
