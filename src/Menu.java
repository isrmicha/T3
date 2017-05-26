import javax.swing.JOptionPane;

public class Menu {
	
	
	public void showMenu(){
		
		Cesta c = new Cesta();
		boolean ficar = true;
		
		while(ficar){		
			String opcao = JOptionPane.showInputDialog(null,"Oque deseja fazer?\n\n(Adicionar) Produto\n(Listar) Cesta\n(Limpar) cesta\n(Sair)\n\n");
			
			switch(opcao){
				case "Adicionar":
					String produto = JOptionPane.showInputDialog(null,"\nTipo do produto?\nBanana, Limao, Maca, Mamao, Morango, Pera, Uva?\n");
					int qt = Integer.parseInt(JOptionPane.showInputDialog(null, "\nQuantidade?\n"));
					c.adicionarItem(produto, qt);
					break;	
				case "Listar":
					c.listaCesta();		
					break;
				case "Limpar":
					c.limparCesta();
					break;
				case "Sair":
					ficar = false;
					break;
				default:
					JOptionPane.showMessageDialog(null, "Opção inválida");
			}
		
		}
		
		
		
	}
}
