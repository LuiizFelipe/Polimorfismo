[13:10, 02/02/2022] +55 11 97198-8375: package Interface;
// metodos abstratos (nao executam tarefa)
// nao tem instrucoes { } 
// So posso ter metodos abstratos em 2 lugares = Interfaces ou Classes abstratar

public interface Radio {

	public abstract void  ligar();
	public abstract void desligar();
	public abstract void maisVol();
	public abstract void menosVol();
	public abstract void trocarEstacao();
	
	
}
[13:10, 02/02/2022] +55 11 97198-8375: package Polimorfismo;
//mesmo metodo com a mesma assinatura em classes diferentes
//ex metodo que tem um comportamento na classe mae e na classe filha tem um comportamento diferente
public class Animal {

	
	
	
	public void emitirSom() {
		
		System.out.println("Som Generico");
	}
	

	public void movimentar() {
		
		System.out.println("Movimento Generico");
		
	}
}
[13:10, 02/02/2022] +55 11 97198-8375: package Polimorfismo;

public class Cachorro extends Mamifero {

	@Override
	public void emitirSom()

	{
		System.out.println("Au Au");
	}
}
[13:10, 02/02/2022] +55 11 97198-8375: package Polimorfismo;

public class Canguru extends Mamifero {

	@Override
	public void movimentar()
 
 
 {
	 System.out.println("Pula");
	
 }	
}
[13:10, 02/02/2022] +55 11 97198-8375: package Polimorfismo;

public class Mamifero extends Animal {

	@Override
	public void emitirSom()
 
 
 {
	 System.out.println("Som de mamifero");
 }
 @Override
 public void movimentar()
 {
	 System.out.println("Correr");
 }
}
[13:11, 02/02/2022] +55 11 97198-8375: package Polimorfismo;
//1
// Sobrecarga -> mesmo método, na mesma classe  com assinaturas diferentes

public class Sobrecarga {
 
 public void soma(int x, int y)//assinatura do metodo (tipos de parametros e quantidade)
 { 
	 
	 System.out.println(x+y);
	 
 }
  public void soma(int x, int y, int z)//tres parametros do tipo int
  {
	  System.out.println(x+y+z);
  }
  
  public void soma(double x, int y) // dois parametros de tipos diferentes
  {
	  System.out.println(x+y);
  }
  
  
}
[13:11, 02/02/2022] +55 11 97198-8375: package Polimorfismo;

public class TesteSobrecarga {
 
	public static void main (String[] args) {
		Sobrecarga s = new Sobrecarga ();
		
		s.soma(5, 2);
		s.soma(7.5, 6);
		s.soma(2, 4, 6);
	}
}
[13:11, 02/02/2022] +55 11 97198-8375: package Polimorfismo;

public class TesteSobreposicao {

	public static void main(String[] args) {
		
		Animal a = new Animal ();
		Mamifero m = new Mamifero ();
		Cachorro c1 = new Cachorro ();
		Canguru c2 = new Canguru ();
		
		a.emitirSom();
		m.emitirSom();
		c1.emitirSom();
		c2.emitirSom();
		
		
		a.movimentar();
		m.movimentar();
		c1.movimentar();
		c2.movimentar();

	}

}
[13:11, 02/02/2022] +55 11 97198-8375: acho que ta tudo ai







package PolimInterface;

public class ex {

}
