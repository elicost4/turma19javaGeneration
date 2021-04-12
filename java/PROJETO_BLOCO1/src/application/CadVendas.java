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
			System.out.print("Deseja compra [1 - SIM | 2 - NÃO]: ");
			opcaoCompra = leia.next().charAt(0);
			
			if(opcaoCompra == '1') {
				Compra compra = new Compra();
				do {
					Produto produtosLoja[] = loja.getProdutosLoja();
					
					
					System.out.println("\n"+loja.getNome());
					System.out.print("Olá, selecione a categoria desejada [1-JOGO | 2-CONSOLE | 3-FINALIZAR]: ");
					opcao = leia.next().charAt(0);
					
					int codProduto = 0;
					
					switch(opcao) {
						case '1':
							System.out.println();
							System.out.println("\nOs jogos dísponiveis são: \n");
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
								System.out.println("Você não selecionou um código válido\n");
							}
							else if (codProduto <= 6 && codProduto != 0 ) {
								System.out.print("Digite a quantidade que você deseja: ");
								int qtdeJogo = leia.nextInt();
								
								if(qtdeJogo > produtosLoja[codProduto].getQtdeEstoque()) {
									System.out.println("Valor inválido: Estoque insuficiente.");
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
							System.out.println("\nOs consoles disponíveis são: \n");
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
								System.out.println("Você não escolheu um código válido\n");
							}
							
							else if ((codProduto >= 7 && codProduto <= 10) || codProduto != 0) 
							{
								System.out.print("Digite a quantidade que você deseja: ");
								int qntDeJogo = leia.nextInt();
								
								if (qntDeJogo > produtosLoja[codProduto].getQtdeEstoque()) 
								{
									System.out.println("Valor inválido: Estoque insuficiente.");
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
								System.out.print("Forma Pagamento [1 - A vista | 2 - Débito | 3 - Crédito]: ");
								formaPagamento = leia.next().charAt(0);
								
								if(formaPagamento == '3') {
									do {
										System.out.println();
										System.out.print("Informe as parcelas [1 ou 2]: ");
										parcela = leia.nextInt();
										if(parcela < 1 || parcela > 2){
											System.out.println("Não está disponível essa quantidade de parcelas");
										}
									}while(parcela < 1 || parcela > 2);
								}
								
								if(formaPagamento != '1' && formaPagamento != '2' && formaPagamento != '3') {
									System.out.println();
									System.out.println("Forma de pagamento inválida");
								}
								
							}while(formaPagamento != '1' && formaPagamento != '2' && formaPagamento != '3');
							
							compra.finalizarCompra(formaPagamento, parcela);
							loja.emitirNota(compra);
							
							break;
							
							
						default:
							System.out.print("Você não selecionou uma opção válida. Tente novamente.\n");
							break;
					}
				} while (opcao != '3');
			}
		}while(opcaoCompra == '1');
		System.out.println();
		System.out.println("Volte Sempre");
	}

}