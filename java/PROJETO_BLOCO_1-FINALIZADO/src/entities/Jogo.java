package entities;

public class Jogo extends Produto {

	private String nome;

	public Jogo(String descricao, int codigo, double valorUnitario, String nome) {
		super(descricao, codigo, valorUnitario);
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}