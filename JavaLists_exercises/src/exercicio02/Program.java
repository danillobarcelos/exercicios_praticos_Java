package exercicio02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos números serão inseridos na lista? ");
		int n = sc.nextInt();

		List<Integer> list = new ArrayList<>();

		System.out.println("Insira os números desejados: ");
		for (int i = 0; i < n; i++) {
			int numero = sc.nextInt();
			list.add(numero);
		}

		System.out.print("A média dos números digitados é: ");
		double soma = 0;
		for (Integer i : list) {
			soma += i;
		}
		System.out.print(soma/n);

		sc.close();
	}

}
