import javax.swing.JOptionPane;

public class Menu {
	
	
	public void showMenu(){
		
		while(true){
			Cesta cesta = new Cesta();
			
			String opcao = JOptionPane.showInputDialog(null, "Oque deseja fazer?\n\n(ADICIONAR) Produto\n(LISTAR) Cesta\n(Limpar) cesta\n");
			
			switch(opcao){
				case "ADICIONAR":
					String produto = JOptionPane.showInputDialog(null,"Tipo do produto?\nBanana, Limao, Maca, Mamao, Morango, Pera, Uva?\n\n");
					int qt = Integer.parseInt(JOptionPane.showInputDialog(null,"Quantidade?"));
					
					cesta.adicionarItem(produto, qt);
					
					break;	
			
			}
		
		}
		
		
		
	}
}
