package introducao;
import java.util.Scanner;

public class saqueBanco {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int saque, passwordReg, passwordLogin;

		// Registrar senha
		System.out.print("Digite a senha numérica que deseja:");
		passwordReg = sc.nextInt();
		System.out.println("------------------------------------------");

		// Perguntar se deseja fazer um saque
		System.out.println("Deseja fazer um saque?");
		System.out.println("Se sim digite '1', se não '2'");
		saque = sc.nextInt();
		
		switch (saque) {
			//case 1 (caso o usuário digite 1 irá pedir a senha registrada para efetuar o saque)
		case 1:
			System.out.print("Digite sua senha:");
			passwordLogin = sc.nextInt();
			if (passwordLogin == passwordReg) {
				System.out.println("Saque aprovado!");
			}
			else {
			for(int i = 2; (passwordLogin != passwordReg && i != 0); i-= 1) {
				System.out.printf("Senha incorreta. Restam %d tentativas:", i);
				passwordLogin = sc.nextInt();
				if (passwordLogin == passwordReg) {
					System.out.println("Saque aprovado!");
				}
				else if (i == 1){
					System.out.println("O limite de erro de senha excedeu, sua conta foi bloqueada!");
				}
			}
		}
			break;
			// case 2 (o sistema encerra)
		case 2:
			System.out.println("Ok!");
			break;
		
		}
		
	}

}
