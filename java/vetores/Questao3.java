package vetores;

import java.util.Scanner;

public class Questao3 {
		    // Função para preencher o vetor com valores do usuário
		    public static void preencherVetor(int[] vetor) {
		        Scanner scan = new Scanner(System.in);
		        System.out.println("Digite 50 números inteiros:");
		        for (int i = 0; i < vetor.length; i++) {
		            System.out.print("Elemento " + (i + 1) + ": ");
		            vetor[i] = scan.nextInt();
		        }
		    }
		    
		    // Função para exibir o vetor na ordem inversa
		    public static void exibirInverso(int[] vetor) {
		        System.out.println("Vetor na ordem inversa:");
		        for (int i = vetor.length - 1; i >= 0; i--) {
		            System.out.println("Elemento " + (i + 1) + ": " + vetor[i]);
		        }
		    }
		    
		    // Método principal
		    public static void main(String[] args) {
		        // Declaração do vetor com 50 posições
		        int[] vetor = new int[50];
		        
		        // Chama as funções
		        preencherVetor(vetor);
		        exibirInverso(vetor);
    }
}