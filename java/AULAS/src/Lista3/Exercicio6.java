package Lista3;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		/*Escrever um programa que receba v�rios n�meros inteiros no teclado.
		* E no final imprimir a m�dia dos n�meros m�ltiplos de 3. Para sair digitar 0(zero).(DO...WHILE)*/
		Scanner leia = new Scanner(System.in);
		double numeros=0, soma=0, mediaMultiplos3=0, contador=0;
		
		do {
			System.out.print("Digite um n�mero inteiro: [pressione 0 para sair]");
			numeros = leia.nextDouble();
			if (numeros % 3 == 0 && numeros > 0) {
				soma += numeros;
				contador++;
			}
			
		} while (numeros !=0);
		
		mediaMultiplos3 = soma / contador;
		System.out.printf("\nM�dia dos n�meros multiplos de 3: %.2f",mediaMultiplos3);
		
	}
}
