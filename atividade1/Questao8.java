import java.util.Scanner;

public class Questao8 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Qual voc� ganha por hora? ");
		double valorHora = entrada.nextDouble();
		System.out.print("Quantas horas voc� trabalha em um m�s? ");
		double horasTrabalhadas = entrada.nextDouble();
		entrada.close();
		double salario = valorHora * horasTrabalhadas;
		System.out.println("Seu sal�rio � R$" + salario);
	}
}
