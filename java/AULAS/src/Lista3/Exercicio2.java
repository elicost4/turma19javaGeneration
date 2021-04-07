package Lista3;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {

		/* Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR) */
		Scanner leia = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		final int NUMEROS = 10;
		int numeral = 0, totalImpar=0, totalPar=0;
		for (int x = 0; x < NUMEROS; x++) {
			System.out.printf("Digite o %dº número:", x + 1);
			numeral = leia.nextInt();
			if (numeral %2 == 0) {
				totalPar += numeral;
			} else {
				totalImpar += numeral;
			}
				
		}
		System.out.printf("\nSoma dos números pares: %d",totalPar);
		System.out.printf("\nSoma dos números ímpares: %d",totalImpar);
	}
}
