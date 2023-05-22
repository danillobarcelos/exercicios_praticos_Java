package exercicio02.application;

import java.util.Scanner;

import exercicio02.entities.Calculadora;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Calculadora calculadora;
		
		System.out.println("Digite dois números inteiros: ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		calculadora = new Calculadora();
		
		System.out.println("A soma desses dois números é: " + calculadora.Soma(x, y));
		
		System.out.println("\nDigite dois números reais: ");
		double xd = sc.nextDouble();
		double yd = sc.nextDouble();
		System.out.println("A soma desses dois números é: " + calculadora.Soma(xd, yd));
		
		System.out.println("\nDigite três números inteiros: ");
		x = sc.nextInt();
		y = sc.nextInt();
		int z = sc.nextInt();
		System.out.println("A soma desses dois números é: " + calculadora.Soma(x, y, z));
		
		System.out.println("\nDigite três números reais: ");
		xd = sc.nextDouble();
		yd = sc.nextDouble();
		double zd = sc.nextDouble();
		System.out.println("A soma desses dois números é: " + calculadora.Soma(xd, yd, zd));
		
		sc.close();
	}

}
