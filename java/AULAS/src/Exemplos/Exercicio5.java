package Exemplos;

import java.util.Scanner;

public class Exercicio5 {
	/*5. Fa�a um sistema que leia as 3 notas de um aluno e calcule a m�dia final deste
	aluno. Considerar que a m�dia � ponderada e que o peso das notas �: 2,3 e 5,
	respectivamente.*/
	
	public static void main(String args[])
	{
		Scanner leia =  new Scanner(System.in);
		String nome;
		double mediaP=0;
		double nota1=0, nota2=0, nota3=0;
		double peso1=2, peso2=3, peso3=5;
		
		System.out.print("Entre com seu nome: ");
		nome = leia.next();
				
		System.out.print("Entre com a 1� nota: ");
		nota1 = leia.nextDouble();
		
		System.out.print("Entre com a 2� nota: ");
		nota2 = leia.nextDouble();
		
		System.out.print("Entre com a 3� nota: ");
		nota3 = leia.nextDouble();
				
		nota1 = nota1*peso1;
		nota2 = nota2*peso2;
		nota3 = nota3*peso3;
		mediaP = (nota1 + nota2+ nota3) / 10;
		
		System.out.printf("Aluno: "+nome+"\nSua m�dia �: %.2f",mediaP);
		
		
			
	}

	private static void cls() {
		// TODO Auto-generated method stub
		
	}
}
