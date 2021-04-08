package Exercicio1;

import java.util.Scanner;

public class TesteCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		Cliente cliente1 = new Cliente();
		
		System.out.print("Nome do cliente: ");
		cliente1.nome = leia.next();
		System.out.print("CPF do cliente: ");
		cliente1.cpf = leia.next();
		System.out.print("Idade do cliente: ");
		cliente1.idade = leia.nextInt();
		System.out.print("Digite seu email: ");
		cliente1.email = leia.next();
		System.out.print("Forma de pagamento: 1-Crédito / 2-Débito / 3-Dinheiro: ");
		cliente1.formaPagamento = leia.next().charAt(0);
		
		System.out.printf("\n\nDados do cliente: \nNome: %s\nCPF: %s\nIdade: %d\nEmail: %s\nForma de Pagamento: %s",cliente1.nome,cliente1.cpf,cliente1.idade,cliente1.email,cliente1.pagamento());
	}
}
