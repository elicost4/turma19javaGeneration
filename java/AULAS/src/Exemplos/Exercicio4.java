package Exemplos;

import java.util.Scanner;

public class Exercicio4 {
	
	public static void main(String args[])
	{
		/*4. Escreva um sistema que leia três números inteiros e positivos (A, B, C) e
		calcule a seguinte expressão:*/
		
		Scanner leia = new Scanner(System.in);
		
		double a,b,c,d,r,s,x,y;
		
		System.out.print("Digite o valor de A: ");
		a = leia.nextDouble();
		System.out.print("Digite o valor de B: ");
		b = leia.nextDouble();
		System.out.print("Digite o valor de C: ");
		c = leia.nextDouble();
		
		x = (a+b);
		r = (x*x);
		
		y = (b+c);
		s = (y*y);
		
		d = (r+s)/2;
		
		System.out.printf("O valor de D é: %.2f",d);
	
	}
}
