package ex11_pecas_de_xadrez;

public class Bispo extends Peca {
	public Bispo(int linha, int coluna, boolean cor) {
		super(linha, coluna, cor);
	}
	
	@Override
	public boolean mover(int linhaDestino, int colunaDestino) {
		return false;
	}
}







