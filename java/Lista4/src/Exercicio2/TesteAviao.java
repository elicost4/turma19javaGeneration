package Exercicio2;

import java.util.Scanner;

public class TesteAviao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		Aviao aviao1 = new Aviao();

		System.out.print("Digite a marca do avi�o: ");
		aviao1.marca = leia.next();
		System.out.print("Qual a cia Aerea: ");
		aviao1.ciaAerea = leia.next();
		System.out.print("Qual modelo da aeronave: ");
		aviao1.modelo = leia.next();
		System.out.print("Tipo de voo: 1-Nacional / 2-Internacional: ");
		aviao1.nacionalInternacional = leia.next().charAt(0);

		System.out.printf("\n\nInforma��es da aeronave: \nFabricante: %s \nCia A�rea: %s \nModelo: %s \nTipo de v�o: %s", aviao1.marca, aviao1.ciaAerea, aviao1.modelo,aviao1.tipoVoo());

	}

}
