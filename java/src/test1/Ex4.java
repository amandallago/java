package test1;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Float nota1, nota2, nota3, media;
		
		System.out.println("Digite a primeira nota ");
		nota1 = scan.nextFloat();
		System.out.println("Digite a segunda nota ");
		nota2 = scan.nextFloat();
		System.out.println("Digite a terceira nota ");
		nota3 = scan.nextFloat();
		
		media = (nota1 + nota2 + nota3)/3;
		
		
		if (media >=7) {
		System.out.println("Aluno aprovado");
		}else {
		if (media >=5) {
		System.out.println("Aluno em Recuperacao");
		}else {
		System.out.println("Aluno reprovado");
		
	}

}
	}
}