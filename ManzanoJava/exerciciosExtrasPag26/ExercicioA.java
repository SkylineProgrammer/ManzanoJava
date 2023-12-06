package exerciciosExtrasPag26;
import java.util.Scanner;


public class ExercicioA {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int valorA, valorB, valorC, valorD, produto, S;

		System.out.println("Digite o  primeiro valor(A)");
		valorA = sc.nextInt();
		System.out.println("Digite o  primeiro valor(B)");
		valorB = sc.nextInt();
		System.out.println("Digite o  primeiro valor(C)");
		valorC = sc.nextInt();
		System.out.println("Digite o primeiro valor(D)");
		valorD = sc.nextInt();

		produto = valorA + valorC;
		S = valorB + valorD;
		System.out.println("O resultado da soma do valor A com o C é " + produto
				+ " e o resultado da soma do valor B com o D é " + S);

		sc.close();

	}

}
