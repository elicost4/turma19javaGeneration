package entities;

public abstract class Produto {
	
	private String descricao;
	private int codigo;
	private double valorUnitario;
	private int qtdeEstoque; 
	 
	public void incluirEstoque(int valorSerIncluido) {
		this.qtdeEstoque += valorSerIncluido;
	}
	
	public void tirarEstoque(int valorSerExcluido) {
		if(this.getQtdeEstoque() >= valorSerExcluido) {
			this.qtdeEstoque -= valorSerExcluido;
		}
	}
	
	//Métodos Especiais
	public Produto(String descricao, int codigo, double valorUnitario) {	
		super();
		this.descricao = descricao;
		this.codigo = codigo;
		this.valorUnitario = valorUnitario;
		this.qtdeEstoque = 10;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public int getCodigo() {
		return codigo;
	}
	
	
	public double getValorUnitario() {
		return valorUnitario;
	}
	
	public void setValorUnitario(double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}
	
	public int getQtdeEstoque() {
		return qtdeEstoque;
	}
	
	 	 
}