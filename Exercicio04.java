package tarefa10;
public class Exercicio04 {
public static void main(String[] args) {

	//Elaborar um programa que apresente no final o somatório dos valores pares existentes na faixa de 1 até 500.


	int soma = 0;

        for (int i = 2; i <= 500; i += 2) {
            soma += i;
        }

        System.out.println("O somatório dos valores pares de 1 a 500 é: " + soma);
	}

}
