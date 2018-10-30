import java.util.Scanner;

public class Questao2 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Insira um número: ");
		int n1 = entrada.nextInt();
		System.out.print("Insira outro número: ");
		int n2 = entrada.nextInt();
		entrada.close();
		double resto = n1 % n2;
		double quociente = n1 - resto;
		System.out.println("DIVIDENDO: " + n1);
		System.out.println("DIVISOR: " + n2);
		System.out.println("QUOCIENTE: " + quociente);
		System.out.println("RESTO: " + resto);
	}
}
