package mod;

import java.util.Scanner;

public class Atividade1 {
		
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite seu nome");
		String nome = scan.next();
		mensagemBoasVindas (nome);
		scan.close();
	}	
		
	public static void mensagemBoasVindas (String nome) {	
		System.out.println("Seja bem vindo " + nome + "!");
	}
}