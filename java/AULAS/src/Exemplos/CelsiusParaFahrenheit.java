package Exemplos;

import java.util.Scanner;

public class CelsiusParaFahrenheit
{
	public static void main(String[] args)
	{
		Scanner leia = new Scanner(System.in);
		double celsius;
		double calculo;
		
		System.out.print("Digite a temperatura em Celsius: ");
		celsius = leia.nextInt();
		
		calculo = (celsius*1.8)+32;
		
		System.out.print(celsius +"ºC em fahrenheit é: "+calculo+"ºC");
	}
}
