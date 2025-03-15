package introducao;
import java.util.Scanner;

public class sistemaBanco {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int passwordReg, passwordLogin, resp;
        float deposit, saque, saldo = 0;

        // Registro da senha
        System.out.print("Registre a sua senha numérica: ");
        passwordReg = input.nextInt();
        System.out.println("----------------------------------------------------");

        // Login
        while(true) {
            System.out.print("Digite sua senha para acessar o sistema: ");
            passwordLogin = input.nextInt();
            if (passwordLogin == passwordReg) {
                System.out.println("Acesso permitido!");
                break;

            } else {
                System.out.println("Senha incorreta! Tente novamente.");
            }
        }

        // Menu principal
        do {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1. Depósito");
            System.out.println("2. Saque");
            System.out.println("3. Consultar saldo");
            System.out.println("4. Sair");
            System.out.print("Opção: ");
            resp = input.nextInt();

            switch (resp) {
                case 1: // Depósito
                    System.out.print("Digite o valor do depósito: ");
                    deposit = input.nextFloat();
                    if (deposit > 0) {
                        saldo += deposit;
                        System.out.printf("Depósito realizado! Seu saldo atual: R$ %.2f%n", saldo);
                    } else {
                        System.out.println("Valor inválido! Tente novamente.");
                    }
                    break;

                case 2: // Saque
                    System.out.print("Digite o valor do saque: ");
                    saque = input.nextFloat();
                    if (saque > 0 && saque <= saldo) {
                        saldo -= saque;
                        System.out.printf("Saque realizado! Seu saldo atual: R$ %.2f%n", saldo);
                    } else {
                        System.out.println("Saldo insuficiente ou valor inválido!");
                    }
                    break;

                case 3: // Consultar saldo
                    System.out.printf("Seu saldo atual é: R$ %.2f%n", saldo);
                    break;

                case 4: // Sair
                    System.out.println("Sistema encerrado. Obrigado por utilizar nosso banco!");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (resp != 4);


        input.close();
    }
}