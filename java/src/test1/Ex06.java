package test1;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num;
		String nome;
		
		System.out.println("Digite um número de 1 a 7");
		num = scan.nextInt();
		
		switch (num) {
		case 1:
			nome = "Segunda-feira";
			break;
		case 2:
			nome = "Terça-feira";
			break;
		case 3:
			nome = "Quarta-feira";
			break;
		case 4:
			nome = "Quinta-feira";
			break;
		case 5:
			nome = "Sexta-feira";
			break;
		case 6:
			nome = "Sábado";
			break;
		case 7:
			nome = "Domingo";
		default:
			nome = "Número invalido";
			break;
}
		System.out.println("O dia da semana é: " + nome);
	}
}