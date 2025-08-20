package vetores;

import java.util.Scanner;

public class Questao0 {
		public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int vetor1[] = new int[4];
        int vetor2[] = new int[4];
        int vetorSoma[] = new int[4];
        
        System.out.println("Digite 4 números inteiros para o primeiro vetor:");
        for (int i = 0; i < 4; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vetor1[i] = scan.nextInt();
        }
        
        System.out.println("Digite 4 números inteiros para o segundo vetor:");
        for (int i = 0; i < 4; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vetor2[i] = scan.nextInt();
        }
        
        for (int i = 0; i < 4; i++) {
            vetorSoma[i] = vetor1[i] + vetor2[i];
        }
       
        System.out.println("Vetor resultante (soma dos elementos de mesmo índice):");
        for (int i = 0; i < 4; i++) {
            System.out.println("Elemento " + (i + 1) + ": " + vetorSoma[i]);
        }
        
        scan.close();
    }
}