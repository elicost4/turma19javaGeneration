package Exemplos;

import java.util.Scanner;

public class Exercicio3
{
	public static void main(String args[])
	{
		/*3. Faça um sistema que leia o tempo de duração de um evento em uma fábrica
		expressa em segundos e mostre-o expresso em horas, minutos e segundos.*/
				
		Scanner leia = new Scanner(System.in);
		//variaveis
		double seg, tempoDuracao, hr, min;
		
		//entradas
		System.out.print("Digite o duração do evento em segundos: ");
		tempoDuracao = leia.nextDouble();
		
		hr = (tempoDuracao / 3600);
		min = ((tempoDuracao % 3600) / 60);
		seg = ((tempoDuracao % 3600) % 60);
		
		System.out.printf("Duração total do evento: %.0fh %.0fm %.0fs",hr,min,seg);
		
	}
}
