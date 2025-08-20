package test1;

import java.util.Scanner;

public class estudosjava {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double nota1, nota2, nota3, media;
		int peso1, peso2, peso3;
	
		System.out.println("Qual a primeira nota");
		nota1 = scan.nextDouble();
		System.out.println("Qual a peso");
		peso1 = scan.nextInt();
		System.out.println("Qual a segunda nota");
		nota2 = scan.nextDouble();
		System.out.println("Qual é o peso");
		peso2 = scan.nextInt();
		System.out.println("Qual a terceira nota");
		nota3 = scan.nextDouble();
		System.out.println("Qual é o peso");
		peso3 = scan.nextInt();
		
		media = ((nota1 * peso1) + (nota2 * peso2) + (nota3 * peso3))/(peso1+peso2+peso3);
		
		if (media >=7) {
		System.out.println("Aluno aprovado " + media);
		}else if (media >=4 && media >=6.9){
		System.out.println("Aluno de dependencia " + media);
		}else if (media <4)
		System.out.println("Aluno reprovado " + media);
	} 
}
