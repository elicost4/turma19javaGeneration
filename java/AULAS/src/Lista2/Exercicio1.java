package Lista2;

import java.util.Scanner;

public class Exercicio1 {
	
	public static void main(String[] args) {
		
		/*1- Faça um programa que receba três inteiros e diga qual deles é o maior.*/
		Scanner leia = new Scanner(System.in);
		
		int n1,n2,n3;
		
		System.out.print("Entre com o 1º número inteiro: ");
		n1 = leia.nextInt();
		leia.nextLine();
		System.out.print("Entre com o 2º número inteiro: ");
		n2 = leia.nextInt();
		leia.nextLine();
		System.out.print("Entre com o 3º número inteiro: ");
		n3 = leia.nextInt();
		leia.nextLine();
		
		if (n1 >= n2 && n1 >= n3)
		{
			System.out.println("O maior número é o: "+n1);
		}
		else if (n2 >= n1 && n2 >= n3)
		{
			System.out.println("O maior número é o: "+n2);
		}
		else
		{
			System.out.println("O maior número é o: "+n3);
		}
	}
}
