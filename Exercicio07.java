package tarefa10;
public class Exercicio07 {
public static void main(String[] args) {

	// Apresentar os resultados das potências de 3, variando do expoente 0 até o expoente 15. Deve ser considerado que qualquer número elevado a zero é 1, e elevado a 1 é ele próprio. Observe que neste exercício não pode ser utilizado o operador de exponenciação do portuguol (^).

        int base = 3;
        int expoente = 0;
        int resultado = 1;

        System.out.println("Resultados das potências de 3:");

        while (expoente <= 15) {
            System.out.println(base + " elevado a " + expoente + " é " + resultado);
            resultado *= base;
            expoente++;
        }		
	}

}
