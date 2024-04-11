package tarefa10;
import java.util.Scanner;
public class Exercicio08 {
public static void main(String[] args) {

	// Elaborar um programa que apresente como resultado o valor de uma potência de uma base qualquer elevada a um expoente qualquer, ou seja, de BE, em que B é o valor da base e E o valor do expoente. Observe que neste exercício não pode ser utilizado o operador de exponenciação do portuguol (^).


	Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor da base (B): ");
        double base = scanner.nextDouble();

        System.out.print("Digite o valor do expoente (E): ");
        int expoente = scanner.nextInt();

        double resultado = calcularPotencia(base, expoente);

        System.out.println("Resultado de " + base + " elevado a " + expoente + " é: " + resultado);
	}

	public static double calcularPotencia(double base, int expoente) {
        double resultado = 1.0;

        if (expoente == 0) {
            return 1.0;
        }

        for (int i = 1; i <= Math.abs(expoente); i++) {
            resultado *= base;
        }

        if (expoente < 0) {
            resultado = 1.0 / resultado;
        }

        return resultado;

	scanner.close();

	}

}
