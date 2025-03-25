package POO.SomaVetorEntities;

public class Entities {
    private double number, avg, sum;

    public Entities(double number){
        this.number = number;
    }

    public double getNumber(){
        return number;
    }

    public double sum(double number){
        return sum += number;
    }

    public double average(int n){
        return avg += sum / n;
    }

}
