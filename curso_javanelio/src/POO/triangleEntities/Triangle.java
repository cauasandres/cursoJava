package POO.triangleEntities;

public class Triangle {  // Atributos do triangulo
    public double a;
    public double b;
    public double c;

    public double area(){  // Calcular área do triangulo
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
