import java.util.Scanner;

public class Questao5 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Insira a temperatura em Fahrenheit: ");
		double temperaturaF = entrada.nextDouble();
		double temperaturaC = (5 * (temperaturaF-32) / 9);
		entrada.close();
		System.out.println("Celcius: " + temperaturaC);
	}
}
