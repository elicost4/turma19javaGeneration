package Lista3;

import java.util.Scanner;
public class Exercicio5 {
	
	public static void main(String[] args) {
		
		/*Crie um programa que leia um número do teclado até que encontre um número igual
		 * a zero. No final, mostre a soma dos números digitados.(DO...WHILE)*/
		Scanner teclado = new Scanner(System.in);
		
		
		int numero=0, soma=0;
		do {
			System.out.print("Digite um número: [pressione 0 para sair]");
			numero = teclado.nextInt();
			soma += numero;
			
		} while (numero != 0);
		System.out.printf("\nSoma dos números digitados: %d",soma);
		System.out.print("\n\rTHE END");
	} 
}
