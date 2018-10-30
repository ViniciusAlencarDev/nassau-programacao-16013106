import java.util.Scanner;

public class Questao10 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Qual sua altura? ");
		double altura = entrada.nextDouble();
		entrada.close();
		double pesoIdeal = (72.7*altura) - 58;
		System.out.printf("Peso ideal: %.2f", pesoIdeal);
	}
}
