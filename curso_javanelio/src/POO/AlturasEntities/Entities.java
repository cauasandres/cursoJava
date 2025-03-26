package POO.AlturasEntities;

public class Entities {
    private String name;
    private double height, avg;
    private int age;

    public Entities(String name, double height, int age){
        this.age = age;
        this.name = name;
        this.height = height;
    }

    public String getName(){
        return name;
    }

    public double getHeight(){
        return height;
    }

    public int getAge(){
        return age;
    }

    public double Average(double height, int n){
        return avg = height / n;
    }

    public static double AverageMinors(double minors, int n){
        return (minors / n) * 100;
    }
}
