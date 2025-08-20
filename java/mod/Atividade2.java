package mod;

import java.util.Scanner;

public class Atividade2 {
		    public static void main(String[] args) {
		        Scanner scan = new Scanner(System.in);
		        
		        System.out.println("Digite o primeiro número inteiro");
		        int num1 = scan.nextInt();
		        
		        System.out.println("Digite o segundo número inteiro");
		        int num2 = scan.nextInt();
		        
		        int resultado = somar(num1, num2);
		        
		        System.out.println("Soma dos números é: " + resultado);
		        scan.close();
		    }

		    public static int somar(int num1, int num2) {
		        return num1 + num2;
    }
}