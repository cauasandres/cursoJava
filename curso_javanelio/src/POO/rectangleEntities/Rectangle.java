package POO.rectangleEntities;

public class Rectangle {
    public double height;
    public double widith;

    public double area(){
        return height * widith;
    }

    public double perimeter(){
        return 2 * (height + widith);
    }

    public double diagonal(){
        return Math.sqrt( Math.pow(height, 2) + Math.pow(widith, 2) );
    }

    public String toString(){
        return "AREA: " + String.format("%.2f%n",area())
                + "PERIMETER: " + String.format("%.2f%n", perimeter())
                + "DIAGONAL " + String.format("%.2f%n", diagonal());
    }
}
