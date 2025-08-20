package test1;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);	
		System.out.print("Digite o valor para saque (entre 10 e 600): ");
		int valor;
		valor = scan.nextInt();
		
		if (valor < 10 || valor > 600) { 
			System.out.println("Valor inválido");
        } else {
        while(true) if (valor >=100) {
        	System.out.println("Uma nota de 100");
        	valor = valor -100;
        } else {
        if (valor >=50) {
        	System.out.println("Uma nota de 50");
        	valor = valor -50;        	
        } else {
        if (valor >=20) {
        	System.out.println("Uma nota de 20");
        	valor = valor -20;
        } else {
        if (valor >=10) {
        	System.out.println("Uma nota de 10");
        	valor = valor -10;	
        } else {
        if (valor >=5) {
        	System.out.println("Uma nota de 5");
        	valor = valor -5;
        } else {
        if (valor >=1) {
        	System.out.println("Uma nota de 1");
        	valor = valor -1;	
        } else {
        break;
    }
  }
   }
}	 
  }
    }       	
        scan.close();
        } 
	}
 }

		
	