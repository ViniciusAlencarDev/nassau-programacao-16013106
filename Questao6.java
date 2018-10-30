import java.util.Scanner;

public class Questao6 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Saldo da poupança: ");
		double saldo = entrada.nextDouble();
		double reajuste = saldo + (saldo * 3/100);
		entrada.close();
		System.out.println("Saldo com reajuste de 3%: " + reajuste);
	}
}
