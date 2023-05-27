package exercicio09;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<Integer> list01 = new ArrayList<>();
		List<Integer> list02 = new ArrayList<>();
		
		System.out.print("Quantos itens terá a sua primeira lista? ");
		int n = sc.nextInt();
		for(int i = 0 ; i < n ; i++) {
			int numero = sc.nextInt();
			list01.add(numero);
		}
		
		System.out.print("Quantos itens terá a sua segunda lista? ");
		n = sc.nextInt();
		for(int i = 0 ; i < n ; i++) {
			int numero = sc.nextInt();
			list02.add(numero);
		}
		
		List<Integer> newList = new ArrayList<>();
		newList.addAll(list01);
		newList.addAll(list02);
		
		System.out.println("A nova lista concatenada é: " + newList);
		
		
		
		
		
		sc.close();
	}

}
