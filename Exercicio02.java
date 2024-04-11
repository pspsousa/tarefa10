package tarefa10;
import java.util.Scanner;
public class Exercicio02 {
public static void main(String[] args) {

	// Apresentar os resultados de uma tabuada de multiplicar (de 1 até 10) de um número qualquer.

	Scanner input = new Scanner(System.in);

        System.out.println("Digite um número para a tabuada:");
        int numero = input.nextInt();

        System.out.println("Tabuada de multiplicação para o número " + numero + ":");

        int multiplicador = 1;
        while (multiplicador <= 10) {
            int resultado = numero * multiplicador;
            System.out.println(numero + " x " + multiplicador + " = " + resultado);
            multiplicador++;
        }

        input.close();
	}

}
