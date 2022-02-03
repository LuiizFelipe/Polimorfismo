package CollectionX;
import java.util.ArrayList;
import java.util.Scanner;

public class TabelaInclusa {

	public static void main(String[] args) {
		int op;
		Scanner leia = new Scanner(System.in);
		ArrayList<String> estoque = new ArrayList<>();
		
		
		do {	
		System.out.println("\n\t\tBem-Vindo Ao Sistema De Controle De Estoque!");
		System.out.println("\n(1) - Adicionar Produtos ao Estoque");
		System.out.println("\n(2)- Remover Produtos ao Estoque");
		System.out.println("\n(3) - Atualizar Produtos do Estoque");
		System.out.println("\n(4)- Mostrar Todos Os Produtos Do Estoque");
		System.out.println("\n(5)- Encerrar.");
		op=leia.nextInt();
		
		
		switch (op) {
		case 1:
		
		leia.nextLine();
		System.out.println("\nDigite o Produto que deseja adicionar ao estoque:");
		String produto = leia.nextLine();
		estoque.add(produto);
		System.out.println(estoque);
		break;
		case 2:
			leia.nextLine();
			System.out.println("\nDigite o Produto que deseja Remover do estoque:\"");
			String produtoX=leia.nextLine();
			if(estoque.contains(produtoX)) {
				estoque.remove(produtoX);
			}else {
				System.out.println("\nProduto não Encontrado!!!");
			}
		System.out.println(estoque);
		break;
		
		case 3:
			leia.nextLine();
			System.out.println("\nDigite o Produto que Deseja Atualizar No Estoque");
			String verifica= leia.nextLine();
			System.out.println("\nDigite o novo Produto");
			String novoProduto = leia.nextLine();
			if (estoque.contains(verifica)) {
				estoque.remove(verifica);
				estoque.add(novoProduto);
			} else {
				System.out.println("\nProduto Não Encontrado!!");
			}
			System.out.println(estoque);
			break;
		case 4:
			leia.nextLine();
			System.out.println("\nTodos Os Produtos do Estoque são: ");
			System.out.println(estoque);
			break;
			default:
				System.out.println("\nEncerrando Sistema..Obrigado!");
			
		}
	} while (op != 0);

}
	
	
}
