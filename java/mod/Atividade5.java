package mod;

public class Atividade5 {
		    public static void main(String[] args) {
		        mostrarResultados(10, 2);
		    }

		    public static int multiplicar(int a, int b) {
		        return a * b;
		    }

		    public static int dividir(int a, int b) {
		        if (b != 0) {
		            return a / b;
		        } else {
		            System.out.println("Divisão por zero!");
		            return 0;
		        }
		    }

		    public static void mostrarResultados(int a, int b) {
		        int produto = multiplicar(a, b);
		        int quociente = dividir(a, b);

		        System.out.println("Multiplicação: " + produto);
		        System.out.println("Divisão: " + quociente);
    }
}		