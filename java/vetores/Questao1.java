package vetores;

public class Questao1 {
		  public static int posicaoMaior(int[] vetor, int quantidade) {
		        // Verifica se o vetor é válido e tem elementos
		        if (vetor == null || quantidade <= 0 || quantidade > vetor.length) {
		            return -1; // Retorna -1 para indicar erro
		        }
		        
		        // Inicializa a posição do maior com o primeiro elemento
		        int posicaoMaior = 0;
		        
		        // Percorre o vetor para encontrar a posição do maior elemento
		        for (int i = 1; i < quantidade; i++) {
		            if (vetor[i] > vetor[posicaoMaior]) {
		                posicaoMaior = i;
		            }
		        }
		        
		        return posicaoMaior;
		    }
		    
		    // Exemplo de uso
		  public static void main(String[] args) {
		        int[] exemplo = {10, 5, 8, 12, 3};
		        int quantidade = 5;
		        int resultado = posicaoMaior(exemplo, quantidade);
		        System.out.println("A posição do maior número é: " + resultado);
    }
}