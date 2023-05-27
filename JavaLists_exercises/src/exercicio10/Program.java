package exercicio10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		List<Integer> list = new ArrayList<>();
		
		System.out.print("Quantos números serão inseridos? ");
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			int numero = sc.nextInt();
			list.add(numero);
		}
		
		System.out.print("Escolha um número: ");
		int num = sc.nextInt();
		
		int soma = 0;
		for(int i = 0; i < n ; i++) {
			if(list.get(i) == num) {
				soma++;
			}
		}
		System.out.println("O número escolhido se repete "+soma+" vez(es) na lista");
		
		
		
		
		
		
		sc.close();
	}

}
