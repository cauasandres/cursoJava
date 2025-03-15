package introducao;
import java.util.Scanner;

public class senhaUsuario {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int senha, password = 0;

		// Registrar senha
		System.out.print("Digite a senha que deseja:  ");
		senha = sc.nextInt();
		System.out.println("Senha registrada com sucesso!");
		System.out.println("------------------------------------");

		// Login com senha registrada
		System.out.print("Digite a senha: ");
		while (senha != password) {
			password = sc.nextInt();
			if (senha != password) {
				System.out.print("Senha incorreta! Tente novamente: ");
			}
		}
		System.out.println("Senha correta!");

		sc.close();

	}

}
