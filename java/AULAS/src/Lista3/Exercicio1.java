package Lista3;

public class Exercicio1 {

	public static void main(String[] args) {
		
		/*Informar todos os números de 1000 a 1999 que quando divididos por 11 obtemos resto = 5. (FOR)*/
		
		System.out.println("Números (entre 1000 e 1999) que divido por 11 sobram 5: \n");
		for (int x=1000;x<2000;x++) {
			if (x %11 == 5) {
				System.out.printf("%d\n",x);
			}
		}
	}
}
