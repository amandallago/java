package vetores;

public class Questao4 {
		    public static int contarNumero(int[] vetor, int numero) {
		        // Verifica se o vetor é válido e tem 50 elementos
		        if (vetor == null || vetor.length != 50) {
		            return -1; // Retorna -1 para indicar erro
		        }
		        
		        // Conta as ocorrências do número
		        int contador = 0;
		        for (int i = 0; i < vetor.length; i++) {
		            if (vetor[i] == numero) {
		                contador++;
		            }
		        }
		        
		        return contador;
		    }
		    
		    // Exemplo de uso
		    public static void main(String[] args) {
		        // Vetor de exemplo com 50 números inteiros
		        int[] vetor = {
		            1, 2, 3, 2, 5, 2, 7, 8, 2, 10,
		            11, 2, 13, 14, 15, 2, 17, 18, 19, 20,
		            21, 22, 23, 24, 25, 26, 27, 28, 29, 2,
		            31, 32, 33, 34, 35, 36, 37, 38, 39, 40,
		            41, 42, 43, 44, 45, 46, 47, 48, 49, 2
		        };
		        
		        // Número a ser procurado
		        int numero = 2;
		        
		        // Chama a função
		        int resultado = contarNumero(vetor, numero);
		        
		        // Exibe o resultado
		        if (resultado != -1) {
		            System.out.println("O número " + numero + " aparece " + resultado + " vezes no vetor.");
		        } else {
		            System.out.println("Erro: O vetor deve ter 50 elementos.");
		        }
	}
}