package POO.bankEntities;

public class Bank {
    private final int account;
    private String name;
    private double balance;

    public Bank(int account, String name){
        this.account = account;
        this.name = name;
    }

    public int getAccount(){
        return account;
    }

    public String getName(){
        return name;
    }

    public double getBalance(){
        return balance;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setBalanceDeposit(double balance){
        this.balance += balance;
    }

    public void setBalanceWithdraw(double balance){
        this.balance = (this.balance - balance) - 5 ;
    }

    public String toString(){
        return  "Account " + account + ", " +
                "Holder: " + name + ", " +
                "Balance: " + "$ " + String.format("%.2f\n", balance);
    }
}
