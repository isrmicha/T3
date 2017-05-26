public abstract class Produto{
	
	private int qtdeProd=0;
	
	public abstract double getPreco();
	public abstract String getNome();
	
	public void setQtde(int qtde){
		qtdeProd += qtde;
	}
	public int getQtde(){
		return this.qtdeProd;
	}
	
}
