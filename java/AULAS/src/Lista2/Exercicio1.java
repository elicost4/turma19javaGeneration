package Lista2;

import java.util.Scanner;

public class Exercicio1 {
	
	public static void main(String[] args) {
		
		/*1- Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.*/
		Scanner leia = new Scanner(System.in);
		
		int n1,n2,n3;
		
		System.out.print("Entre com o 1� n�mero inteiro: ");
		n1 = leia.nextInt();
		leia.nextLine();
		System.out.print("Entre com o 2� n�mero inteiro: ");
		n2 = leia.nextInt();
		leia.nextLine();
		System.out.print("Entre com o 3� n�mero inteiro: ");
		n3 = leia.nextInt();
		leia.nextLine();
		
		if (n1 >= n2 && n1 >= n3)
		{
			System.out.println("O maior n�mero � o: "+n1);
		}
		else if (n2 >= n1 && n2 >= n3)
		{
			System.out.println("O maior n�mero � o: "+n2);
		}
		else
		{
			System.out.println("O maior n�mero � o: "+n3);
		}
	}
}
