import javax.swing.JOptionPane;

public class Cesta {
	private int qtProdutos = 0;
	
	Produto[] cesta = new Produto[7];
	
	public void adicionarItem(String tipo, int qtd){
		if( (qtProdutos+qtd) > 12){
			JOptionPane.showMessageDialog(null, "A cesta está cheia!");
			return;
		}else{
			switch (tipo){
				case "Banana":
					if(cesta[0] == null){						
						cesta[0] = new Banana();
						cesta[0].setQtde(qtd);					
						qtProdutos+=qtd;
						break;						
					}else{
						cesta[0].setQtde(qtd);
						break;
					}
				case "Limao":
					if(cesta[1] == null){
						cesta[1] = new Limao();
						cesta[1].setQtde(qtd);
						qtProdutos+=qtd;
						break;
					}else{
						cesta[1].setQtde(qtd);
						break;
					}
				case "Maca":
					if(cesta[2] == null){						
						cesta[2] = new Maca();
						cesta[2].setQtde(qtd);
						qtProdutos+=qtd;
						break;						
					}else{
						cesta[2].setQtde(qtd);
						break;
					}
				case "Mamao":
					if(cesta[3] == null){						
						cesta[3] = new Mamao(); 
						cesta[3].setQtde(qtd);
						qtProdutos+=qtd;
						break;
					}else{
						cesta[3].setQtde(qtd);
						break;
					}
				case "Morango":
					if(cesta[4] == null){						
						cesta[4] = new Morango();
						cesta[4].setQtde(qtd);
						qtProdutos+=qtd;
						break;
					}else{
						cesta[4].setQtde(qtd);
						break;
					}
				case "Pera":
					if(cesta[5] == null){						
						cesta[5] = new Pera();
						cesta[5].setQtde(qtd);
						qtProdutos+=qtd;
						break;
					}else{
						cesta[5].setQtde(qtd);
						break;
					}
				case "Uva":
					if(cesta[6] == null){						
						cesta[6] = new Uva();
						cesta[6].setQtde(qtd);
						qtProdutos+=qtd;
						break;
					}else{
						cesta[6].setQtde(qtd);
						break;
					}
				default:
					System.out.print("Produto inválido");
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

}



