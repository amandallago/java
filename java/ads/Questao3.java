package org.lpa.ads;

import java.util.Scanner;

public class Questao3 {
	public static void mostrarCategoria (int idade){
		if (idade >= 5 && idade <=7) {
			System.out.println("Categoria Infantil A");
		} else if (idade >=8 && idade <=10) {
			System.out.println("Categoria Infantil B");
		} else if  (idade >= 11 && idade <=13) {
			System.out.println("Categoria Juvenil A");
		} else if (idade >=14 && idade <=17) {
			System.out.println("Categoria Juvenil B");
		} else if (idade >=18) {
			System.out.println("Sênior");
		} else {
			System.out.println("Idade fora da faixa para categorias listadas.");
    }
}
		public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite a idade do nadador: ");
		int idade = scan.nextInt();
		mostrarCategoria(idade);
		
		scan.close();
	}
}