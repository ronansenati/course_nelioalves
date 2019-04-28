package Application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class S4Aula62ExercFix {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account account;

		// Entrada de dados
		System.out.println("Informe o n�mero da conta:");
		int numeroConta = sc.nextInt();
		System.out.println("Informe o nome do correntista:");
		sc.nextLine();
		String nomeCorrentista = sc.nextLine();
		System.out.println("Deseja informar valor de dep�sito? (Sim ou N�o)");
		char response = sc.next().charAt(0);

		if (response == 'S') {
			System.out.println("Informe o valor do dep�sito inicial:");
			double valorInicialDeposito = sc.nextDouble();
			account = new Account(numeroConta, nomeCorrentista, valorInicialDeposito);
		} else {
			account = new Account(numeroConta, nomeCorrentista);
		}

		// Mostrar dados
		System.out.println();
		System.out.println("Dados da conta:\n" + account);

		System.out.println();
		System.out.print("Digite o valor do dep�sito:");
		double depositValue = sc.nextDouble();
		account.deposit(depositValue);

		System.out.println();
		System.out.println("Atualiza��o dos dados da conta:\n" + account);

		System.out.println();
		System.out.print("Digite o valor do Saque:");
		double withdrawValue = sc.nextDouble();
		account.withdraw(withdrawValue);

		System.out.println("Atualiza��o dos dados da conta:\n" + account);

		sc.close();
	}

}
