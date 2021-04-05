package Lista2;

import java.util.Scanner;

public class Exercicio3 {
	
	public static void main(String[] args)
	{
		/*3- Faça um programa que receba a idade de uma pessoa e mostre na saída em qual
	categoria ela se encontra:
	10-14 infantil
	15-17 juvenil
	18-25 adulto*/
		
		Scanner leia = new Scanner(System.in);
		int idade;
		
		System.out.println("Informe sua idade: ");
		idade = leia.nextInt();
		leia.nextLine();
		
		if (idade>=10 && idade<=14)
		{
			System.out.println("Você se enquadra na categoria INFANTIL");
		}
		else if (idade>=15 && idade<=17)
		{
			System.out.println("Você se enquadra na categoria JUVENIL");
		}
		else if (idade>=18 && idade<=25)
		{
			System.out.println("Você se enquadra na categoria ADULTO");
		}
		else
		{
			System.out.println("Infelizmente você não se enquadra em nenhuma de nossas categorias!");
		}
	}

}
