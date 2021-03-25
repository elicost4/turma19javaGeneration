package Exemplos;

import java.util.Scanner;

public class Exercicio1
{
	public static void main(String args[])
	{
		/*1. Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e
		dias e mostre-a expressa apenas em dias.*/
		
		Scanner leia = new Scanner(System.in);
		
		int anos, meses, dias, idadeDias;
		
		System.out.print("Digite sua idade em anos: ");
		anos = leia.nextInt();
		System.out.print("Digite sua idade em meses: ");
		meses = leia.nextInt();
		System.out.print("Digite sua idade em dias: ");
		dias = leia.nextInt();
		
		idadeDias = ((anos*365)+(meses*30)+dias);
		
		System.out.print("Você tem "+idadeDias+" dias de vida");		
		
	}
}
