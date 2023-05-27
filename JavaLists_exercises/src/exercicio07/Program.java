package exercicio07;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
	// refazer depois implementando a lógica correta nos números primos
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		List<Integer> list = new ArrayList<>();
		List<Integer> primeNumberList = new ArrayList<>();

		System.out.print("Quantos números deseja digitar? ");
		int n = sc.nextInt();

		System.out.println("Digite os números abaixo: ");
		for (int i = 0; i < n; i++) {
			int numero = sc.nextInt();
			list.add(numero);
		}

		for (Integer i : list) {
			if (i != 2 && i % 2 != 0 && i % Math.sqrt(i) != 0 || i == 2) {
				primeNumberList.add(i);
			}
		}

		System.out.println(primeNumberList);

		sc.close();
	}

}
