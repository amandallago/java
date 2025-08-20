package org.lpa.ads;

import java.util.Scanner;

public class Questao2 {
		 public static void mostrarCategoria(int idade) {
		        if (idade >= 0 && idade <= 15) {
		            System.out.println("Sem permissão para votar.");
		        } else if (idade >= 16 && idade <= 17 || idade > 65) {
		            System.out.println("Voto facultativo.");
		        } else if (idade >= 18 && idade <= 64) {
		            System.out.println("Voto obrigatório.");
		        } else {
		            System.out.println("Idade inválida.");
		        }
		    }
		    public static void main(String[] args) {
		        Scanner scan = new Scanner(System.in);
		        System.out.print("Digite a idade da pessoa: ");
		        int idade = scan.nextInt();
		        mostrarCategoria(idade);
		        		        
		        scan.close();
	}
}