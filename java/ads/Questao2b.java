package org.lpa.ads;

import java.util.Scanner;

public class Questao2b {
		public static String Mostrarcategoria(int idade) {
	        if (idade >= 0 && idade <= 15) {
	            return "Sem permissão para votar";
	        } else if (idade >= 16 && idade <= 17) {
	            return "Voto facultativo";
	        } else if (idade >= 18 && idade <= 64) {
	            return "Voto obrigatório";
	        } else if (idade >= 65) {
	            return "Voto facultativo";
	        } else {
	            return "Idade inválida";
	        }
 }
	    public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        System.out.print("Digite a idade da pessoa: ");
	        int idade = scan.nextInt();
	        String categoria = Mostrarcategoria(idade);
	        System.out.println("Categoria: " + categoria);
	        
	        scan.close();
	}
}