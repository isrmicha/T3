import java.util.Scanner;

import javax.swing.JOptionPane;

public class Menu {
	
	
	public void showMenu(){
		
		Cesta c = new Cesta();
		
		while(true){		
			
			Scanner input = new Scanner(System.in);
			
			System.out.print("\nOque deseja fazer?\n\n(Adicionar) Produto\n(Listar) Cesta\n(Limpar) cesta\n");
			String opcao = input.nextLine();
			
			switch(opcao){
				case "Adicionar":
					
					System.out.print("\nTipo do produto?\nBanana, Limao, Maca, Mamao, Morango, Pera, Uva?\n");
					String produto = input.nextLine();
					
					System.out.print("\nQuantidade?\n");
					int qt = input.nextInt();					
					
					c.adicionarItem(produto, qt);
					
					break;	
					
				case "Listar":
					c.listaCesta();		
					
					break;
				case "Limpar":
					
					c.limparCesta();
					
					break;
			}
		
		}
		
		
		
	}
}
