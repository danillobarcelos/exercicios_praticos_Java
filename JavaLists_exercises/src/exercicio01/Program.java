package exercicio01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<Integer> list = new ArrayList<>();
		
		System.out.print("Quantos números você deseja inserir na lista? ");
		int n = sc.nextInt();
		
		System.out.println("Digite abaixo os números: ");
		for(int i = 0; i<n ; i++) {
			int numero = sc.nextInt();
			list.add(numero);
		}
		System.out.print("A soma de todos esses números é: ");
		int soma = 0;
		for(Integer i : list) {
			soma += i;
		}
		System.out.println(soma);
		
		sc.close();
	}
}
