package Exemplos;

import java.util.Scanner;

public class Exercicio7 {
	/*7. Um sistema de equa??es lineares do tipo: 
	, pode ser resolvido segundo mostrado abaixo :*/
	
	public static void main(String args[]) {
		
		Scanner leia = new Scanner(System.in);
				
		double a,b,c,d,e,f,x,y;
		
		System.out.print("Entre com o valor de A: ");
		a = leia.nextDouble();
		System.out.print("Entre com o valor de B: ");
		b = leia.nextDouble();
		System.out.print("Entre com o valor de C: ");
		c = leia.nextDouble();
		System.out.print("Entre com o valor de D: ");
		d = leia.nextDouble();
		System.out.print("Entre com o valor de E: ");
		e = leia.nextDouble();
		System.out.print("Entre com o valor de F: ");
		f = leia.nextDouble();
		
		x = ((c*e)-(b*f)) / ((a*e)-(b*d));
		y = ((a*f)-(c*d)) / ((a*e)-(b*d));
		
		System.out.printf("\rO valor de X ?: %.2f",x);
		System.out.printf(" e valor de Y ?: %.2f",y);		
		
	}

}
