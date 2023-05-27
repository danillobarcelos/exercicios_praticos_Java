package exercicio03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		List<Integer> list = new ArrayList<>();
		List<Integer> listEven = new ArrayList<>();

		System.out.print("Quantos números você irá digitar? ");
		int n = sc.nextInt();

		System.out.println("Insira os números desejado abaixo: ");
		for (int i = 0; i < n; i++) {
			int numero = sc.nextInt();
			list.add(numero);
		}

		System.out.println("Os números pares inseridos são: ");
		for (Integer i : list) {
			if (i % 2 == 0) {
				listEven.add(i);
			}
		}
		
		System.out.println(listEven);

		sc.close();
	}

}
