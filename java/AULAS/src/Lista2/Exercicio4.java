package Lista2;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		/*
		 * 4- Faça um programa em que permita a entrada de um número qualquer e exiba se
		 * este número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo;
		 * se for ímpar exiba o número elevado ao quadrado.
		 */
		Scanner leia = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		double n=0;

		System.out.print("Digite um número: ");
		n = leia.nextDouble();
		
		if (n % 2 == 0 && n >= 1) {
			System.out.printf(n + " é um número par\n");
			n = Math.sqrt(n);
			System.out.printf("Sua raiz quadrada é: %.3f\n",n);
			
		} else if (n % 2 == 1 && n >= 1) {
			System.out.printf(n + " é um número ímpar\n");
			System.out.printf(n+"² = ");
			n = Math.pow(n, 2);
			System.out.printf("%.3f\n",n);
			
		} else if (n == 0) {
			System.out.printf("Zero é um número neutro!\n");
		} else if (n < 0) {
			System.out.println("Números negativos não podem ser classificados como sendo ímpar ou par!");
		} else {
			System.out.println("Números decimais não podem ser classificados como sendo ímpar ou par!");
		}
	}
}
