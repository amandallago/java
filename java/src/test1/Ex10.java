package test1;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;
		int cont = 1;
		
		System.out.println("Digite um número");
		n = scan.nextInt();
		
		do {
			System.out.println(cont);
			cont++;
		} while (cont <=n);
		
		scan.close();
	
	}
}
