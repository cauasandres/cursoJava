package POO.emploeyeeEntities;

public class Emploeyee {
    public String name;
    public double grossSalary;
    public double tax;

    public double netSalary(){
        return grossSalary - tax;
    }

    public String toString(){
        return "Employee: " + name + ", "
                + "$ " + netSalary();
    }

    public void increaseSalary(double percent){
        double increase = this.grossSalary * (percent / 100);
        this.grossSalary += increase;
    }
}
