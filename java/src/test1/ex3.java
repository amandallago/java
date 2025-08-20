package test1;

import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num;
		
		System.out.println("Digite um numero");
		num = scan.nextInt();
		
		if (num %2==0) {
			System.out.println("Numero é par");
		} else {
			System.out.println("Numero é impar");
		}
		

	}

}
