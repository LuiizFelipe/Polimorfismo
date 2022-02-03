package CollectionX;
import java.lang.System.Logger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;
public class Dados {

	public static void main(String[] args) {
		String Dados1 = "Camisetas";
		String Dados2 = "Shorts";
		String Dados3 = "Blusa";
		String Dados4 = "Calça";
		
		ArrayList<String> Dados  = new ArrayList();
		System.out.println(Dados);
		
		Dados.add(" Mostruario da Loja  ");
		
		System.out.println(Dados);
		Dados.add(Dados1);
		Dados.add(Dados2 );
		Dados.add(Dados3 );
		Dados.add(Dados4 );
		
		System.out.println(Dados);
		Scanner x = new Scanner(System.in);
		System.out.println(" Digite a Roupa que gostaria?");
		//Dados=x.nextLine();
		
		
		
/*	Collection<String> x = new ArrayList();
	x.add("Camisa");
	x.add("Short");
	x.add("Blusa");
	x.add("Calça");
	x.add("Meia");
	
	
	System.out.println(Dados);*/
	
	
	}
	
}
