package mod;

import java.util.Scanner;

public class Atividade3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite sua idade");
		int idade = scan.nextInt();	
		verificarIdade(idade);
		scan.close();
	}
	public static void verificarIdade(int idade) {
		if (idade >= 18) {
			System.out.println("Maior de idade");
		} else
			System.out.println("Menor de idade");
	}	
	
}