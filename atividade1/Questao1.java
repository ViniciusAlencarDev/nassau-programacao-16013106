import java.util.Scanner;

public class Questao1 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Insira seu nome: ");
		String nome = entrada.nextLine();
		System.out.print("Insira sua idade: ");
		int idade = entrada.nextInt();
		entrada.close();
		System.out.println("NOME: " + nome);
		System.out.println("IDADE: " + idade);
	}
}
