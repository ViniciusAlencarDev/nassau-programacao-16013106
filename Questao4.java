import java.util.Scanner;

public class Questao4 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Insira um número: ");
		double numero = entrada.nextDouble();
		entrada.close();
		System.out.println("NUMERO: " + numero);
		System.out.println("QUADRADO: " + Math.pow(numero, 2));
	}
}
