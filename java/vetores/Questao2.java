package vetores;

public class Questao2 {
		    public static int[] somarVetores(int[] vetor1, int[] vetor2) {
		        // Verifica se os vetores têm tamanho 10
		        if (vetor1.length != 10 || vetor2.length != 10) {
		            return null; // Retorna null se os vetores não têm tamanho 10
		        }
		        
		        // Cria o vetor resultante com 10 elementos
		        int[] vetorSoma = new int[10];
		        
		        // Calcula a soma dos elementos de mesmo índice
		        for (int i = 0; i < 10; i++) {
		            vetorSoma[i] = vetor1[i] + vetor2[i];
		        }
		        
		        return vetorSoma;
		    }
		    
		    // Exemplo de uso
		    public static void main(String[] args) {
		        // Vetores de exemplo
		        int[] vetor1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		        int[] vetor2 = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
		        
		        // Chama a função
		        int[] resultado = somarVetores(vetor1, vetor2);
		        
		        // Exibe o vetor resultante
		        if (resultado != null) {
		            System.out.println("Vetor resultante (soma dos elementos de mesmo índice):");
		            for (int i = 0; i < resultado.length; i++) {
		                System.out.println("Elemento " + (i + 1) + ": " + resultado[i]);
		            }
		        } else {
		            System.out.println("Erro: Os vetores devem ter 10 elementos cada.");
		        }
    }
}