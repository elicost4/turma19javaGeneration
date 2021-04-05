package Desafios;

import java.util.Scanner;

public class InversaoValorVariaveis {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int valores[] = new int[2];
		
		System.out.print("Digite o primeiro valor: ");
		valores[0] = leia.nextInt();
		
		System.out.print("Digite o segundo valor: ");
		valores[1] = leia.nextInt();

		System.out.printf("Primeiro valor invetido : %d\n", valores[1]);
		System.out.printf("Segundo valor invetido : %d", valores[0]);

	}
}
