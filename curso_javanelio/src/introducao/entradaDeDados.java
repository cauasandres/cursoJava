package introducao;
import java.util.Locale;
import java.util.Scanner;

public class entradaDeDados {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner vr = new Scanner(System.in);
		
		String nome, s1, s2, s3;
		int x;
		double y;
		
		nome = vr.nextLine();
		x = vr.nextInt();
		y = vr.nextDouble();
		vr.nextLine();
		s1 = vr.nextLine();
		s2 = vr.nextLine();
		s3 = vr.nextLine();
		
		System.out.println(nome);
		System.out.println(x);
		System.out.println(y);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		vr.close();
	}

}
