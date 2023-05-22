package exercicio03.application;

import java.util.Scanner;

import exercicio03.entities.ContaBancaria;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Bem-vindo(a)(e) ao banco. Para entrar, digite as seguintes informações: ");
		System.out.print("O seu nome: ");
		String nome = sc.nextLine();
		System.out.print("A sua senha: ");
		String senha = sc.nextLine();
		System.out.print("O seu saldo: ");
		double saldo = sc.nextDouble();
		
		
		ContaBancaria cliente = new ContaBancaria(nome, senha, saldo);

		System.out.println(cliente.getTitular() + ", o seu saldo é: " + cliente.getSaldo());
		System.out.println("Deseja realizar um deposito? (s/n)");
		char deseja = sc.next().charAt(0);
		
		if(deseja == 's') {
			System.out.println("Qual o valor do seu deposito? ");
			double valor = sc.nextDouble();
			cliente.depositar(valor);
			System.out.println(cliente.getTitular() + ", o seu novo saldo é: " 
					+ cliente.getSaldo());
		} else {
			System.out.println("Ok!");
		}
		
		System.out.println("Deseja realizar um saque? (s/n)");
		deseja = sc.next().charAt(0);
		if (deseja == 's') {
			System.out.println("Qual o valor do seu saque? ");
			double valor = sc.nextDouble();
			cliente.sacar(valor);
			if (cliente.getSaldo() >= 0) {
				System.out.println(cliente.getTitular() + ", o seu novo saldo é: " 
						+ cliente.getSaldo());
			}
		} else {
			System.out.println("Ok!");
		}
		
		
		sc.close();
	}

}
