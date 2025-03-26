package POO.NumerosParesEntities;

public class Entities {
    private int number;

    public Entities(int number){
        this.number = number;
    }

    public int getNumber(){
        return number;
    }

    public int CalculoPar(int number){
        return number % 2;
    }
}
