package test1;

import java.util.Scanner;

public class Ex21 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int cont = 0, num;
		
		while (cont == 1) { 
		System.out.println("Digite um número inteiro positivo");
		num = scan.nextInt();
		
		switch (num) {
		
		case 1: System.out.println("Digite 1 para contar de  até o número ");
			break;
		case 2: System.out.println("Digite 2 para contar o número até 1 ");
			break;
		}	
		for (int i=1; i<2; i++){
			if (num %2==0) { 
				System.out.println("O número é par");
			} else {
				System.out.println("O número é ímpar");
				}
			}	
		}
	}
}