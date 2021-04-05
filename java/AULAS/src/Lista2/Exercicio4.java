package Lista2;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		/*
		 * 4- Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se
		 * este n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo;
		 * se for �mpar exiba o n�mero elevado ao quadrado.
		 */
		Scanner leia = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		double n=0;

		System.out.print("Digite um n�mero: ");
		n = leia.nextDouble();
		
		if (n % 2 == 0 && n >= 1) {
			System.out.printf(n + " � um n�mero par\n");
			n = Math.sqrt(n);
			System.out.printf("Sua raiz quadrada �: %.3f\n",n);
			
		} else if (n % 2 == 1 && n >= 1) {
			System.out.printf(n + " � um n�mero �mpar\n");
			System.out.printf(n+"� = ");
			n = Math.pow(n, 2);
			System.out.printf("%.3f\n",n);
			
		} else if (n == 0) {
			System.out.printf("Zero � um n�mero neutro!\n");
		} else if (n < 0) {
			System.out.println("N�meros negativos n�o podem ser classificados como sendo �mpar ou par!");
		} else {
			System.out.println("N�meros decimais n�o podem ser classificados como sendo �mpar ou par!");
		}
	}
}
