package Lista3;

import java.util.Scanner;

public class Exercicio4 {
	
	public static void main(String[] args) {
		
		/*4 - Uma empresa desenvolveu uma pesquisa para saber as caracter�sticas psicol�gicas
		 * dos indiv�duos de uma regi�o. Para tanto, a cada uma das pessoas era perguntado:
		 * idade, sexo (1-feminino / 2-masculino / 3-Outros), e as op��es (1, se a pessoa era
		 * calma; 2, se a pessoa era nervosa e 3, se a pessoa era agressiva).
		 * Pede-se para elaborar um sistema que permita ler os dados de 150 pessoas, calcule e mostre:
		 * (WHILE)
		o n�mero de pessoas calmas; 
		o n�mero de mulheres nervosas; 
		o n�mero de homens agressivos; 
		o n�mero de outros calmos;
		o n�mero de pessoas nervosas com mais de 40 anos; 
		o n�mero de pessoas calmas com menos de 18 anos.
		*/
		
		Scanner leia = new Scanner(System.in);
		
		final int LIMITE=150;
		int idade=0;
		int contador=1;
		int pessoasCalmas=0;
		int mulheresNervosas=0;
		int homensAgressivos=0;
		int outrosCalmos=0;
		int pessoasNervosasMais40=0;
		int pessoasCalmasMenos18=0;
		char sexo;
		char temperamento;
		char continua='S';
		
		
		
		while (continua == 'S' && contador <= LIMITE) {
			System.out.print("Informe sua idade: ");
			idade = leia.nextInt();
			System.out.print("Digite 1-feminino / 2-masculino / 3-Outros: ");
			sexo = leia.next().charAt(0);
			System.out.print("Digite:\n1 - se for uma pessoa calma\n"
					+ "2 - se for uma pessoa nervosa\n"
					+ "3 - se for uma pessoa agressiva\n");
			temperamento = leia.next().charAt(0);
			
			if (contador != LIMITE) {
				System.out.print("Deseja continuar com a pesquisa S-sim ou N-n�o? :");
				continua = leia.next().toUpperCase().charAt(0);
			}
			if (temperamento == '1') {
				pessoasCalmas++;
			}
			if (sexo == '1' && temperamento == '2') {
				mulheresNervosas++;
			}
			if (sexo == '2' && temperamento == '3') {
				homensAgressivos++;
			}
			if (sexo == '3' && temperamento == '1' ) {
				outrosCalmos++;
			}
			if (temperamento == '2' && idade >= 40) {
				pessoasNervosasMais40++;
			}
			if (temperamento == '1' && idade < 18) {
				pessoasCalmasMenos18++;
			}
			contador++;
			
		}
			System.out.println("\n\nN� pessoas calmas: "+pessoasCalmas);
			System.out.println("N� mulheres nervosas: "+mulheresNervosas);
			System.out.println("N� homens agressivos:"+homensAgressivos);
			System.out.println("N� de outros calmos: "+outrosCalmos);
			System.out.println("N� pessoas mais de 40 nervosas: "+pessoasNervosasMais40);
			System.out.println("N� pessoas calmas menos de 18 :"+pessoasCalmasMenos18);
			
			System.out.println("\nTHE END");
			
	}
}
