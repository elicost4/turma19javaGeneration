package Lista2;

import java.util.Scanner;

public class Exercicio2 {
	
	//2- Fa�a um programa que entre com tr�s n�meros e coloque em ordem crescente.

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int n1=0,n2=0,n3=0;
		
		System.out.print("Entre com o 1� n�mero: ");
		n1 = leia.nextInt();
		leia.nextLine();
		System.out.print("Entre com o 2� n�mero: ");
		n2 = leia.nextInt();
		leia.nextLine();
		System.out.print("Entre com o 3� n�mero: \r");
		n3 = leia.nextInt();
		leia.nextLine();
		
		if (n1 < n2)
		{
			if (n2 < n3)
			{
				System.out.print("ordem crescente: \n"+n1+" - "+n2+" - "+n3);
			}
			else if (n1 < n3)
			{
				System.out.print("ordem crescente: \n"+n1+" - "+n3+" - "+n2);
			}
			else
			{
				System.out.print("ordem crescente: \n"+n3+" - "+n1+" - "+n2);
			}
		}
		else if (n2 < n3)
		{
			if (n1 < n3)
			{
				System.out.print("ordem crescente: \n"+n2+" - "+n1+" - "+n3);
			}
			else
			{
				System.out.print("ordem crescente: \n"+n3+" - "+n2+" - "+n1);
			}
		}
		else
		{
			System.out.print("ordem crescente: \n"+n3+" - "+n2+" - "+n1);
		}
	}
}
