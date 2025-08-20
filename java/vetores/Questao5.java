package vetores;

public class Questao5 {
		    public static double calcularMedia(double[] medias, int quantidade) {
		        // Verifica se o vetor é válido e a quantidade é positiva
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
		    
		    // Exemplo de uso
		    public static void main(String[] args) {
		        // Vetor de exemplo com médias de alunos
		        double[] medias = {7.5, 8.0, 6.5, 9.0, 7.0};
		        int quantidade = 5;
		        
		        // Chama a função
		        double mediaTurma = calcularMedia(medias, quantidade);
		        
		        // Exibe o resultado
		        if (mediaTurma != -1) {
		            System.out.printf("A média da turma é: %.2f\n", mediaTurma);
		        } else {
		            System.out.println("Erro: Vetor inválido ou quantidade incorreta.");
		        }
	}
}