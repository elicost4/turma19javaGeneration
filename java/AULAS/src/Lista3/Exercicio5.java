package Lista3;

import java.util.Scanner;
public class Exercicio5 {
	
	public static void main(String[] args) {
		
		/*Crie um programa que leia um n�mero do teclado at� que encontre um n�mero igual
		 * a zero. No final, mostre a soma dos n�meros digitados.(DO...WHILE)*/
		Scanner teclado = new Scanner(System.in);
		
		
		int numero=0, soma=0;
		do {
			System.out.print("Digite um n�mero: [pressione 0 para sair]");
			numero = teclado.nextInt();
			soma += numero;
			
		} while (numero != 0);
		System.out.printf("\nSoma dos n�meros digitados: %d",soma);
		System.out.print("\n\rTHE END");
	} 
}
