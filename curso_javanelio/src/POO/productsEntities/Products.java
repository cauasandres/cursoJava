package POO.productsEntities;

public class Products {
    public String name;
    public int quantity;
    public double price;

    public Products(String name, double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public Products(String name, double price){
        this.name = name;
        this.price = price;
    }

    public double totalValueInStock(){
        return quantity * price;
    }

    public void addProducts(int quantity){
        this.quantity += quantity;
    }

    public void removeProducts(int quantity){
        this.quantity -= quantity;
    }

    public String toString(){
        return "Product data: " + name +
                ", $ " + String.format("%.2f", price) +
                ", quantity: " + quantity +
                ", Total: " + String.format("$ %.2f", totalValueInStock());
    }
}
