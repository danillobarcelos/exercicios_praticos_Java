package exercicio04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<Integer> list = new ArrayList<>();
		
		System.out.print("Quantos números serão inseridos? ");
		int n = sc.nextInt();
		
		System.out.println("Digite os números: ");
		for(int i = 0 ; i < n ; i++) {
			int numero = sc.nextInt();
			list.add(numero);
		}
		
		int maior = 0;
		for(int i = 0 ; i < n ; i++) {
			if(list.get(i) > maior) {
				maior = list.get(i);
			}
		}
		
		System.out.println("\nO maior número inserido foi: " + maior);
		
		
		sc.close();
	}

}
