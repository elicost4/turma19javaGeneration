package application;

import entity.Cachorro;
import entity.Cavalo;
import entity.Preguica;

public class TestaAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Cachorro dog = new Cachorro("Rex",2);
		Cavalo cavalo = new Cavalo("Napoleão",12);
		Preguica preguica = new Preguica("lentonilda",5);
		
		dog.Correr();
		cavalo.Correr();
		preguica.subirArvore();
		
		dog.emitirSom();
		cavalo.emitirSom();
		preguica.emitirSom();
		
	}
}
