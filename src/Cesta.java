import javax.swing.JOptionPane;

public class Cesta {
	private int qtProdutos = 0;
	
	Produto[] cesta = new Produto[7];
	
	public void adicionarItem(String tipo, int qtd){
		if( (qtProdutos+qtd) > 12){
			JOptionPane.showMessageDialog(null, "Exede o tamanho da cesta");
			return;
		}else{
			switch (tipo){
				case "Banana":
					if(cesta[0] == null){						
						cesta[0] = new Banana();
						cesta[0].setQtde(qtd);					
						qtProdutos+=qtd;
						JOptionPane.showMessageDialog(null, "Item adicionado");
						break;						
					}else{
						cesta[0].setQtde(qtd);
						JOptionPane.showMessageDialog(null, "Item adicionado");
						break;
					}
				case "Limao":
					if(cesta[1] == null){
						cesta[1] = new Limao();
						cesta[1].setQtde(qtd);
						qtProdutos+=qtd;
						JOptionPane.showMessageDialog(null, "Item adicionado");
						break;
					}else{
						cesta[1].setQtde(qtd);
						JOptionPane.showMessageDialog(null, "Item adicionado");
						break;
					}
				case "Maca":
					if(cesta[2] == null){						
						cesta[2] = new Maca();
						cesta[2].setQtde(qtd);
						qtProdutos+=qtd;
						JOptionPane.showMessageDialog(null, "Item adicionado");
						break;						
					}else{
						cesta[2].setQtde(qtd);
						JOptionPane.showMessageDialog(null, "Item adicionado");
						break;
					}
				case "Mamao":
					if(cesta[3] == null){						
						cesta[3] = new Mamao(); 
						cesta[3].setQtde(qtd);
						qtProdutos+=qtd;
						JOptionPane.showMessageDialog(null, "Item adicionado");
						break;
					}else{
						cesta[3].setQtde(qtd);
						JOptionPane.showMessageDialog(null, "Item adicionado");
						break;
					}
				case "Morango":
					if(cesta[4] == null){						
						cesta[4] = new Morango();
						cesta[4].setQtde(qtd);
						qtProdutos+=qtd;
						JOptionPane.showMessageDialog(null, "Item adicionado");
						break;
					}else{
						cesta[4].setQtde(qtd);
						JOptionPane.showMessageDialog(null, "Item adicionado");
						break;
					}
				case "Pera":
					if(cesta[5] == null){						
						cesta[5] = new Pera();
						cesta[5].setQtde(qtd);
						qtProdutos+=qtd;
						JOptionPane.showMessageDialog(null, "Item adicionado");
						break;
					}else{
						cesta[5].setQtde(qtd);
						JOptionPane.showMessageDialog(null, "Item adicionado");
						break;
					}
				case "Uva":
					if(cesta[6] == null){						
						cesta[6] = new Uva();
						cesta[6].setQtde(qtd);
						qtProdutos+=qtd;
						JOptionPane.showMessageDialog(null, "Item adicionado");
						break;
					}else{
						cesta[6].setQtde(qtd);
						JOptionPane.showMessageDialog(null, "Item adicionado");
						break;
					}
				default:
					JOptionPane.showMessageDialog(null, "Poduto inválido!");
					break;
			}
		}
	}
	
	public double calcularTotal(){
		
		double total=0;
		
		for(int i = 0; i<cesta.length;i++){
			if(cesta[i] == null){
				continue;
			}else{
				total += cesta[i].getPreco()*cesta[i].getQtde();
			}
		}
		return total;		
	}
	
	public void listaCesta(){
		for(int i = 0; i < cesta.length ; i++){
			if(cesta[i] == null){
				continue;
			}else{
				JOptionPane.showMessageDialog(null, "\nProduto: "+cesta[i].getNome()+"\nQuantidade: "+cesta[i].getQtde()+"\nPreço unitário R$"+cesta[i].getPreco()+"\n");
			}
		}
		
		JOptionPane.showMessageDialog(null, "Valor Total da Cesta R$"+this.calcularTotal());
	}
	
	public void limparCesta(){
		for(int i = 0 ; i < cesta.length ; i++){
			cesta[i] = null;
		}
		Cesta.qtProdutos = 0;
		System.out.print("Cesta vazia! ");
		
	}

}



