package Exercicio1;

public class Cliente {
	
	//atributos
	public String nome,cpf,email;
	public int idade;
	public char formaPagamento;
	
	public String pagamento() {
		String pagaCom = " ";
		if (formaPagamento == '1') {
			pagaCom = "Cartão de Crédito";
		} else if (formaPagamento == '2') {
			pagaCom = "Cartão de Débito";
		} else if (formaPagamento == '3') {
			pagaCom = "Dinheiro";
		} return pagaCom;
		
	}
	

}
