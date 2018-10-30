import java.util.Scanner;

public class Questao7 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Insira um valor em metros: ");
		double metros = entrada.nextDouble();
		double centimetros = metros * 100;
		entrada.close();
		System.out.println("Valor em centímetros: " + centimetros);
	}
}
