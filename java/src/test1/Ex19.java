package test1;

import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int notas = 0, menu, media = 0, sair, cont = 0, nota1, nota2, nota3;
		
		while (cont == 0) {
		System.out.println("Digite 1 para cadastrar notas, 2 para ver média e situação do aluno, ou 3 para sair" );
		menu = scan.nextInt();
		
		switch (menu) {
		case 1: System.out.println("Cadastrar notas"); 
		System.out.println("Digite as três notas");
		nota1 = scan.nextInt();
		nota2 = scan.nextInt();
		nota3 = scan.nextInt();
		media = (nota1 + nota2 + nota3)/3;
			break;
		case 2: System.out.println("Ver média e situação do aluno");
		System.out.println(media);
		if (media < 5) {
			System.out.println("Aluno reprovado");
		} else if (media >=5 && media <=6.9){ 
			System.out.println("Aluno de recuperação");
		} else if (media >=7){
			System.out.println("Aluno aprovado");
		}
			break;
		case 3: System.out.println("Sair");
		cont = 3;
			break;
		default: System.out.println("Número inválido"); 
			break;
	}		
		}	
		scan.close();
		}	
}