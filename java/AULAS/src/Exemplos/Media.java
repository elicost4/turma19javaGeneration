package Exemplos;

import java.util.Scanner;

public class Media {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		double nota1=0, nota2=0, nota3=0, nota4=0, media;
		 System.out.print("Digite a 1� nota [0-10]: ");
		 nota1=leia.nextDouble();
		 System.out.print("Digite a 2� nota [0-10]: ");
		 nota2=leia.nextDouble();
		 System.out.print("Digite a 3� nota [0-10]: ");
		 nota3=leia.nextDouble();
		 System.out.print("Digite a 4� nota [0-10]: ");
		 nota4=leia.nextDouble();
		 
		 media = (nota1 + nota2 + nota3 + nota4) / 4;
		 
		 System.out.printf("Sua m�dia �: %.2f\n",media);
		 
		 if (media>=7) {
			 System.out.println("Parab�ns, voc� foi APROVADO!");
		 }	else {
			 System.out.println("Infelizmente sua nota n�o foi suficiente, voc� foi REPROVADO!");
		 }
	}

}
