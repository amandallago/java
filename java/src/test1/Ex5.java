package test1;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Float peso, altura, IMC;
		
		System.out.println("Qual seu peso?");
		peso = scan.nextFloat();
		System.out.println("Qual sua altura?");
		altura = scan.nextFloat();
		

		IMC = peso / (altura * altura);
		
		if (IMC <18.5) {
		System.out.println("Abaixo do peso");
		} else {
			if (IMC <24.9) {
		System.out.println("Peso normal");
		}else {
			if (IMC <29.9) {
		System.out.println("Sobrepeso");
		}else {	
		System.out.println("Obesidade");
			}
		
		}
	}

}
	}