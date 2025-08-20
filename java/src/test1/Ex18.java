package test1;

import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n, soma = 0;
		
		System.out.println("Digite um número inteiro positivo");
		n = scan.nextInt();
		
		for (int i = 1; i <= n; i++) {
			soma += i;
			
		}
		System.out.println("A soma de 1 até " + n + " é: " + soma);

	}
}