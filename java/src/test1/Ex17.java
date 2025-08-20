package test1;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int mes, cont = 1, dezembro = 0, cont1 = 0;
		Double peso, altura, IMC, maior = 0.1, menor = 0.1, alturamaior = 0.1;
		String nome, mes2 = "a",alta = "b";
		
		while (cont == 1) {
		System.out.println("Digite seu nome");
		nome = scan.next();
		System.out.println("Digite o mês do seu nascimento");
		mes = scan.nextInt();
		System.out.println("Digite seu peso (kg) ");
		peso = scan.nextDouble();
		System.out.println("Digite sua altura (m) ");
		altura = scan.nextDouble();
		
		switch (mes) {
		case 1: mes2 = "Janeiro"; break;
		case 2: mes2 = "Fevereiro"; break;		
		case 3: mes2 = "Março"; break;
		case 4: mes2 = "Abril"; break;
		case 5: mes2 = "Maio"; break;
		case 6: mes2 = "Junho"; break;
		case 7: mes2 = "Julho"; break;
		case 8: mes2 = "Agosto"; break;
		case 9: mes2 = "Setembro"; break;
		case 10: mes2 = "Outubro"; break;
		case 11: mes2 = "Novembro"; break;
		case 12: mes2 = "Dezembro"; break;		
		}
		
		IMC = peso/(altura * altura); 
		
		System.out.println(nome + " você nasceu em " + mes2 + " e seu IMC é " + IMC);
				
		if (cont1 == 0) {
			menor = IMC;
			maior = IMC;
			alturamaior = altura;
			alta = nome;
			cont++; } 
		if (IMC > maior) {
			maior = IMC; }
		if (IMC < menor) {
			menor = IMC;}
		if (altura > alturamaior) {
			alta = nome;
			alturamaior = altura;}
		
		if (mes == 12) {
			dezembro++;}
		
		System.out.println("Deseja continuar? Digite 1 para continuar ");
		cont = scan.nextInt();

		}
		System.out.println("O menor imc é " + menor + " o maior imc é " + maior + "o nome da pessoa mais alta é " + alta + " e a quantidade de pessoas que nasceram em deszembro é: " + dezembro );
	}
}