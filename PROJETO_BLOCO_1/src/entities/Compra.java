package entities;

import java.util.ArrayList;
import java.util.List;

public class Compra {
	
	private List<Produto> listaProdutos;
	private List<Integer> listaQuantidade;
	private List<Double> listaValorTotalCadaProduto;
	private int quantidadeParcelas;
	private double valorTotal;
	private double valorImposto; //9% - Falta Fazer
	private double valorDesconto; //10%
	private double valorJuros; //10% e 20%
	private double valorParcelas;
	
	public Compra() {
		listaProdutos = new ArrayList<Produto>();
		listaQuantidade = new ArrayList<Integer>();
		listaValorTotalCadaProduto = new ArrayList<Double>();
		this.valorImposto = 0;
		this.valorDesconto = 0;
		this.valorJuros = 0;
		this.quantidadeParcelas = 0;
		this.valorParcelas = 0;
	}
	
	public List<Produto> getListaProdutos() {
		return listaProdutos;
	}

	public List<Integer> getListaQuantidade() {
		return listaQuantidade;
	}

	public List<Double> getListaValorTotalCadaProduto() {
		return listaValorTotalCadaProduto;
	}

	public double getValorTotal() {
		return valorTotal;
	}
	
	public double getValorImposto() {
		return valorImposto;
	}
	
	
	
	
	public double getValorDesconto() {
		return valorDesconto;
	}
	
	public double getValorJuros() {
		return valorJuros;
	}
	
	public int getQuantidadeParcelas() {
		return quantidadeParcelas;
	}
	
	public double getValorParcelas() {
		return valorParcelas;
	}

	
	//Métodos publicos
	public void addProduto(Produto prod, int quantidade) {
		this.listaProdutos.add(prod);	
		this.listaQuantidade.add(quantidade);
	}

	public void finalizarCompra(char formaPagamento, int parcela) {
		this.calculoValorTotalCadaProduto();
		this.calcularTotalCompra();
		this.calcularImposto();
		this.calcularFormaPagamento(formaPagamento, parcela);	
		this.calcularParcela(parcela);	
	}
	
	//Métodos auxiliares
	private void calculoValorTotalCadaProduto() {
		
		for(int indice = 0; indice < listaProdutos.size(); indice++) {
			Produto produto = listaProdutos.get(indice); 
			int quantidades = listaQuantidade.get(indice); 
			double valorTotal = produto.getValorUnitario() * quantidades;
			
			listaValorTotalCadaProduto.add(valorTotal);
		}
	}
	
	private void calcularTotalCompra() {		
		for(int indice = 0; indice < listaValorTotalCadaProduto.size(); indice++) {
			this.valorTotal += this.listaValorTotalCadaProduto.get(indice);
		}	
	}
	
	private void calcularFormaPagamento(char formaPagamento, int parcela) {
		
		// 1 = Vista
		// 2 = Debito
		// 3 = Crédito
		
		this.quantidadeParcelas = parcela;
		
		switch(formaPagamento) {
			case '1':
				this.valorDesconto = this.valorTotal * 0.1;
				this.valorTotal -= this.valorDesconto;
				break;
			case '3':
				if(parcela == 1) {
					this.valorJuros = this.valorTotal * 0.1;
					this.valorTotal += this.valorJuros; 
				}else if(parcela == 2) {
					this.valorJuros = this.valorTotal * 0.2;
					this.valorTotal += this.valorJuros; 
				}
				break;
		}
	}
	
	private void calcularImposto() {
		this.valorImposto = this.valorTotal * 0.09;
	}
	
	private void calcularParcela(int parcelas) {
		if(parcelas != 0) {
			this.valorParcelas = this.valorTotal / parcelas;
		}
	}
	
}