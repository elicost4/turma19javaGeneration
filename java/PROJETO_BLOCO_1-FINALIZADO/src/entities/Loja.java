package entities;

public class Loja {
	
	//Atributos
	private String nome;
	private String cnpj;
	private int notaFiscal;
	
	//teste
	private Produto[] produtosLoja = new Produto[10];

	
	//Construtores
	public Loja() {
		this.nome = "Mundo Geek";
		this.cnpj = "123456789/00123";
		this.notaFiscal = 0;
		
		//teste
		produtosLoja[0] = new Jogo("Jogo Battlefield    ", 0, 50.0, "BATTLEFIELD");
		produtosLoja[1] = new Jogo("Jogo Mortal Kombat  ", 1, 100.0, "MORTAL KOMBAT");
		produtosLoja[2] = new Jogo("Jogo Minecraft      ", 2, 150.0, "MINECRAFT");
		produtosLoja[3] = new Jogo("Jogo The Sims 4     ", 3, 200.20, "THE SIMS4");
		produtosLoja[4] = new Jogo("Jogo Mario Party 9  ", 4, 250.85, "MARIO PARTY 9");
		produtosLoja[5] = new Jogo("Jogo Fifa 2021      ", 5, 20.50, "FIFA 2021");
		produtosLoja[6] = new Console("Console Nintendo     ", 6, 1200.55, "NINTENDO");
		produtosLoja[7] = new Console("Console PC Gamer     ", 7, 2500.80, "PC GAMER");
		produtosLoja[8] = new Console("Console Playstation 5", 8, 4200.90, "PLAYSTATION 5");
		produtosLoja[9] = new Console("Console X-Box One X  ", 9, 2780.15, "X-BOX ONE X");
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
	
	//M�todos

	public void emitirNota(Compra compra) {
		this.notaFiscal += 1;
		System.out.println();
		System.out.println();
		System.out.println("=================================================================");
		System.out.println(this.nome);
		System.out.println("CNPJ: " + this.cnpj);
		System.out.println("Nota Fiscal: " + this.getNotaFiscal());
		System.out.println("-----------------------------------------------------------------");
		System.out.println("PRODUTO \t\t\tQTD\tVALOR UNI. \tTOTAL");
		for(int indiceProd = 0; indiceProd < compra.getListaProdutos().size(); indiceProd++) {
			System.out.print(compra.getListaProdutos().get(indiceProd).getDescricao());
			System.out.print("\t\t" + compra.getListaQuantidade().get(indiceProd));
			System.out.printf("\tR$ %.2f", compra.getListaProdutos().get(indiceProd).getValorUnitario());
			System.out.printf("\tR$ %.2f\n", compra.getListaValorTotalCadaProduto().get(indiceProd));
		}
		System.out.println("-----------------------------------------------------------------");
		System.out.printf("Valor Total:\t   R$ %.2f\n" , compra.getValorTotal());
		System.out.printf("Valor Imposto:\t   R$ %.2f\n" , compra.getValorImposto());
		System.out.printf("Valor Desconto:\t   R$ %.2f\n" , compra.getValorDesconto());
		System.out.printf("Valor Juros:\t   R$ %.2f\n" , compra.getValorJuros());
		System.out.printf("Valor Parcelas:\t   R$ %.2f\n" , compra.getValorParcelas());
		System.out.println("Qtde. Parcelas:\t   " + compra.getQuantidadeParcelas());
		System.out.println("=================================================================");
		System.out.println();
		System.out.println();
	}
}