package Exercicio2;

public class Aviao {
	
	public String marca;
	public String ciaAerea;
	public String modelo;
	public char nacionalInternacional;
	public int anoFabricacao;
	public int qtdMotores;
	
	//metodos
	public String tipoVoo () {
		String recebeVoo = " ";
		if(nacionalInternacional == '1') {
			recebeVoo = "Voo Nacional";
		}
		else if(nacionalInternacional == '2') {
			recebeVoo = "Voo Internacional";
		}
		return recebeVoo;	
		
	}

}
