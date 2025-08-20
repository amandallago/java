package test1;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		String nome;
		int num;
		System.out.println("Escolha uma das opções");
		num = scan.nextInt();
		
		switch (num) {
		case 1: System.out.println("Cadastrar usuário");
		nome = scan.next();
		break;
		case 2: System.out.println("Excluir usuário");
		break;
		case 3: System.out.println("Atualizar dados");
		nome = scan.next();
		break;
		case 4: System.out.println("Sair");
		break;
		default: System.out.println("Valor inválido");
		}
		}		
}