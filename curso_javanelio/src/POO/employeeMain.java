package POO;
import java.util.Scanner;
import java.util.Locale;
import java.util.List;
import java.util.ArrayList;
import POO.emploeyeeEntities.Employee;


public class employeeMain {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        List<Employee> employee = new ArrayList<>();

        System.out.print("How many employees will be registered? ");
        int N = input.nextInt();

        for (int i = 0; i < N; i++) {
            System.out.println();
            System.out.println("Employee #" + (i + 1) + ": ");
            System.out.print("Id: ");
            Integer id = input.nextInt();
            input.nextLine();
            System.out.print("Name: ");
            String name = input.nextLine();
            System.out.print("Salary: ");
            Double salary = input.nextDouble();

            Employee list = new Employee(id, name, salary);

            employee.add(list);
        }
        System.out.println();

        System.out.print("Enter the employee id that will have salary increase: ");
        Integer idSalary = input.nextInt();
        Integer position = position(employee, idSalary);
        if (position == null){
            System.out.println("This id does not exist!");
        }
        else{
            System.out.print("Enter the percentage: ");
            double percent = input.nextDouble();
            employee.get(position).increaseSalary(percent);
        }
        System.out.println();

        System.out.println("List employee:");
        for (Employee x : employee){
            System.out.println(x);
        }

        input.close();
    }

    public static Integer position(List<Employee> list, int id){
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getId() == id){
                return i;
            }
        }
        return null;
    }
}
