package org.lpa.ads;

import java.util.Scanner;

public class Questao6 {
	
	    public static void mostrarTabuada(int numero) {
	        System.out.println("Tabuada do " + numero + ":");
	        for (int i = 1; i <= 10; i++) {
	            System.out.println(numero + " x " + i + " = " + (numero * i));
	        }
	    }

	    public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        String resposta;

	        do {
	            System.out.print("Você quer ver a tabuada? (s/n): ");
	            resposta = scan.nextLine().toLowerCase();

	            if (resposta.equals("s")) {
	                int numero;
	                do {
	                    System.out.print("Digite um número entre 2 e 10: ");
	                    numero = scan.nextInt();
	                    scan.nextLine(); 
	                } while (numero < 2 || numero > 10);

	                mostrarTabuada(numero);
	            }

	        } while (resposta.equals("s"));

	        System.out.println("Programa encerrado.");
	        
	        scan.close();
    }
}