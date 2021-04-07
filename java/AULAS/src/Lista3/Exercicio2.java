package Lista3;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {

		/* Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR) */
		Scanner leia = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		final int NUMEROS = 10;
		int numeral = 0, totalImpar=0, totalPar=0;
		for (int x = 0; x < NUMEROS; x++) {
			System.out.printf("Digite o %d� n�mero:", x + 1);
			numeral = leia.nextInt();
			if (numeral %2 == 0) {
				totalPar += numeral;
			} else {
				totalImpar += numeral;
			}
				
		}
		System.out.printf("\nSoma dos n�meros pares: %d",totalPar);
		System.out.printf("\nSoma dos n�meros �mpares: %d",totalImpar);
	}
}
