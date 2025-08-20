package vetores;

public class Questao6 {
		    public static double calcularMedia(double[] medias, int quantidade) {
		        
		        if (medias == null || quantidade <= 0 || quantidade > medias.length) {
		            return -1; // Retorna -1 para indicar erro
		        }
		        
		        // Calcula a soma das médias
		        double soma = 0;
		        for (int i = 0; i < quantidade; i++) {
		            soma += medias[i];
		        }
		        
		        // Calcula e retorna a média da turma
		        return soma / quantidade;
		    }
		    
		    // Função para contar quantos alunos estão acima da média
		    public static int contarAcimaMedia(double[] medias, int quantidade) {
		        // Verifica se o vetor é válido e a quantidade é positiva
		        if (medias == null || quantidade <= 0 || quantidade > medias.length) {
		            return -1; // Retorna -1 para indicar erro
		        }
		        
		        // Calcula a média da turma usando a função calcularMedia
		        double mediaTurma = calcularMedia(medias, quantidade);
		        if (mediaTurma == -1) {
		            return -1; // Propaga o erro
		        }
		        
		        // Conta os alunos com média acima da média da turma
		        int contador = 0;
		        for (int i = 0; i < quantidade; i++) {
		            if (medias[i] > mediaTurma) {
		                contador++;
		            }
		        }
		        
		        return contador;
		    }
		    
		    // Exemplo de uso
		    public static void main(String[] args) {
		        // Vetor de exemplo com médias de alunos
		        double[] medias = {7.5, 8.0, 6.5, 9.0, 7.0};
		        int quantidade = 5;
		        
		        // Chama a função para contar alunos acima da média
		        int resultado = contarAcimaMedia(medias, quantidade);
		        
		        // Exibe o resultado
		        if (resultado != -1) {
		            System.out.println("Número de alunos acima da média: " + resultado);
		        } else {
		            System.out.println("Erro: Vetor inválido ou quantidade incorreta.");
		        }
	}

}