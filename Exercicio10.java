package tarefa10;
public class Exercicio10 {
public static void main(String[] args) {

	// Elaborar um programa que apresente os valores de conversão de graus Celsius em Fahrenheit, de 10 em 10 graus, iniciando a contagem em 10 graus Celsius e finalizando em 100 graus Celsius. O programa deve apresentar os valores das duas temperaturas. A fórmula de conversão é F = (9*C+160)/5, sendo F a temperatura em Fahrenheit e C a temperatura em Celsius.

	System.out.println("Conversão de graus Celsius para Fahrenheit:");

        for (int celsius = 10; celsius <= 100; celsius += 10) {
            double fahrenheit = (9 * celsius + 160) / 5;
            System.out.println(celsius + "°C é igual a " + fahrenheit + "°F");
}

}
