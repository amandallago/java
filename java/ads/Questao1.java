package org.lpa.ads;

import java.util.Scanner;

public class Questao1 {
		public static void mostrarResultado(String nome, double media) {
		
			if (media >= 7) {
				System.out.println("Parabéns, " + nome + ", você foi aprovado!");
				
			} else if (media >= 4) {
				System.out.println(nome + ", apresente - se para a prova final.");
			} else {
				System.out.println(nome + ", infelizmente você não atingiu a média mínima.");
			}
		}
		
		public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite a quantidade de alunos da turma ");
		int quantidadeAlunos = scan.nextInt();
		
		for (int i = 0; i < quantidadeAlunos; i++) {
		System.out.println("Digite o nome do aluno ");
		String nome = scan.next();
		double somaNotas = 0;
		
		for (int j = 1; j <=4; j++) {
		System.out.println("Digite a nota " + j + "do aluno: ");
		double nota = scan.nextDouble();
		somaNotas += 0;
		}
		
		scan.next();
		double media = somaNotas / 4;
		mostrarResultado(nome, media);
		
		}
		
		scan.close();
	}	
}