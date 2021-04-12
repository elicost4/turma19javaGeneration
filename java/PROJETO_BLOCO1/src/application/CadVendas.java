package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Compra;
import entities.Console;
import entities.Jogo;
import entities.Loja;
import entities.Produto;

public class CadVendas {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		@SuppressWarnings("resource")
		Scanner leia = new Scanner(System.in);
		Loja loja = new Loja();
		
		char opcao = ' ';
		char opcaoCompra = ' ';
		
		do {
			System.out.println("Bem vindo a " + loja.getNome());
			System.out.print("Deseja compra [1 - SIM | 2 - N�O]: ");
			opcaoCompra = leia.next().charAt(0);
			
			if(opcaoCompra == '1') {
				Compra compra = new Compra();
				do {
					Produto produtosLoja[] = loja.getProdutosLoja();
					
					
					System.out.println("\n"+loja.getNome());
					System.out.print("Ol�, selecione a categoria desejada [1-JOGO | 2-CONSOLE | 3-FINALIZAR]: ");
					opcao = leia.next().charAt(0);
					
					int codProduto = 0;
					
					switch(opcao) {
						case '1':
							System.out.println();
							System.out.println("\nOs jogos d�sponiveis s�o: \n");
							System.out.println("Cod \tNome do Jogo \t\tValor Uni. \tEstoque");
							
							for(int indice = 0; indice <= 5; indice++) {
								Jogo jogo = (Jogo) produtosLoja[indice];
								System.out.print(jogo.getCodigo());
								System.out.print("\t" + jogo.getNome());
								System.out.print("\t\t" + jogo.getValorUnitario());
								System.out.println("\t\t" + jogo.getQtdeEstoque());
							}
							
							System.out.print("\nEscolha o Cod do Jogo (numeros ou 0 para voltar): ");
							codProduto = leia.nextInt();
						
							if (codProduto > 6) {
								System.out.println("Voc� n�o selecionou um c�digo v�lido\n");
							}
							else if (codProduto <= 6 && codProduto != 0 ) {
								System.out.print("Digite a quantidade que voc� deseja: ");
								int qtdeJogo = leia.nextInt();
								
								if(qtdeJogo > produtosLoja[codProduto].getQtdeEstoque()) {
									System.out.println("Valor inv�lido: Estoque insuficiente.");
								}else {
									compra.addProduto(produtosLoja[codProduto - 1], qtdeJogo);
									loja.getProdutosLoja()[codProduto - 1].tirarEstoque(qtdeJogo); // atualizaEstoque
									System.out.println("Seu produto foi adicionado ao carrinho");
									System.out.println();
								}
							}
							break;
							
							
						case '2':
							System.out.println();
							System.out.println("\nOs consoles dispon�veis s�o: \n");
							System.out.println("Cod \tConsole \t\tValor Uni. \tEstoque"); 
							
							for(int indice = 6; indice <= 9; indice++) {
								Console console = (Console) produtosLoja[indice];
								System.out.print(console.getCodigo());
								System.out.print("\t" + console.getMarca());
								System.out.print("\t\t" + console.getValorUnitario());
								System.out.println("\t\t" + console.getQtdeEstoque());
							}
							
							System.out.print("\nEscolha o Cod do Console (numeros ou 0 para voltar): ");
							codProduto = leia.nextInt();
							
							if(codProduto < 7 || codProduto > 10) 
							{
								System.out.println("Voc� n�o escolheu um c�digo v�lido\n");
							}
							
							else if ((codProduto >= 7 && codProduto <= 10) || codProduto != 0) 
							{
								System.out.print("Digite a quantidade que voc� deseja: ");
								int qntDeJogo = leia.nextInt();
								
								if (qntDeJogo > produtosLoja[codProduto].getQtdeEstoque()) 
								{
									System.out.println("Valor inv�lido: Estoque insuficiente.");
								}
								else 
								{
									compra.addProduto(produtosLoja[codProduto - 1], qntDeJogo);
									loja.getProdutosLoja()[codProduto - 1].tirarEstoque(qntDeJogo);
									System.out.println("Seu produto foi adicionado ao carrinho.\n");
									System.out.println();
								}
							}
							break;
							
						case '3':							
							int parcela = 0;
							char formaPagamento = ' ';
							
							do {
								System.out.print("Forma Pagamento [1 - A vista | 2 - D�bito | 3 - Cr�dito]: ");
								formaPagamento = leia.next().charAt(0);
								
								if(formaPagamento == '3') {
									do {
										System.out.println();
										System.out.print("Informe as parcelas [1 ou 2]: ");
										parcela = leia.nextInt();
										if(parcela < 1 || parcela > 2){
											System.out.println("N�o est� dispon�vel essa quantidade de parcelas");
										}
									}while(parcela < 1 || parcela > 2);
								}
								
								if(formaPagamento != '1' && formaPagamento != '2' && formaPagamento != '3') {
									System.out.println();
									System.out.println("Forma de pagamento inv�lida");
								}
								
							}while(formaPagamento != '1' && formaPagamento != '2' && formaPagamento != '3');
							
							compra.finalizarCompra(formaPagamento, parcela);
							loja.emitirNota(compra);
							
							break;
							
							
						default:
							System.out.print("Voc� n�o selecionou uma op��o v�lida. Tente novamente.\n");
							break;
					}
				} while (opcao != '3');
			}
		}while(opcaoCompra == '1');
		System.out.println();
		System.out.println("Volte Sempre");
	}

}