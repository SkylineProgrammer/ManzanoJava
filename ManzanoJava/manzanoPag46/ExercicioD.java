package manzanoPag46;
import java.util.Scanner;


public class ExercicioD {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int contadora = 0;

		while (contadora < 21) {
			if (contadora % 2 == 1) {
				System.out.println("O numero " + contadora + " é impar");
			}

			contadora = contadora + 1;
		}

		sc.close();

	}

}
