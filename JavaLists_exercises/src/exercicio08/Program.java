package exercicio08;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		List<Integer> list = new ArrayList<>();
		
		System.out.print("Quantos números deseja inserir? ");
		int n  = sc.nextInt();
		
		System.out.println("Digite os números abaixo");
		for(int i = 0 ; i < n ; i++) {
			int numero = sc.nextInt();
			list.add(numero);
		}
		
		
		boolean ordemCrescente = true;
		for(int i = 0 ; i < list.size() - 1 ; i++) {
			if(list.get(i) > list.get(i + 1)) {
				ordemCrescente = false;
				break;
			}
		}
		System.out.println("Ordem crescente? " + ordemCrescente);
		
		
		sc.close();
	}

}
