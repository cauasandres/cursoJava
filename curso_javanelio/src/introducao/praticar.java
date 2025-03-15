package introducao;
import java.util.Scanner;

public class praticar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos números deseja digitar?: ");
		int num = sc.nextInt();

		int x, in=0, out=0;
		for(int i=0; i<num; i++ ){
			x = sc.nextInt();

			if(x >= 10 && x<=20){
				in += 1;
			} else{
				out += 1;
			}
		}

		System.out.println("In: " + in);
		System.out.println("Out: " + out);
	}
}
