import java.util.Scanner;

public class Questao9 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Insira um número:  ");
		double n1 = entrada.nextDouble();
		System.out.print("Insira outro número:  ");
		double n2 = entrada.nextDouble();
		System.out.print("Insira outro número:  ");
		int n3 = entrada.nextInt();
		entrada.close();
		System.out.println("O produto do dobro do primeiro com metade do segundo: " + (n1*2 + (n2/2)));
		System.out.println("A soma do triplo do primeiro com o terceiro: " + (n1*3 + n3));
		System.out.println("O terceiro elevado ao cubo: " + (Math.pow(n3, 3)));
	}
}
