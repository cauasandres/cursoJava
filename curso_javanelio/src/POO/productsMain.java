package POO;
import java.util.Scanner;
import java.util.Locale;
import POO.productsEntities.Products;


public class productsMain {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.println("Enter products data:");
        System.out.print("Name: ");
        String name = input.nextLine();
        System.out.print("Price: ");
        double price = input.nextDouble();
        Products products = new Products(name, price);

        System.out.println(products);

        System.out.println();
        System.out.print("Enter the number of products to be added in stock: ");
        int quantity = input.nextInt();
        products.addProducts(quantity);
        System.out.println("Updated data: " + products);

        System.out.println();

        System.out.print("Enter the number of products to be removed in stock: ");
        quantity = input.nextInt();
        products.removeProducts(quantity);
        System.out.println("Updated data: " + products);

        input.close();
    }
}
