package POO.ArraysProductsEntities;

public class ArraysProductsEntities {
    private String name;
    private double price;

    public ArraysProductsEntities(String name, double price){
        this.name = name;
        this.price = price;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public String toString() {
        return "Name: " + name + "\n" +
                "Price: " + price;

    }

}
