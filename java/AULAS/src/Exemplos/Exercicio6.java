package Exemplos;

import java.util.Scanner;

public class Exercicio6 {
	
	/*6. Construa um programa em c que, tendo como dados de entrada dois pontos
	quaisquer no plano, P(x1, y1) e P(x2, y2), escreva a dist?ncia entre eles. A f?rmula*/
	
	public static void main(String[] args) {
		
		Scanner leia =  new Scanner(System.in);
		
		int x1,x2,y1,y2;
		double d;
		
		System.out.print("Entre com o valor de x1: ");
		x1 = leia.nextInt();		
		System.out.print("Entre com o valor de x2: ");
		x2 = leia.nextInt();		
		System.out.print("Entre com o valor de y1: ");
		y1 = leia.nextInt();		
		System.out.print("Entre com o valor de y2: \r");
		y2 = leia.nextInt();
		
		d = Math.sqrt(Math.pow(x1-x2, 2) + Math.pow(y2-y1, 2));
		//Math.pow ? para potencia??o e Math.sqrt ? para raiz quadrada
		
		System.out.printf("O resultado da express?o ?: %.4f",d);
		//%.4f ? o arredondamento para 4 casas.
				
	}

}
