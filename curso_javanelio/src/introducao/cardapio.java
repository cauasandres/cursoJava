package introducao;
import java.util.Scanner;

public class cardapio {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int cod, qntd;
		double precoTotal = 0;

		System.out.print("Escreva o código e a quantidade: ");
		cod = sc.nextInt();
		qntd = sc.nextInt();

		switch (cod) {
		case 1:
			precoTotal = qntd * 4;
			break;
		case 2:
			precoTotal = qntd * 4.50;
			break;
		case 3:
			precoTotal = qntd * 5;
			break;
		case 4:
			precoTotal = qntd * 2;
			break;
		case 5:
			precoTotal = qntd * 1.50;
			break;
		}

		System.out.printf("Total: R$%.2f", precoTotal);

		sc.close();
	}

}
