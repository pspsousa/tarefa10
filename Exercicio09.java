package tarefa10;
public class Exercicio09 {

	// Escreva um programa que apresente a série de Fibonacci até o décimo quinto termo. A série de Fibonacci é formada pela seqüência: 1, 1, 2, 3, 5, 8, 13, 21, 34, ..., etc. Esta série se caracteriza pela soma de um termo atual com o seu anterior subseqüente, para que seja formado o próximo valor da seqüência. Portanto começando com os números 1, 1 o próximo termo é 1+1=2, o próximo é 1+2=3, o próximo é 2+3=5, o próximo 3+5=8, etc.

            static long fibo(int n) {
        long F = 0; // atual
        long ant = 0; // anterior

        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                F = 1;
                ant = 0;
            } else {
                F += ant;
                ant = F - ant;
            }
        }
        return F;
    }

    public static void main(String[] args) {
        System.out.println("Série de Fibonacci até o décimo quinto termo:");
        for (int i = 0; i < 15; i++) {
            System.out.print("(" + i + "):" + Fibonacci.fibo(i) + "\t");
        }
    }
}
