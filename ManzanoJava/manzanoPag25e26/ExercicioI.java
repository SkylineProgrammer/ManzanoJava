package manzanoPag25e26;
import java.util.Scanner;
import java.lang.Math;


public class ExercicioI {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int quadrado, valorA, valorB;

		System.out.println("Digite o valor de A:");
		valorA = sc.nextInt();
		System.out.println("Digite o valor de B:");
		valorB = sc.nextInt();
		quadrado = valorA - valorB;
		quadrado = (int) Math.pow(quadrado, 2);

		System.out.println("A subtra��o dos numeros A + B � de " + (valorA - valorB)
				+ ", sendo ele ao quadrado � igual a: " + quadrado);

		sc.close();
	}

}
