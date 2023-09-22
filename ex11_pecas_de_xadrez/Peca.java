package ex11_pecas_de_xadrez;

public class Peca {
	private int linha;
	private int coluna;
	private boolean cor;
	private int movimentos;
	
	public Peca(int linha, int coluna, boolean cor) {
	   this.linha = linha;
	   this.coluna = coluna;
	   this.cor = cor;
	   this.movimentos = 0;
	}
	
	public int getLinha() {
	   return linha;
	}
	
	public void setLinha(int linha) {
	   this.linha = linha;
	}
	
	public int getColuna() {
	   return coluna;
	}
	
	public void setColuna(int coluna) {
	   this.coluna = coluna;
	}
	
	public boolean isCor() {
	   return cor;
	}
	
	public void setCor(boolean cor) {
	   this.cor = cor;
	}
	
	public int getMovimentos() {
	   return movimentos;
	}
	
	public void setMovimentos(int movimentos) {
	   this.movimentos = movimentos;
	}
	
	public boolean mover(int linhaDestino, int colunaDestino) {
	   return false;
	}
}
