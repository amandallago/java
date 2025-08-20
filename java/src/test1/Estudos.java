package test1;

import java.util.Scanner;

public class Estudos {

			public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			int u,d, t;
			
			System.out.println("Digite o primeiro numero");
			u = scan.nextInt();
			System.out.println("Digite o segundo numero");
			d = scan.nextInt();
			
			t = u + d;
			System.out.println("A total da soma é " + t);
			
			
			scan.close();
		
	}	
			
}