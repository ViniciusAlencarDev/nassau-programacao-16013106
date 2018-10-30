import java.util.Scanner;

public class Questao8 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Qual você ganha por hora? ");
		double valorHora = entrada.nextDouble();
		System.out.print("Quantas horas você trabalha em um mês? ");
		double horasTrabalhadas = entrada.nextDouble();
		entrada.close();
		double salario = valorHora * horasTrabalhadas;
		System.out.println("Seu salário é R$" + salario);
	}
}
