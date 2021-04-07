package Lista3;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		/*Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de 21 anos.
		Total de pessoas com mais de 50 anos. O programa termina quando idade for =-99. (WHILE)*/
		
		Scanner leia = new Scanner(System.in);
		
		int idade=0;
		int somaPessoasMenor21=0, somaPessoasMaior50=0;
		
		while (idade != -99) {
			System.out.printf("Digite a idade: [para sair digite -99]");
			idade = leia.nextInt();
			if (idade < 21 && idade > 0) {
				somaPessoasMenor21++;
			}
			else if (idade > 50) {
				somaPessoasMaior50++;
			}
		}
		System.out.printf("A soma de pessoas com idade menor que 21 anos é: %d\n",somaPessoasMenor21);
		System.out.printf("A soma de pessoas com idade maior que 50 anos é: %d\n",somaPessoasMaior50);
	}
}
