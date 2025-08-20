package test1;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Digite um número inteiro: ");
        int n;
        n = scan.nextInt();
        
        int cont = n;
        do {
            System.out.println(cont);
            cont--; 
        } while (cont >= 0);
        
        scan.close();
	
	}
}
