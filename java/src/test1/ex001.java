package test1;

import java.util.Scanner;

public class ex001 {

	public static void main(String[] args) {
		int a, m, d, dt;
		
		    try (Scanner teclado = new Scanner(System.in)) {
				System.out.println("Digite sua idade:");
				a = teclado.nextInt();
				System.out.println("Anos: " + a);
				
				System.out.println("Digite quantos meses você tem:");
				m = teclado.nextInt();
				System.out.println("Meses: " + m);
				
				System.out.println("Digite quantos dias você tem:");
				d = teclado.nextInt();
			}
	    	a = 360 * a;
	    	m = m * 30;
	    	dt = a + m + d;

	    	System.out.print("Você tem o total de: "+ dt);
	    	System.out.print(" dias de vida");
	  
	}
}
