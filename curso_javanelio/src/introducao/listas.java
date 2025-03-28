package introducao;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class listas {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Arnaldo");
        list.add("Claudia");
        list.add("Majoroca");
        list.add("Anna");
        list.add("Caua");
        list.add("Marcos");


        for(String x : list){
            System.out.println(x);
        }
        System.out.println("===================================");

        list.removeIf(x -> x.charAt(0) == 'A');
        for (String x : list){
            System.out.println(x);
        }
        System.out.println("===================================");

        List<String> filter = list.stream().filter(x -> x.charAt(0) == 'M').collect(Collectors.toList());
        for (String x : filter){
            System.out.println(x);
        }


    }
}
