/*
 * Implemente um programa que crie os 3 tipos de animais definidos no exerc�cio
anterior e invoque o m�todo que emite o som de cada um de forma polim�rfica, isto
�, independente do tipo de animal.
 */
package exercicio2;

public class Animais extends Animais1 {
		public static void main(String[] args) {
			Cachorro cachorro = new Cachorro();
			Cavalo cavalo = new Cavalo();
			Pregui�a preguica = new Pregui�a();
			
			cachorro.setAcao("Correr");
			cachorro.setNome("Floki");
			cachorro.setIdade(2);
			
			
			cavalo.setAcao("Demandar");
			cavalo.setNome("Cavalo Negro");
			cavalo.setIdade(6);
		
			
			preguica.setAcao("Subir em arvore");
			preguica.setNome("Sid");
			preguica.setIdade(11);
			
			System.out.println("Nome do cachorro: "+cachorro.getNome()+"		Idade: "+cachorro.getIdade() +"		Ac�o: "+cachorro.getAcao() +"			Som: "+cachorro.getEmitirSom());
			System.out.println("Nome do cavalo: "+cavalo.getNome()+"			Idade: "+cavalo.getIdade() +"		Ac�o: "+cavalo.getAcao()+"				Som: "+cavalo.getEmitirSom());
			System.out.println("Nome do pregui�a: "+preguica.getNome()+"		Idade: "+preguica.getIdade() +"		Ac�o: "+preguica.getAcao()+"			Som: "+preguica.getEmitirSom());
			
			

		}

	}





