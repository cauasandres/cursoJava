package POO.converterEntities;

public class CurrencyConverter {
    public static final double IOF = 0.06;

    public static double calculator(double dollar, double money){
        return dollar * money * IOF + dollar * money;

    }

}
