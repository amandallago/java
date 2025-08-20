package test1;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int lado1, lado2, lado3;
		System.out.println("Digite um número inteiro");
		lado1 = scan.nextInt();
		System.out.println("Digite um número inteiro");
		lado2 = scan.nextInt();
		System.out.println("Digite um número inteiro");
		lado3 = scan.nextInt();
		
		if (lado1 + lado2 > lado3 &&
			lado2 + lado3 > lado1 &&
			lado1 + lado3 > lado2) {
		System.out.println("É um triângulo");
		if (lado1 == lado2 && lado2 == lado3) {
			System.out.println("Triângulo equilátero");
			} else {
			if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3) {
			System.out.println("Triângulo Isósceles");
			} else {
			System.out.println("Triângulo escaleno");
			}
			}
		} else {
		System.out.println("Não é um triângulo");	
}
	}
	}