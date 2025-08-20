package test1;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num;
		System.out.println("De uma nota de 0 a 10");
		num = scan.nextInt();
	
		switch (num) {
		case 10:
		case 9:
			System.out.println("A");
		break;
		case 8:
		case 7:
			System.out.println("B");
		break;
		case 6:
		case 5:
			System.out.println("C");
		break;
		case 4:
		case 3:
			System.out.println("D");
		case 2:
		case 1:
			System.out.println("F");
		default: System.out.println("Número inválido");
		
		scan.close();
		
		}
	}

}
