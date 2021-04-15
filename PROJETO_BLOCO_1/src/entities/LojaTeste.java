package entities;

public class LojaTeste {
	
	//Atributos
	private String nome;
	private String cnpj;
	private int notaFiscal;
	
	//teste
	private Produto[] produtosLoja = new Produto[10];

	
	//Construtores
	public LojaTeste() {
		this.nome = "Mundo Geek";
		this.cnpj = "123456789/00123";
		this.notaFiscal = 0;
		
		//teste
		produtosLoja[0] = new Jogo("Jogo", 1, 50.0, "BATTLEFIELD");
		produtosLoja[1] = new Jogo("Jogo", 2, 100.0, "MORTAL KOMBAT");
		produtosLoja[2] = new Jogo("Jogo", 3, 150.0, "MINECRAFT");
		produtosLoja[3] = new Jogo("Jogo", 4, 200.20, "THE SIMS4");
		produtosLoja[4] = new Jogo("Jogo", 5, 250.85, "MARIO PART9");
		produtosLoja[5] = new Jogo("Jogo", 6, 20.50, "FIFA 2021");
		produtosLoja[6] = new Console("Console", 7, 1200.55, "NINTENDO");
		produtosLoja[7] = new Console("Console", 8, 2500.80, "PC GAMER");
		produtosLoja[8] = new Console("Console", 9, 4200.90, "PLAYSTAION");
		produtosLoja[9] = new Console("Console", 10, 2780.15, "X-BOX ONE");
	}

	//Encapsulamento
	public String getNome() {
		return nome;
	}

	public String getCnpj() {
		return cnpj;
	}
	
	public int getNotaFiscal() {
		return this.notaFiscal;
	}
		
	public Produto[] getProdutosLoja() {
		return produtosLoja;
	}
	
	//Métodos

	public void emitirNota(Compra compra) {
		this.notaFiscal += 1;
		System.out.println();
		System.out.println();
		System.out.println("============================================================");
		System.out.println(this.nome);
		System.out.println("CNPJ: " + this.cnpj);
		System.out.println("Nota Fiscal: " + this.getNotaFiscal());
		System.out.println("------------------------------------------------------------");
		System.out.println("Produto \tQuantidade \tValor Uni. \tTotal");
		for(int indiceProd = 0; indiceProd < compra.getListaProdutos().size(); indiceProd++) {
			System.out.print(compra.getListaProdutos().get(indiceProd).getDescricao());
			System.out.print("\t\t" + compra.getListaQuantidade().get(indiceProd));
			System.out.printf("\t\tR$ %.2f", compra.getListaProdutos().get(indiceProd).getValorUnitario());
			System.out.printf("\tR$ %.2f\n", compra.getListaValorTotalCadaProduto().get(indiceProd));
		}
		System.out.println("------------------------------------------------------------");
		System.out.printf("Valor Total:\t   R$ %.2f\n" , compra.getValorTotal());
		System.out.printf("Valor Imposto:\t   R$ %.2f\n" , compra.getValorImposto());
		System.out.printf("Valor Desconto:\t   R$ %.2f\n" , compra.getValorDesconto());
		System.out.printf("Valor Juros:\t   R$ %.2f\n" , compra.getValorJuros());
		System.out.printf("Valor Parcelas:\t   R$ %.2f\n" , compra.getValorParcelas());
		System.out.println("Qtda. Parcelas:\t   " + compra.getQuantidadeParcelas());
		System.out.println("============================================================");
		System.out.println();
		System.out.println();
	}
}