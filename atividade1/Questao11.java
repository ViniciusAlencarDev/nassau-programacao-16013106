import java.util.Scanner;

public class Questao11 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Insira o tempo de duração do evendo: ");
		double duracao = entrada.nextDouble();
		entrada.close();
		double horas = (duracao - (duracao % 3600)) / 3600;
		double minutos = (duracao - (horas * 3600) - ((duracao - (horas * 3600)) % 60)) / 60;
		double segundos = (duracao - (horas * 3600)) - (minutos * 60);
		System.out.println("Horas: " + horas);
		System.out.println("Minutos: " + minutos);
		System.out.println("Segundos: " + segundos);
	}
}
