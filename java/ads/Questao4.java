package org.lpa.ads;

import java.util.Scanner;

public class Questao4 {	
		public static String classificar(int lado1, int lado2, int lado3) {
		        
			if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {
	            
		            if (lado1 == lado2 && lado2 == lado3) {
		                return "Triângulo Equilátero";
		            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
		                return "Triângulo Isósceles";
		            } else {
		                return "Triângulo Escaleno";
		            }
		        } else {
		            return "Os valores não formam um triângulo";
		        }
		    }

		    public static void main(String[] args) {
		        Scanner scan = new Scanner(System.in);
		        System.out.print("Digite o tamanho do primeiro lado: ");
		        int lado1 = scan.nextInt();
		        System.out.print("Digite o tamanho do segundo lado: ");
		        int lado2 = scan.nextInt();
		        System.out.print("Digite o tamanho do terceiro lado: ");
		        int lado3 = scan.nextInt();
		        String classificacao = classificar(lado1, lado2, lado3);
		        System.out.println(classificacao);

		        scan.close();
    }
}