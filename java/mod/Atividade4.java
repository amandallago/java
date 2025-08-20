package mod;

import java.util.Scanner;

public class Atividade4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Digite um número inteiro");
		int num = scan.nextInt();
		if (ehPar(num)) {
            System.out.println("É par");
        } else {
            System.out.println("É ímpar");
        }
		scan.close();
	}

	public static boolean ehPar (int num) {
		return num % 2 == 0;
	}
}