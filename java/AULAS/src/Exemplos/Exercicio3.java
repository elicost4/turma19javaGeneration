package Exemplos;

import java.util.Scanner;

public class Exercicio3
{
	public static void main(String args[])
	{
		/*3. Fa�a um sistema que leia o tempo de dura��o de um evento em uma f�brica
		expressa em segundos e mostre-o expresso em horas, minutos e segundos.*/
				
		Scanner leia = new Scanner(System.in);
		//variaveis
		double seg, tempoDuracao, hr, min;
		
		//entradas
		System.out.print("Digite o dura��o do evento em segundos: ");
		tempoDuracao = leia.nextDouble();
		
		hr = (tempoDuracao / 3600);
		min = ((tempoDuracao % 3600) / 60);
		seg = ((tempoDuracao % 3600) % 60);
		
		System.out.printf("Dura��o total do evento: %.0fh %.0fm %.0fs",hr,min,seg);
		
	}
}
