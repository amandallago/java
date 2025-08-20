package org.lpa.ads;

import java.util.Scanner;

public class Questao5 {
	    public static boolean ehTriangulo(int lado1, int lado2, int lado3) {
	        return (lado1 < lado2 + lado3) && (lado2 < lado1 + lado3) && (lado3 < lado1 + lado2);
	    }

	    public static String classificarTriangulo(int lado1, int lado2, int lado3) {
	        if (lado1 == lado2 && lado2 == lado3) {
	            return "Equilátero";
	        } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
	            return "Isósceles";
	        } else {
	            return "Escaleno";
	        }
	    }

	    public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);

	        System.out.print("Digite o tamanho do lado 1: ");
	        int lado1 = scan.nextInt();
	        System.out.print("Digite o tamanho do lado 2: ");
	        int lado2 = scan.nextInt();
	        System.out.print("Digite o tamanho do lado 3: ");
	        int lado3 = scan.nextInt();

	        if (ehTriangulo(lado1, lado2, lado3)) {
	            String classificacao = classificarTriangulo(lado1, lado2, lado3);
	            System.out.println("Os lados formam um triângulo. Classificação: " + classificacao);
	        } else {
	            System.out.println("Os lados não formam um triângulo.");
	        }

	        scan.close();
    }
}