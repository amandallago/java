package test1;

import java.util.Scanner;

public class Ex013 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);	
		System.out.print("Digite o valor para saque (entre 10 e 600): ");
        int valor = scan.nextInt();

        if (valor < 10 || valor > 600) {
            System.out.println("Valor inválido! O valor deve estar entre 10 e 600 reais.");
        } else {
            int notas100 = 0, notas50 = 0, notas20 = 0, notas10 = 0, notas5 = 0, notas1 = 0;
            int resto = valor;

            if (resto >= 100) {
                notas100 = resto / 100;
                resto = resto % 100;
            }
            if (resto >= 50) {
                notas50 = resto / 50;
                resto = resto % 50;
            }
            if (resto >= 20) {
                notas20 = resto / 20;
                resto = resto % 20;
            }
            if (resto >= 10) {
                notas10 = resto / 10;
                resto = resto % 10;
            }
            if (resto >= 5) {
                notas5 = resto / 5;
                resto = resto % 5;
            }
            if (resto >= 1) {
                notas1 = resto;
            }

            System.out.println("Notas entregues:");
            if (notas100 > 0) System.out.println(notas100 + " nota(s) de R$ 100");
            if (notas50 > 0) System.out.println(notas50 + " nota(s) de R$ 50");
            if (notas20 > 0) System.out.println(notas20 + " nota(s) de R$ 20");
            if (notas10 > 0) System.out.println(notas10 + " nota(s) de R$ 10");
            if (notas5 > 0) System.out.println(notas5 + " nota(s) de R$ 5");
            if (notas1 > 0) System.out.println(notas1 + " nota(s) de R$ 1");
        }

        scan.close();
    }
}
		
	