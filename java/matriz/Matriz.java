package matriz;

import java.util.Random;

public class Matriz {
		    public static void mostraDiagonalPrincipal(int[][] matriz) {
		        System.out.println("Elementos da diagonal principal:");
		        for (int i = 0; i < 10; i++) {
		            System.out.print(matriz[i][i] + " ");
		        }
		        System.out.println();
		    }
		    public static int[][] criaMatriz() {
		        Random gerador = new Random();
		        int[][] matriz = new int[10][10];
		        for (int i = 0; i < 10; i++) {
		            for (int j = 0; j < 10; j++) {
		                matriz[i][j] = gerador.nextInt(100) + 1;
		            }
		        }
		        return matriz;
		    }
		    public static void exibeMatriz(int[][] matriz) {
		        System.out.println("Matriz 10x10:");
		        for (int i = 0; i < 10; i++) {
		            for (int j = 0; j < 10; j++) {
		                System.out.printf("%3d ", matriz[i][j]);
		            }
		            System.out.println();
		        }
		    }
		    public static void main(String[] args) {
		        int[][] matriz = criaMatriz();
		        exibeMatriz(matriz);
		        mostraDiagonalPrincipal(matriz);
    }
}