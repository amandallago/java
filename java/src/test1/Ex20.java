package test1;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int num, cont = 0, menu;
    
    while (cont == 0) {
    	System.out.println("Digite 1 para ver tabuada de um número, 2 para ver se o número é par ou ímpar e 3 para sair");
    	menu = scan.nextInt();
    	System.out.println("Digite um número");
    	num = scan.nextInt();
    	
    switch (menu) {
    case 1: System.out.println("Ver tabuada de um número");
    	for (int i=1; i<=10; i++) {
    		System.out.println(num + "x" + i);
    		System.out.println(num * i);
    	}
    	break;
    case 2: System.out.println("Ver se o número é par ou ímpar");
    	if (num %2==0) {
    		System.out.println("Número par");
    	} else {
    		System.out.println("Número ímpar");
    	}
    	break;
    case 3: System.out.println("Sair");
    	cont = 1;	
    	break;
    		}
    	} 
	}
}