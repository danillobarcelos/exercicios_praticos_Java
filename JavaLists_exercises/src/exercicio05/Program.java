package exercicio05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<Integer> list = new ArrayList<>();
		List<Integer> newList = new ArrayList<>();
		
		System.out.print("Quantos números deseja inserior? ");
		int n = sc.nextInt();
		
		for(int i = 0 ; i < n ; i++) {
			int numero = sc.nextInt();
			list.add(numero);
		}
		
		for(int i = list.size() - 1; i >= 0 ; i--) {
			newList.add(list.get(i));			
		}
		
		System.out.println(list);
		System.out.println("---------------------");
		System.out.println(newList);

		
		
		
		
		
		sc.close();
	}

}
