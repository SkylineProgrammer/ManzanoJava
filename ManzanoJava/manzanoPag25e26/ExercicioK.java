package manzanoPag25e26;
import java.util.Scanner;


public class ExercicioK {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int dollar, reais;

		System.out.println("Digite quantos reais você quer converte para dollares:");
		reais = sc.nextInt();
		dollar = reais * 5;
		System.out.println("Convertendo, você tem " + dollar + " dólares");
		System.out.println("O valor do dollar é 1 dollar = 5 reais");

		sc.close();

	}

}
