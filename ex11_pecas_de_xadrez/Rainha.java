package ex11_pecas_de_xadrez;

public class Rainha extends Peca {
	public Rainha(int linha, int coluna, boolean cor) {
		super(linha, coluna, cor);
	}
	
	@Override
	public boolean mover(int linhaDestino, int colunaDestino) {
		return false;
	}
}
