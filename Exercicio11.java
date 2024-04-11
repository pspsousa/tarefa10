package tarefa10;
public class Exercicio11 {
public static void main(String[] args) {

// Elaborar um programa que apresente como resultado o valor do fatorial dos valores ímpares situados na faixa numérica de 1 a 10.

	System.out.println("Fatorial dos valores ímpares de 1 a 10:");

        for (int i = 1; i <= 10; i++) {
            if (i % 2 != 0) {
                long fatorial = calcularFatorial(i);
                System.out.println(i + "! = " + fatorial);
            }
        }
	}

	public static long calcularFatorial(int n) {
        long resultado = 1;
        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
}

}
