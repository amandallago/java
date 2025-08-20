package org.lpa.ads;

import java.util.Scanner;

public class Questao7 {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int num1, num2;
	System.out.println("Digite o primeiro número");
	num1 = scan.nextInt();
	System.out.println("Digite o segundo número");
	num2 = scan.nextInt();
	
	int opcao;
	
	do {
		System.out.println("Menu:");
		System.out.println("1 – Soma");
		System.out.println("2 – Subtração");
		System.out.println("3 – Multiplicação");
		System.out.println("4 – Divisão");
		System.out.println("5 – Trocar valores");
		System.out.println("6 – Sair");
		System.out.println("Digite a opção escolhida: ");
		opcao = scan.nextInt();
		
		switch (opcao) {
		 	case 1:
             System.out.println("Resultado da soma: " + (num1 + num2));
             	break;
		 	case 2:
		 		System.out.println("Resultado da subtração: " + (num1 - num2));
		 		break;
		 	case 3: 
		 		System.out.println("Resultado da multiplicação: " + (num1 * num2));
		 		break;
		 	case 4:
		 		System.out.println("Resultado da divisão: " + (num1 / num2));
		 		break;
		 	case 5: 
		 		System.out.println("Digite o primeiro número");
		 		num1 = scan.nextInt();
		 		System.out.println("Digite o segundo número");
		 		num2 = scan.nextInt();
		 		break;
		 	 case 6:
                 System.out.println("Saindo do programa.");
                 break;
             default:
                 System.out.println("Opção inválida. Tente novamente.");
                 break;
		}
		
		} while (opcao != 6);

			scan.close();
		
	}
}